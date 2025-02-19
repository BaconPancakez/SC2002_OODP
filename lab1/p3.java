package lab1;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting value in S$: ");
        int start = scanner.nextInt();
        System.out.print("Enter ending value in S$: ");
        int end = scanner.nextInt();
        System.out.print("Enter increment value in S$: ");
        int increment = scanner.nextInt();
        
        if((end < start)||(increment <= 0))
        {
            System.out.println("Error! End value cannot be bigger than start");
            scanner.close();
            return;
        }        
            
        // For loop
        System.out.println("US$         S$");
        System.out.println("--------------");
        for(int n = start; n <= end; n+=increment)
        {
            System.out.printf("%-12d %.2f%n", n, n * 1.82);
        }
        System.out.println();

        // While loop
        System.out.println("US$         S$");
        System.out.println("--------------");
        int i = start;
        while(i < end)
        {
            System.out.printf("%-12d %.1f%n", i, i * 1.82);
            i +=increment;
        }
        System.out.println();

        // do/ while loop
        System.out.println("US$         S$");
        System.out.println("--------------");
        i = start;
        do { 
            System.out.printf("%-12d %.2f%n", i, i * 1.82);
            i += increment;   
        } while (i <= end);

        scanner.close();
    }
}
