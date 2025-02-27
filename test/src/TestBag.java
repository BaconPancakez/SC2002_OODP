package test.src;

public class TestBag {
    public static void main(String[] args) {
        SchoolBag justinBag = new SchoolBag("orange", 15);
        justinBag.load(11);
        justinBag.load(6);

        SchoolBag tomBag = new SchoolBag("orange", 15);
        tomBag.load(11);
        tomBag.load(6);
    }
}
