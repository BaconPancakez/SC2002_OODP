package lab4.p2;

public class Rectangle implements Shape{
    private int length,breadth;

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
