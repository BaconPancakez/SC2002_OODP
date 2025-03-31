package lab4.p1.src;

import java.util.Scanner;

public class Strings {
    // --------------------------------------------
    // Reads in an array of integers, sorts them,
    // then prints them in sorted order.
    // --------------------------------------------
    public static void main (String[] args)
    {
        String[] strList; // Change from Int to Integer -> Implement a object wrapper
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many string do you want to sort? ");
        size = scan.nextInt();
        scan.nextLine();
        strList = new String[size];
        System.out.println ("\nEnter the string...");
        for (int i = 0; i < size; i++)
            strList[i] = scan.nextLine();
            //Sorting.selectionSort(strList);
            Sorting.insertionSort(strList);
            System.out.println ("\nYour string in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(strList[i] + " ");
        System.out.println ();
	} 
}
