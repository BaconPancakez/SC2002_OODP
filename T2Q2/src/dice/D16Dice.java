package T2Q2.src.dice;

public class D16Dice implements Dice {
    private static final int FACE = 16;
    private int valueOfDice = 1;

    public D16Dice()
    {
        setDiceValue(FACE);
    }

    public void setDiceValue(int face)
    {
        valueOfDice = (int)( Math.random() * face) + 1;
    }

    public int getDiceValue()
    {
        return valueOfDice;
    }

    public void printDiceValue()
    {
        System.out.println("Current Value is " + valueOfDice);
    }
}
