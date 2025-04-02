package lab4.p2.src.Shape;

public class Circle implements Shape{
    private static final double PI = 3.14159;
    protected int radius; 

    public Circle(int r)
    {
        this.radius = r;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }
}
