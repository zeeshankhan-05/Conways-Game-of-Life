public class GameOfLife
{
    public static void main( String[] args )
    {
        Board Monopoly = new Board(6, 6);
        // Base case
        Monopoly.printBoard();
        System.out.println();
        System.out.println();
        System.out.println();
        Monopoly.changeBoard();
        System.out.println();
        System.out.println();
        System.out.println();

        // First iteration
        Monopoly.printBoard();
        System.out.println();
        System.out.println();
        System.out.println();
        Monopoly.changeBoard();
        System.out.println();
        System.out.println();
        System.out.println();

        // Second iteration
        Monopoly.printBoard();
        System.out.println();
        System.out.println();
        System.out.println();
        Monopoly.changeBoard();
        System.out.println();
        System.out.println();
        System.out.println();

        // Third iteration
        Monopoly.printBoard();
        System.out.println();
        System.out.println();
        System.out.println();
        Monopoly.changeBoard();
        System.out.println();
        System.out.println();
        System.out.println();

        // Fourth iteration
        Monopoly.printBoard();
        System.out.println();
        System.out.println();
        System.out.println();
        Monopoly.changeBoard();
        System.out.println();
        System.out.println();
        System.out.println();

        // Fifth iteration
        Monopoly.printBoard();
        System.out.println();
        System.out.println();
        System.out.println();
        Monopoly.changeBoard();
        System.out.println();
        System.out.println();
        System.out.println();

        // Sixth iteration
        Monopoly.printBoard();
    }

    // Calling this method will clear the console window, wiping away 
    // any text that has been printed up that point
    public static void clearConsole() 
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Pauses the execution of your program by the
    // provided number of milliseconds
    public static void pause( int time )
    {
        try { Thread.sleep( time ); } catch(Exception e) {}
    }
}