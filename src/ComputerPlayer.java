

import hu.pte.poker.framework.entity.Player;

public class ComputerPlayer implements Player {
    private int numberOfPlayers;
    private int numberOfPlayersLeft;

    private String cards;

    private String flop = "_ _ _";
    private String turn = "_";
    private String river = "_";


    @Override
    public boolean areYouIn() {
        //with this true statement we make computer player to return always true
        // ( yes) answer to a question are you in or not
        return true;
    }

    @Override
    public void deal(String cards, int numberOfPlayers) {
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
        System.out.println(youWon ? "You won1!" : "You lost."
                + " Number of bets won: " + numberOfBetsWon);
    }
}