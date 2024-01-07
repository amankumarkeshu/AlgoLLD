package VendingMachineDesign.State;

import VendingMachineDesign.Entity.Item;
import VendingMachineDesign.Enum.Coin;
import VendingMachineDesign.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements  State{

    public IdleState() {
        System.out.println("Currently the machine is at IdleState");
    }

    public IdleState(VendingMachine vendingMachine) {
        System.out.println("Currently the machine is at IdleState");
        vendingMachine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCashButton(VendingMachine vendingMachine) throws Exception {

        System.out.println("Currently Vending machine is at IdleState");
        vendingMachine.setState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coins) throws Exception {
        throw new Exception("Cannot insert coin at idle state");
    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Cannot click on product selection button at idle state");

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("Cannot Choose product at idle state");

    }

    @Override
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Cannot refund money at idle state");

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Cannot return change at idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("Cannot dispense product at idle state");
    }
}
