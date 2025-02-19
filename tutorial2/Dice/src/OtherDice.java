package tutorial2.Dice.src;

public class OtherDice implements Dice {
    private int valueOfDice;
    private static int total = 0;

    public OtherDice(int numOfFace) {
        setDiceValue(numOfFace);
    }

    public void setDiceValue(int face) {
        valueOfDice = (int) (Math.random() * face) + 1;
        total += valueOfDice;
    }

    public int getDiceValue() {
        return valueOfDice;
    }

    public void printDiceValue() {
        System.out.println("Current value is " + valueOfDice);
    }

    public static int getTotal() {
        return total;
    }

}
