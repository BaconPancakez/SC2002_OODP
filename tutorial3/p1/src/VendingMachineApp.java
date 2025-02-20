package tutorial3.p1.src;

public class VendingMachineApp {
    public static void main(String[] args) {
        double drinkCost = 0;
        double amountInserted = 0.0;
    
        VendingMachine vendingMachine = new VendingMachine();
        drinkCost = vendingMachine.selectDrink();
        amountInserted = vendingMachine.insertCoins(drinkCost);
        vendingMachine.checkChange(amountInserted, drinkCost);
        vendingMachine.printReceipt();
    }
}
