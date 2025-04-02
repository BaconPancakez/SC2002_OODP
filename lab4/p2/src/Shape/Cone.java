package lab4.p2.src.Shape;

public class Cone extends Triangle{
    private static final double PI = 3.14159;

    public Cone(int h, int b)
    {
        super(h, b);
    }

    @Override
    public double area() {
        return PI * super.base * (super.base + Math.sqrt((super.base * super.base) + (super.height * super.height)));
    }
}
