package snakesAndLadder.Entities;

import snakesAndLadder.Factory.EntityENUM;
import snakesAndLadder.Factory.EntityFactory;

import java.util.HashMap;

public class Board {
    int size;
    HashMap<Integer, BoardEntity> cells;

    public Board(int dimension) {
        this.size = dimension * dimension;
        cells = new HashMap<Integer, BoardEntity>();

        // Create n snakes and n ladders in the board
        for (int index = 0; index < dimension; index++) {

            //Add a ladder at pos - start
            int mn = 2, mx = this.size - 1;

            int start = randomValue(mx, mn);
            mx = start - 1;
            int end = randomValue(mx, mn);
            // 40 ,29
            if (!isSnakeOrLadder(start)) {
                // Add the snake entity at the pos start
                addEntity(start, EntityFactory.createEntity( EntityENUM.SNAKE, start,end));
            }

            // Add a ladder at pos - start
            mn = 2;
            mx = this.size - 1;

            end = randomValue(mx, mn);
            mx = end - 1;
            start = randomValue(mx, mn);

            if (!isSnakeOrLadder(start)) {
                addEntity(start, EntityFactory.createEntity(EntityENUM.LADDER, start, end));
            }
        }
        printBoard(size, dimension);

    }


    public void printBoard(int size, int dimension) {

        for (int index = size - 1; index >= 1; index--) {
            System.out.print(index);
            System.out.print("    ");

            if (isSnakeOrLadder(index)) {
                System.out.print( this.cells.get(index).getString() +  "    " );
            }

            if (index % dimension == 0) {
                System.out.println();
            }
        }
        System.out.println();

    }

    private int randomValue(int mx, int mn) {
        int start = (int) Math.floor(Math.random() * (mx - mn + 1)) + mn;
        return start;

    }


    public Boolean isSnakeOrLadder(int index) {
        return this.cells.containsKey(index);
    }


    private void addEntity(int index, BoardEntity entity) {
        this.cells.put(index, entity);

    }
}
