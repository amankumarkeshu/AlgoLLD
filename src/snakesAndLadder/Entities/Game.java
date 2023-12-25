package snakesAndLadder.Entities;

import snakesAndLadder.service.DiceService;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {

    Queue<Player> players;
    Queue<Player> winners;

    int diceCount;
    int dimension;
    int size;

    Board board;

    public Game(int diceCount, int dimension) {
        this.players = new LinkedList<Player>();
        this.winners = new LinkedList<Player>();
        this.diceCount = diceCount;
        this.dimension = dimension;
        this.size = dimension * dimension;
        this.board = new Board(dimension);
    }


    public void launchGame() {

        while (players.size() > 1) {

            printPlayers();
            Player curPlayer = players.poll();

            System.out.println("Current Player is " + curPlayer.getUsername() + ", with a position " + curPlayer.getPosition());

            System.out.println("Press any key to roll the dice");
            // Take input from the user to roll the dice
            Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(0);

            // Pick the player whose chance is now
            // Roll the dice
            // move to postion after rolling dice
            movePlayer(curPlayer, diceCount);

            // If the player has already won the game then remove him from the players queue and move
            // to the winners queue

            if (curPlayer.getPosition() == size) {
                System.out.println("Player : " + curPlayer.getUsername() + " won.");
                winners.add(curPlayer);
            } else {
                players.add(curPlayer);
            }


        }


    }

    private void movePlayer(Player player, int diceCount) {
        int diceValue = DiceService.rollDice(diceCount);
        int finalPostion = player.getPosition() + diceValue;

        // Current pos is 99, size is 100 and he gets 5. Can he move?

        if (finalPostion <= this.size) {
            System.out.println(" Moving to " + finalPostion);
            if (board.isSnakeOrLadder(finalPostion)) {

                BoardEntity entity = board.cells.get(finalPostion);
                System.out.println(entity.encounteredMessage());

                finalPostion = entity.getEnd();
            }
            player.setPosition(finalPostion);
        } else {
            System.out.println(" OOPS,, you crossed the board. Please try again later.");
        }

    }

    private void printPlayers() {
        for (Player player : players) {
            System.out.println(player.getUsername() + " is at the position " + player.getPosition());
        }
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }


}
