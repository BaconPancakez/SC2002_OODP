package tutorial2.Circle.src;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Circle circle = null;
        int options;
        Scanner scanner = new Scanner(System.in);
        printMenu();
        do { 
            options = scanner.nextInt();
            if(options == 1) circle = createCircle(scanner);
            else if(options == 2) printArea(circle);
            else if(options == 3) printCircumference(circle);
        } while (options < 4);
        System.out.println("THank you!!");

    }
    private static void printCircumference(Circle circle){
        if(circle == null) System.out.println("Create a circle first");
        else circle.printCircumference();
    }

    private static void printArea(Circle circle){
        if(circle == null) System.out.println("Create a circle first");
        else circle.printArea();
    }

    private static Circle createCircle(Scanner scanner)
    {
        Circle circle;
        System.out.println("Enter the radius to compute the area and circumference");
        double radius = scanner.nextDouble();
        circle = new Circle(radius);
        System.out.println("A new circle is created");
        return circle;
    }

    private static void printMenu(){
        System.out.println("==== Circle Computation =====");
        System.out.println("|1. Create a new circle     |");
        System.out.println("|2. Print Area              |");
        System.out.println("|3. Print circumference     |");
        System.out.println("|4. Quit                    |");
        System.out.println("=============================");

    }
}
