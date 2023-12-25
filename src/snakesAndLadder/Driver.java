package snakesAndLadder;

import snakesAndLadder.Entities.Game;
import snakesAndLadder.Entities.Player;

public class Driver {
    public static void main(String args[]) {

        int diceCount = 1;
        int dimension = 10;
        Game game = new Game(diceCount, dimension);

        Player player1 = new Player ("Ajay");
        Player player2 = new Player("Divyansh");
        Player player3 = new Player (" Raj");

        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);

        game.launchGame();

    }
}
