package tutorial2.Dice.src;

import java.util.Scanner;

public class DiceApp
{
    public static void main(String[] args)
    {
        int numOfDice ,roll ,numOfFace;
        
        Scanner sc = new Scanner(System.in);
        numOfDice = getNumOfDice(sc);

        for(int i = 1; i <= numOfDice; i++)
        {
            System.out.println("Press <key> to roll the dice "+ i);
            sc.nextLine();
            numOfFace = getDiceFace(sc);
            OtherDice d1 = new OtherDice(numOfFace);
            roll = d1.getDiceValue();
            d1.printDiceValue();
            System.out.println("");
        }
        
        System.out.println("Your total number is: " + OtherDice.getTotal());
    }

    private static int getNumOfDice(Scanner scanner)
    {
        int numOfDice;
        while(true)
        {
            System.out.println("How many dices? (1 to 10)");
            numOfDice = scanner.nextInt();
            if(numOfDice >= 1 && numOfDice <= 10)
            {
                return numOfDice;
            }
            else
            {
                System.out.println("Invalid Input");
            }
        }
    }

    private static int getDiceFace(Scanner scanner)
    {
        int diceFace = -1;
        while(diceFace == -1){
            System.out.println("Insert number of face (4/ 6/ 8/ 10/ 12/ 16/ 20/ 100)");
            diceFace = checkDiceFace(scanner.nextInt());
            if(diceFace == -1)
            {
                System.out.println("Invalid");
            }
        }
        return diceFace;
    }

    private static int checkDiceFace(int numOfFace)
    {        
        switch (numOfFace) {
            case 4:
                return numOfFace;
            case 6:
                return numOfFace;
            case 8:
                return numOfFace;
            case 10:
                return numOfFace;
            case 12:
                return numOfFace;
            case 16:
                return numOfFace;
            case 20:
                return numOfFace;
            case 100:
                return numOfFace;
            default:
                return -1;
        }
    }
}