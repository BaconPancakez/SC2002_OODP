package lab4.p2.src;

import java.util.Scanner;

import lab4.p2.src.Shape.Cone;
import lab4.p2.src.Shape.Cubiod;
import lab4.p2.src.Shape.Cylinder;
import lab4.p2.src.Shape.Pyramid;
import lab4.p2.src.Shape.Shape;
import lab4.p2.src.Shape.Sphere;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfShapes = 0;
        int shapeSel = 0;

        System.out.println("Enter the total number of shapes");
        noOfShapes = sc.nextInt();

        Shape[] shapes = new Shape[noOfShapes];

        for(int i = 0; i < noOfShapes; i++)
        {
            System.out.println("1.Sphere\n2.Cuboid\n3.Pyramid\n4.Cone\n5.Cylinder");
            shapeSel = sc.nextInt();
            switch (shapeSel) {
                case 1:
                    System.out.println("length: ");
                    int length = sc.nextInt();
                    shapes[i] = new Sphere(length);
                    break;
                case 2:
                    System.out.println("length: ");
                    length = sc.nextInt();
                    System.out.println("Breadth: ");
                    int breadth = sc.nextInt();
                    shapes[i] = new Cubiod(length, breadth);
                    break;
                case 3:
                    System.out.println("Height: ");
                    int height = sc.nextInt();
                    System.out.println("Breadth: ");
                    int base = sc.nextInt();
                    shapes[i] = new Pyramid(height, base);
                    break;
                case 4:
                    System.out.println("Height: ");
                    height = sc.nextInt();
                    System.out.println("Radius: ");
                    base = sc.nextInt();
                    shapes[i] = new Cone(height, base);
                    break;
                case 5:
                    System.out.println("Height: ");
                    height = sc.nextInt();
                    System.out.println("Radius: ");
                    base = sc.nextInt();
                    shapes[i] = new Cylinder(height, base);
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
