package lab4.p2.src.Shape;

public class Cylinder extends Rectangle{
    private static final double PI = 3.14159;

    public Cylinder(int l, int b)
    {
        super(l, b);
    }

    @Override
    public double area(){
        return  2*PI*super.area() + 2 * PI * super.breadth * super.breadth;
    }
}
