package VendingMachineDesign.Entity;

public class ItemShelf {

   int code;

    public ItemShelf(int code) {
        this.code = code;
    }

    Item item;

   boolean isAvailable;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}




//101 - Coke,  102- Coke , 103- Coke
//104 - Pepsi ,