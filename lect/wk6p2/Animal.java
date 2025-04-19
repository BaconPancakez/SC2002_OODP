package lect.wk6p2;

public abstract class Animal {
    String name;

    public Animal() {
        name = "Cute";
    }

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeNoise();

}
