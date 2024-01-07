package VendingMachineDesign.State;

import VendingMachineDesign.Entity.Item;
import VendingMachineDesign.Enum.Coin;
import VendingMachineDesign.VendingMachine;

import java.util.List;

public class DispenseState implements State{
    public DispenseState(VendingMachine vendingMachine , int code) throws Exception{

        Item item = dispenseProduct(vendingMachine, code);
    }

    @Override
    public void clickOnInsertCashButton(VendingMachine vendingMachine) throws Exception {

        throw new Exception("We cannot click on insert cash button on Dispense State");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coins) throws Exception {
        throw new Exception("We cannot click on insert cash button on Dispense State");

    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("We cannot click on insert cash button on Dispense State");

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("We cannot click on insert cash button on Dispense State");

    }

    @Override
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("We cannot click on insert cash button on Dispense State");

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("We cannot click on insert cash button on Dispense State");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {

        System.out.println("Dispensing product with code : " + code);

        Item item  = vendingMachine.getInventory().getItem(code);
        vendingMachine.setState(new IdleState());
        return item;
    }
}
