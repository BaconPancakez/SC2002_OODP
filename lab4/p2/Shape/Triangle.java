package lab4.p2.Shape;

public class Triangle implements Shape{
    protected int height,base;

    public Triangle(int h, int b)
    {
        this.height = h;
        this.base = b;
    }

    @Override
    public double area(){
        return  0.5*height * base;
    }
}
