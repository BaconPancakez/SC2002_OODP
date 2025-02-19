package tutorial2.Dice.src;

public class Dice {
    protected  int valueOfDice;

    public Dice(){
        setDiceValue();
    }

    public void setDiceValue(){
        valueOfDice = (int)(Math.random() * 6) + 1;
    }

    public int getDiceValue(){
        return valueOfDice;
    }

    public void printDiceValue(){
        System.out.println("Current value is "+ valueOfDice);
    }
}
