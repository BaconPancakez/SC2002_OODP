package T2Q2.src;

import java.util.Scanner;
import T2Q2.src.dice.*;

public class DiceApp {
    public static void main(String[] args) {
        int numOfDice, diceValue, roll = 0;

        Scanner sc = new Scanner(System.in); 
        numOfDice = getNumOfDice(sc);

        for (int i = 1; i <= numOfDice; i++) {
            System.out.println("Press <key> to roll the dice " + i);
            sc.nextLine();
            diceValue = getDiceFace(sc);

            roll = roll +  checkDiceFace(diceValue);
        }
        System.out.println("\nTotal is " + roll);
    }

    private static int getNumOfDice(Scanner scanner) {
        int numOfDice;
        while (true) {
            System.out.println("How many dices? (1 to 10)");
            numOfDice = scanner.nextInt();
            scanner.nextLine();
            if (numOfDice >= 1 && numOfDice <= 10) {
                return numOfDice;
            } else {
                System.out.println("Invalid Input");
            }
        }
    }

    private static int getDiceFace(Scanner scanner) {
        int diceFace = -1;
        while (diceFace == -1) {
            System.out.println("Insert number of face (4/ 6/ 8/ 10/ 12/ 16/ 20/ 100)");
            diceFace = scanner.nextInt();

            if (diceFace == 4 || diceFace == 6 || diceFace == 8 || diceFace == 10 ||
            diceFace == 12 || diceFace == 16 || diceFace == 20 || diceFace == 100) {
                return diceFace; 
            } else {
                System.out.println("Invalid input. Please enter a valid dice face.");
            }
        }
        return diceFace;
    }

    private static int checkDiceFace(int numOfFace) {
        switch (numOfFace) {
            case 4:
                D4Dice D4 = new D4Dice();
                D4.printDiceValue();
                return D4.getDiceValue();
            case 6:
                D6Dice D6 = new D6Dice();
                D6.printDiceValue();
                return D6.getDiceValue();
            case 8:
                D8Dice D8 = new D8Dice();
                D8.printDiceValue();
                return D8.getDiceValue();
            case 10:
                D10Dice D10 = new D10Dice();
                D10.printDiceValue();
                return D10.getDiceValue();
            case 12:
                D12Dice D12 = new D12Dice();
                D12.printDiceValue();
                return D12.getDiceValue();
            case 16:
                D16Dice D16 = new D16Dice();
                D16.printDiceValue();
                return D16.getDiceValue();
            case 20:
                D20Dice D20 = new D20Dice();
                D20.printDiceValue();
                return D20.getDiceValue();
            case 100:
                D100Dice D100 = new D100Dice();
                D100.printDiceValue();
                return D100.getDiceValue();
            default:
                return 0;
        }
    }
}
