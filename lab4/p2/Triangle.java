package lab4.p2;

public class Triangle implements Shape{
    private int length,breadth;

    public Triangle(int l, int b)
    {
        this.length = l;
        this.breadth = b;
    }

    @Override
    public double area(){
        return  0.5*length * breadth;
    }
}
