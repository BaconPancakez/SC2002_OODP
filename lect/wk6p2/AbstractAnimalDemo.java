package lect.wk6p2;

public class AbstractAnimalDemo {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        System.out.println(a1.name);
        a1.makeNoise();
    }
}
