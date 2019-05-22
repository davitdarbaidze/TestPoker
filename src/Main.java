import hu.pte.poker.framework.entity.Party;

public class Main {

    public static void main(String[] args) {


        UserPlayer userPlayer = new UserPlayer();
        UserPlayer userPlayer2 = new UserPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();

        Party party = new Party();
        party.addPlayers(userPlayer, computerPlayer);
        userPlayer.winningCombination();
        party.play();

        System.out.println("Game over");
    }
}
