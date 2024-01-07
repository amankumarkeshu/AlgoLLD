package VendingMachineDesign.State;

import VendingMachineDesign.Entity.Item;
import VendingMachineDesign.Enum.Coin;
import VendingMachineDesign.VendingMachine;

import java.util.List;

public interface State {

    public void clickOnInsertCashButton(VendingMachine vendingMachine) throws Exception ;

    public void insertCoin( VendingMachine vendingMachine, Coin coins) throws Exception;

    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception;

    public void chooseProduct(VendingMachine vendingMachine, int productCode)throws Exception;

    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception;

    public int getChange(int returnChangeMoney) throws Exception;
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception;



}
