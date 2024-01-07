package VendingMachineDesign.Entity;

public class Inventory {

    ItemShelf[] inventory;

    int startCode = 101;
    public Inventory(int count) {
        this.inventory = new ItemShelf[10];

        for (int index = 0; index < inventory.length; index++ ) {
            ItemShelf itemShelf = new ItemShelf(startCode);
            itemShelf.setAvailable(false);
            inventory[index] = itemShelf;
            startCode++;
        }

    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public Item getItem(int code) throws Exception {
        for(ItemShelf itemShelf: inventory ) {
            if (itemShelf.getCode() == code) {
                if (itemShelf.isAvailable() ) {
                    return itemShelf.getItem();
                } else {
                    throw new Exception("Item already sold out" );

                }
            }
        }
        throw new Exception("Invalid item code");
    }
}
