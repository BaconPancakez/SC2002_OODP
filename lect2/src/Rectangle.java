package lect2.src;

public class Rectangle {
    private double width = 10;
    private double height = 20;

    public Rectangle(){
        System.out.print("default: ");
    }

    public Rectangle(double w, double h){
        System.out.print("Double: ");
        width = w;
        height = h;
    }

    public Rectangle(int w, int h){
        System.out.print("int: ");
        width = w;
        height = h;
    }

    public double findArea(){
        return width * height;
    }

}

