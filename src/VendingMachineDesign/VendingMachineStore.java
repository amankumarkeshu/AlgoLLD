package VendingMachineDesign;

import VendingMachineDesign.Entity.Item;
import VendingMachineDesign.Entity.ItemShelf;
import VendingMachineDesign.Enum.Coin;
import VendingMachineDesign.Enum.ItemType;
import VendingMachineDesign.State.State;

public class VendingMachineStore {

    public static void main(String args[]) {


        VendingMachine vendingMachine = new VendingMachine();

        populateVendingMachine(vendingMachine);

        displayInventory(vendingMachine);

        try {

            State vendingMachineState = vendingMachine.getState();
            System.out.println("Click on Insert coin button");

            vendingMachineState.clickOnInsertCashButton(vendingMachine);

            System.out.println("Inserting coins to vending Machine");

            vendingMachineState = vendingMachine.getState();
            vendingMachineState.insertCoin(vendingMachine, Coin.FIVE);
            vendingMachineState.insertCoin(vendingMachine, Coin.TEN);

            System.out.println("State of vending machine" + vendingMachine.getState());

            vendingMachineState = vendingMachine.getState();

            System.out.println("CLick on Choose product button");
            vendingMachineState.clickOnProductSelectionButton(vendingMachine);

            vendingMachineState = vendingMachine.getState();

            vendingMachineState.chooseProduct(vendingMachine, 102);

            displayInventory(vendingMachine);


        } catch (Exception e) {
            e.getMessage();
            displayInventory(vendingMachine);

        }
    }

    private static void populateVendingMachine(VendingMachine vendingMachine) {

        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        int startCode = 101;
        for ( int index = 0 ; index < slots.length; index++ ) {
            Item item = new Item();

            if (index >= 0 && index < 4) {
                item.setItemType(ItemType.PEPSI);
                item.setPrice(8);
            } else  if (index >= 4 && index < 8) {
                item.setItemType(ItemType.LAYS);
                item.setPrice(10);
            }  else  if (index >= 8 && index < 10) {
                item.setItemType(ItemType.COKE);
                item.setPrice(5);
            }
            slots[index].setCode(startCode);
            slots[index].setItem(item);
            slots[index].setAvailable(true);
            startCode++;
        }
    }


    private static void displayInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();

        for ( int index = 0 ;index < slots.length; index++ ) {

            System.out.println("Code NUmber : " + slots[index].getCode() +
                    " Item : " + slots[index].getItem().getItemType().name() +
                     " Price : " + slots[index].getItem().getPrice() +
                    " IsAvailable: " + slots[index].isAvailable()

            );
        }
    }


}
