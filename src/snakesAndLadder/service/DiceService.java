package snakesAndLadder.service;

public class DiceService {
    public static int rollDice(int diceCount) {

        int mn = 1;
        int mx = 6 * diceCount;
        int value = (int) Math.floor(Math.random() * (mx- mn +1))+ mn;
        System.out.println("Rolled dice with a value : " + value);
        return value;
    }
}
