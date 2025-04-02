package lab4.p2.src;

import java.util.Scanner;

import lab4.p2.src.Shape.Circle;
import lab4.p2.src.Shape.Rectangle;
import lab4.p2.src.Shape.Shape;
import lab4.p2.src.Shape.Square;
import lab4.p2.src.Shape.Triangle;

public class Shape2DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfShapes = 0;
        int shapeSel = 0;

        System.out.println("Enter the total number of shapes");
        noOfShapes = sc.nextInt();

        Shape[] shapes = new Shape[noOfShapes];

        for(int i = 0; i < noOfShapes; i++)
        {
            System.out.println("1.Square\n2.Rectangle\n3.Circle\n4.Triangle");
            shapeSel = sc.nextInt();
            switch (shapeSel) {
                case 1:
                    System.out.println("length: ");
                    int length = sc.nextInt();
                    shapes[i] = new Square(length);
                    break;
                case 2:
                    System.out.println("length: ");
                    length = sc.nextInt();
                    System.out.println("Breadth: ");
                    int breadth = sc.nextInt();
                    shapes[i] = new Rectangle(length, breadth);
                    break;
                case 3:
                    System.out.println("Radius: ");
                    int radius = sc.nextInt();
                    shapes[i] = new Circle(radius);
                    break;
                case 4:
                    System.out.println("Height: ");
                    int height = sc.nextInt();
                    System.out.println("Base: ");
                    int base = sc.nextInt();
                    shapes[i] = new Triangle(height, base);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }

        double TotalArea = 0;
        for(int j = 0; j < noOfShapes ; j++)
        {
            TotalArea += shapes[j].area();
        }

        System.out.printf("Total Area %.2f\n",TotalArea);
    }
}
