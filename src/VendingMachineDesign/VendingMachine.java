package VendingMachineDesign;

import VendingMachineDesign.Entity.Inventory;
import VendingMachineDesign.Enum.Coin;
import VendingMachineDesign.State.IdleState;
import VendingMachineDesign.State.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    List<Coin> coinList;

    State state;

    Inventory inventory;

    public VendingMachine() {
        this.coinList = new ArrayList<>();
        inventory = new Inventory(10);
        this.state = new IdleState();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public State getState() {

        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
