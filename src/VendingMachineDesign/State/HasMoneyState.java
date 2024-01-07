package VendingMachineDesign.State;

import VendingMachineDesign.Entity.Item;
import VendingMachineDesign.Enum.Coin;
import VendingMachineDesign.VendingMachine;

import java.util.List;

public class HasMoneyState implements  State {


    public HasMoneyState() {
        System.out.println("Currently in Has Money State");
    }

    @Override
    public void clickOnInsertCashButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Cannot click on insert cash button in Has Money State ");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {

        System.out.println("Inserting coin with a value:" + coin.getValue());
        List<Coin> coins = vendingMachine.getCoinList();
        coins.add(coin);
        vendingMachine.setCoinList(coins);

    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception {

        System.out.println("Moving to Product Selection ");
        vendingMachine.setState(new SelectionState());

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("Cannot choose product in Has Money State ");

    }

    @Override
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setState(new IdleState());
        return vendingMachine.getCoinList();
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
       throw new Exception("Cannot return change in Has Money State ");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("Cannot dispense product in Has Money State ");
    }
}
