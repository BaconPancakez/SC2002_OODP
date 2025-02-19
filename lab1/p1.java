package lab1;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choice: ");
        String choice = scanner.nextLine();

        switch(choice)
        {
            case "a": case "A":
                System.out.println("Action Movie fan");
                break;            
            case "c": case "C":
                System.out.println("Comedy movie fan");
                break;
            case "d": case "D":  
                System.out.println("Drama movie fan");
                break;
            default:
                System.out.println("Invalid Choice");

        }
        scanner.close();
    }

}
