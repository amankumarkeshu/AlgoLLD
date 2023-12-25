package snakesAndLadder.Entities;

public class Ladder extends BoardEntity{
    public Ladder(int start, int end) {
        super(start, end);
    }

    @Override
    public String getString() {
        return "L : " + this.getEnd();

    }

    @Override
    public String encounteredMessage() {
        return "Woh-hoo ! We got a ladder";
    }
}
