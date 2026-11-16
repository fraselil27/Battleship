//Lily Fraser
//APCSA
//Ship.java

import java.util.Scanner;

public class Ships
{
    //need to figure out how to input player1 and player2's boards into this
    //writing code assuming we can get the boards inside of this
    Scanner scan = new Scanner(System.in);
    int lenShip[] = {2, 3, 3, 4, 5};
    String nameShips[] = {"Destroyer", "Submarine", "Cruiser", "Battleship", "Aircraft Carrier"};
    
    boolean horizontal[5];

    int response = 0;

    public Ships()
    {
        for(int i = 1; i < 3; i++)
        {
            System.out.println("Player " + i + ", it is time for you to place your ships.");

            for(int j = 1; j < 6; j++)
            {
                while(response == 0 || response == 1)
                {
                    System.out.println("You will now be placing your " + nameShips[1] + ". Would you like this ship to be horizontal? If so, enter 0. If not, enter 1.");
                    response = scan.nextInt();
	                String buffer = scan.nextLine();
                }

                if(response == 0)
                {
                    //code for horizontal configuration and set array values to taken and indicate which ship they are in the array
                }

                if(response == 1)
                {
                    //basically same code but for vertical configuration
                }
            }
        }

        //need to return updated board

    }
    
}