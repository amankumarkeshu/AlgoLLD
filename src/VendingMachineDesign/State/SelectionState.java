package VendingMachineDesign.State;

import VendingMachineDesign.Entity.Item;
import VendingMachineDesign.Entity.ItemShelf;
import VendingMachineDesign.Enum.Coin;
import VendingMachineDesign.VendingMachine;

import java.util.List;

public class SelectionState implements  State{

    public SelectionState() {
        System.out.println("Currently in Selection State");
    }

    @Override
    public void clickOnInsertCashButton(VendingMachine vendingMachine) throws Exception {

        throw new Exception("Cannot click on Insert cash");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coins) throws Exception {
        throw new Exception("Cannot insert cash on Insert cash");

    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Cannot click on Product Selection button");

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode) throws Exception {

        ItemShelf[] slots = vendingMachine.getInventory().getInventory();



        List<Coin> coinList = vendingMachine.getCoinList();

        int totalMoneyAvailable = 0;

        for(Coin coin: coinList) {
            totalMoneyAvailable += coin.getValue();
        }

        for (int index = 0; index < slots.length; index++ ) {
            if(slots[index].getCode() == productCode) {
                if (slots[index].isAvailable()) {

                    if (totalMoneyAvailable > slots[index].getItem().getPrice()) {
                        slots[index].setAvailable(false);
                        getChange(totalMoneyAvailable - slots[index].getItem().getPrice());
                        vendingMachine.setState(new DispenseState(vendingMachine, productCode));
                    } else {
                        System.out.println("Money in sufficient");
                        refundMoney(vendingMachine);
                        throw new Exception("Money Insuffienct");
                    }
                } else {
                    System.out.println("Product is not available");
                    refundMoney(vendingMachine);
                    throw new Exception("Product is not available");

                }
            }
        }

    }

    @Override
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Money refunded back to cash dispenser");
        vendingMachine.setState(new IdleState());
        return vendingMachine.getCoinList();
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Changed money returned back to cash dispenser = "  + returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("Cannot Dispense Product on Selection State");

    }
}
