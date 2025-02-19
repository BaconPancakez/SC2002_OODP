package tutorial2.Dice.src;

public class OtherDice extends Dice{

    private static int total = 0;

    public OtherDice(int numOfFace){
        setDiceValue(numOfFace);
    }

    public void setDiceValue(int face){
        valueOfDice = (int)(Math.random() * face) + 1;
        total = total + valueOfDice;
    }

    public static int getTotal()
    {
        return total;   
    }
}
