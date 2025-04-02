package lab4.p2.Shape;

public class Sphere extends Circle{
    private static final double PI = 3.14159;

    public Sphere(int r)
    {
        super(r);
    }

    @Override
    public double area() {
        return 4 * PI * super.radius * super.radius;
    }
}
