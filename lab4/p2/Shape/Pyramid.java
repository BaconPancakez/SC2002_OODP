package lab4.p2.Shape;

public class Pyramid extends Triangle{
    public Pyramid(int h, int b)
    {
        super(h, b);
    }

    @Override
    public double area() {
        return super.base * super.base * 4 * super.area();
    }}
