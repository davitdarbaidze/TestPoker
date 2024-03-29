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
        System.out.println("This will be your cards: " + this.cards);
        System.out.println("Cards on Table: " + String.join("|", this.flop,  this.turn, this.river));

        System.out.print("do you want to continue playing? (y/n) : ");
        String play =  scan.next();
        System.out.println(play.length());
        System.out.println();

        return play.charAt(0) == 'y' ? true : false;
    }

    public void winningCombination(){

        String royalFlush ="Combinations for winning from strongest hand to weakest hand: \r\nA, K, Q, J, 10, all the same suit.";
        String straightFlush = "Five cards in a sequence, all in the same suit.";
        String fourKind="All four cards of the same rank. ";
        String fullHouse="Three of a kind with a pair. ";
        String flush = "Any five cards of the same suit, but not in a sequence. ";
        String straight = "Five cards in a sequence, but not of the same suit. ";
        String threeOfAKind="Three cards of the same rank. ";
        String twoPair="Two different pairs. ";
        String pair ="Two cards of the same rank. ";
        String highCard="the highest card is winner";
        String winningCombinations = royalFlush + "\r\n" + straightFlush +"\r\n"+fourKind+"\r\n"+fullHouse+"\r\n"+flush
                +"\r\n"+straight+"\r\n"+threeOfAKind+"\r\n"+twoPair+"\r\n"+pair+"\r\n"+highCard+"\r\n";
        System.out.println(winningCombinations);
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