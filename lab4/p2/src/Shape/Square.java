package lab4.p2.src.Shape;

public class Square implements Shape{
    private int length;

    public Square(int l)
    {
        this.length = l;
    }

    @Override
    public double area(){
        return  length * length;
    }
}
