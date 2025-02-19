package lab1;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Height: ");
        int Height = scanner.nextInt();

        if (Height <= 0){
            System.out.println("Error input!");
        }
        for(int i = 1; i <= Height; i++)
        {
            for(int j = i; 0 < j; j--)
            {
                if((j % 2) == 0) 
                    System.out.print("BB");
                else // if((j % 2) != 0) 
                    System.out.print("AA");
            }
            System.out.println();
        }
        scanner.close();
    }
    // Height = 2 
    // i = 1, j = 1 - AA 
    // i = 2, j = 2 -> BB, j = 2 - 1 = 1 -> AA
    // AA
    // BBAA
}
