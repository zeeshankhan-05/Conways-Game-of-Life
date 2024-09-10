public class Board {

    private String[][] grid;

    public Board (int rows, int columns) {
        grid = new String[rows][columns];
        for (int r = 0; r < rows; r++) {    
            for (int c = 0; c < columns; c++) {
                grid[r][c] = " ";
            }
        }

        grid[1][2] = "*";
        grid[2][3] = "*";
        grid[3][1] = "*";
        grid[3][2] = "*";
        grid[3][3] = "*";
    }

    public String[][] getBoard() {
        return grid;
    }

    public void printBoard() {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                System.out.print("|" + grid[r][c] + "");
            }
            System.out.println("|");
            if (r != grid.length - 1) {
                System.out.println("-------------");
            }
        }
    }

    public int countNeighbors(int row, int column) {
        int count = 0;
        // Checking squares in row-major order
        if (row > 0 && column > 0 && grid[row - 1][column - 1] != null && grid[row - 1][column - 1].equals("*")) {
            count++;
        }
        if (row > 0 && grid[row - 1][column] != null && grid[row - 1][column].equals("*")) {
            count++;
        }
        if (row > 0 && column < grid[0].length - 1 && grid[row - 1][column + 1] != null && grid[row - 1][column + 1].equals("*")) {
            count++;
        }    
        if (column > 0 && grid[row][column - 1] != null && grid[row][column - 1].equals("*")) {
            count++;
        }    
        if (column < grid[0].length - 1 && grid[row][column + 1] != null && grid[row][column + 1].equals("*")) {
            count++;
        }
        if (row < grid.length - 1 && column > 0 && grid[row + 1][column - 1] != null && grid[row + 1][column - 1].equals("*")) {
            count++;
        }
        if (row < grid.length - 1 && grid[row + 1][column] != null && grid[row + 1][column].equals("*")) {
            count++;
        }
        if (row < grid.length - 1 && column < grid[0].length - 1 && grid[row + 1][column + 1] != null && grid[row + 1][column + 1].equals("*")) {
            count++;
        }
        return count;
    }
        
    public void printNeighbors() {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                System.out.print("|" + countNeighbors(r, c));
            } 
            System.out.println("|");
            if (r != grid.length - 1) {
                System.out.println("-------------");
            }
        }
    }

    public void changeBoard() {
        String[][] newGrid = new String[grid.length][grid[0].length];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == "*") {
                    if (countNeighbors(r, c) < 2 || countNeighbors(r, c) > 3) { // Dies to loneliness or overcrowding
                        newGrid[r][c] = " ";
                    } else {
                        newGrid[r][c] = "*";
                    }
                } else {
                    if (countNeighbors(r, c) == 3) { // 3 means new cell is born
                        newGrid[r][c] = "*";
                    } else {
                        newGrid[r][c] = " ";
                    }
                }
            }
        }
        grid = newGrid;
    }
}