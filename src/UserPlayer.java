import hu.pte.poker.framework.entity.Player;

import java.util.Scanner;

public class UserPlayer implements Player {

    private int numberOfPlayers;
    private int numberOfPlayersLeft;

    private String cards;
    //String variables to put cards in them
    private String flop = "_ _ _";
    private String turn = "_";
    private String river = "_";

    private Scanner scan = new Scanner(System.in);

    @Override
    public boolean areYouIn() {
        // in this method we are asking user about permissions if he/she wants to play more or not.
        System.out.println("Your cards: " + this.cards);
        System.out.println("Table: " + String.join("|", this.flop,  this.turn, this.river));

        System.out.print("Are you in? (y/n) : ");
        String play =  scan.next();
        System.out.println(play.length());
        System.out.println();

        return play.charAt(0) == 'y' ? true : false;
    }

    @Override
    public void deal(String cards, int numberOfPlayers) {
        //method to deal the cards and number of players
        this.cards = cards;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfPlayersLeft = numberOfPlayers;
    }

    @Override
    public void flop(String cards , int numberOfPlayers)  {
        this.flop = cards;
        this.numberOfPlayersLeft = numberOfPlayers;
    }

    @Override
    public void turn(String cards , int numberOfPlayers) {

        this.turn = cards;
        this.numberOfPlayersLeft = numberOfPlayers;
    }

    @Override
    public void river(String cards , int numberOfPlayers) {
        this.river = cards;
        this.numberOfPlayersLeft = numberOfPlayers;
    }

    @Override
    public void result(boolean youWon, int numberOfBetsWon) {
        // in the end we print result if we have won or not
        System.out.println(youWon ? "You won!" : "You lost."
                + " Number of bets won: " + numberOfBetsWon);
    }
}