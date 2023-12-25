package snakesAndLadder.Entities;

public abstract class BoardEntity {
    private int start;
    private int end;

    public BoardEntity(int start, int end) {
        this.start = start;
        this.end = end;
    }



    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }


    public abstract String getString();
    public abstract String encounteredMessage();

}
