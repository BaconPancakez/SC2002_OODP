package lab4.p2.Shape;

public class Cubiod extends Rectangle{
    public Cubiod(int l, int b)
    {
        super(l, b);
    }

    @Override
    public double area(){
        return  super.breadth * super.breadth * 2 * super.area() * 4;
    }
}
