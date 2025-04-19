package lect.wk6p5;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        a1.makeNoise();

        Cat a2 = (Cat) a1;
        a2.makeNoise();
        a2.catchMice();
    }
}
