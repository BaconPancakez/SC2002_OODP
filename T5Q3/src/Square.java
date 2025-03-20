public class Square extends Polygon{
    public Square(String theName, float theLength) {
        super(theName, theLength, theLength) ;
        this.polytype = KindofPolygon.POLY_RECT;
    }

    public float calArea() {
        return width * height;
    }
}
