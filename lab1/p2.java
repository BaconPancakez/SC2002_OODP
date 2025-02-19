package lab1;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Salary: ");
        int salary = scanner.nextInt();
        System.out.print("Merit: ");
        int merit = scanner.nextInt();

        String grade = "";
        
        if ((salary >= 700) && (salary <= 899)) {
            if(merit < 20)
            {
                grade = "B";
            }
            else
                grade = "A";
        }
        else if ((salary >= 600) && (salary <= 799)) {
            if(merit >= 10)
            {
                grade = "B";
            }
            else
                grade = "C";
        }
        else if ((salary >= 500) && (salary <= 649)){
            if(merit >10)
            {
                grade = "B";
            }
            else
                grade = "C";
        }

        System.out.println("Grade: " + grade);
        scanner.close();
    }


}
