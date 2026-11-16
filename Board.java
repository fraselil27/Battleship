//Lily Fraser
//Board.java

public class Board
{
    //initializing variables
    int length = 10;
    String board1[][];
    String board2[][];
    int lenBoard = 10; 
    String board1[][] = new board1[10][10];
    String board2[][] = new board2[10][10];
    
    //Board constructor that fills the board with dashes to start the game
    public Board(String bboard1[][], String bboard2[][])
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                board1[i][j] = "-";
                board2[i][j] = "-";
            }
        }
    }
    //toString prints out the board
    public String toString()
    {
        for(int a = 0; a < 2; a++)
        {
            int temp = a + 1;
            System.out.println("Board "+ temp +":");
            System.out.println(" ABCDEFGHIJ")

             for(int k = 0; k < 10; k++)
            {
                System.out.print(k);
                for(int l = 0; l < 10; l++)
                {
                    System.out.print(board1[i][j])
                }
                System.out.print(/n);
            }
            System.out.print(/n);
            System.out.print(/n);
        }
    }