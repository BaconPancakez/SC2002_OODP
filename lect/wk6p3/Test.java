package lect.wk6p3;

public class Test {
    public static void main(String[] args) {
        Call(new Dog());
        Call(new Animal());
    }

    public static void Call(Animal animal) {
        animal.makeNoise();
    }
}
