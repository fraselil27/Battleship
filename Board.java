//Lily Fraser
//Board.java

public class Board
{
    public static void main(String[] args)
    {
        int lenBoard = 10;
    int Board[][] = new Board[10][10];

    for(int i = 0; i < 10; i++)
    {
        for(int j = 0; j < 10; j++)
        {
           Board[i][j] = i; 
        }
    }

    System.out.print(Board[2][4]);
    }

}