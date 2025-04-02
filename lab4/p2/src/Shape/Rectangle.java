package lab4.p2.src.Shape;

public class Rectangle implements Shape{
    protected int length,breadth;

    public Rectangle(int l, int b)
    {
        this.length = l;
        this.breadth = b;
    }

    @Override
    public double area(){
        return  length * breadth;
    }
}
