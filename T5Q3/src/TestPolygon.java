public class TestPolygon {
    public static void printArea(Rectangle rect) {
        float area = rect.calArea();
        System.out.println("The area of the " + rect.getPolytype() + " is " + area);
    }

    public static void printArea(Triangle tri) {
        float area = tri.calArea();
        System.out.println("The area of the " + tri.getPolytype() + " is " + area);
    }

    public static void printArea(Square squ) {
        float area = squ.calArea();
        System.out.println("The area of the " + squ.getPolytype() + " is " + area);
    }
    public static void main(String[] args ) {

        Rectangle rect = new Rectangle("Rectangle", 3.0f, 4.0f);
        printArea(rect);  // static binding
        rect.printWidthHeight();

        Triangle triangle= new Triangle("Triangle", 3.0f, 4.0f);
        printArea(triangle); // static binding
        triangle.printWidthHeight();

        Square square = new Square("Square",3.0f);
        printArea(square);
        square.printWidthHeight();
    }








































    public static void printArea(Polygon poly) {
        float area = poly.calArea( );
        System.out.println("The area of the " + poly.getPolytype()  + " is " + area);
    }

    public static void main2(String[] args ) {

        Rectangle rect = new Rectangle("Rectangle", 3.0f, 4.0f);
        printArea(rect); // dynamic binding
        rect.printWidthHeight();

        Triangle triangle= new Triangle("Triangle", 3.0f, 4.0f);
        printArea(triangle); // dynamic binding
        triangle.printWidthHeight();
    }
}