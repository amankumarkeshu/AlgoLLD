package snakesAndLadder.Entities;

public class Snake extends BoardEntity{
    public Snake(int start, int end) {
        super(start, end);
    }

    @Override
    public String getString() {
        return "S : " + this.getEnd();
    }

    @Override
    public String encounteredMessage() {
        return "OOPS we encountered a snake";
    }


}
