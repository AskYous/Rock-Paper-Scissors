
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yousef_2, Carlos
 * @version 1.0
 */
public class Information {

    private int wins;
    private int losses;
    private int ties;
    private int rounds;
    private int currentRound;
    private String helpInfo;
    private String winner;
    private String matchInfo;
    private final String roundMessage;
    private final String introMessage;
    private static final int PLAYERS = 2;
    private List<Weapon> cpuWeapons;
    private List<Weapon> userWeapons;

    public Information() {
        this(0);
    }

    public Information(int roundsPerMatch) {
        this.rounds = roundsPerMatch;
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
        this.currentRound = 1;
        this.userWeapons = new ArrayList<Weapon>();
        this.cpuWeapons = new ArrayList<Weapon>();

        //Something should be done about these long strings making our code look bad
        this.helpInfo = "'Rock, Paper, Scissor' is a game in which players draw "
                + "their weapon and use them against each other. There are 3 weapons:\n"
                + "-Rock:'r'\tBeats scissors but losses to papers.\n"
                + "-Paper:'p'\tBeats rocks but losses to scissors.\n"
                + "-Scissor:'s'\tBeats papers but losses to rocks.\n"
                + "You are versing the computer and the computer chooses"
                + " its weapon at random. Enter your weapon to use against the computer:";
        this.introMessage = "Welcome to Rock, Paper, Scissor game! "
                + "Start by entering the number of rounds for this match:";
        this.matchInfo = "Current Round: " + currentRound + "\t\tWins: "
                + wins + "\t\t Losses: " + losses + "\t\tTies: " + ties;
        this.roundMessage = "-----------------------------------------------------------------"
                + "\nRock, paper, scissor shoot!"
                + "\nEnter:'r' for rock, 'p' for paper, 's' for scissor."
                + "\nOR 'm' for match info,'h' for help";
    }
    
    public String getRoundMessage() {
        return roundMessage;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getLosses() {
        return losses;
    }

    public int getTies() {
        return ties;
    }

    public int getWins() {
        return wins;
    }    
    
    public int getRound() {
        return this.currentRound;
    }
    
    public String getIntroMessage() {
        return introMessage;
    }    
    
    public boolean matchOver() {
        return currentRound > rounds;
    }

    /**
     * Resets the game.
     */
    public void reset() {
        this.losses = 0;
        this.wins = 0;
        this.ties = 0;
        this.rounds = 0;
        this.cpuWeapons.clear();
        this.userWeapons.clear();
        updateMatchInfo();
    }

    public void incrementWin() {
        this.wins++;
    }

    public void incrementLoss() {
        losses++;
    }

    public void incrementTie() {
        ties++;
    }    
    
    public String getHelpInfo() {
        return helpInfo;
    }

    public void setMatchInfo(int rounds, int wins, int losses, int ties) {
        this.matchInfo = "Current Round: " + rounds + "\tWins: " + wins + "\t Losses: " + losses + "\tTies: " + ties;
    }

    private void updateMatchInfo() {
        setMatchInfo(currentRound, wins, losses, ties);
        if (currentRound == rounds) {
            this.winner = determineMatchWinner();
        }
    }

    public void updateMatchInfo(Weapon userWeapon, Weapon cpuWeapon) {
        currentRound++;
        setMatchInfo(currentRound, wins, losses, ties);
        userWeapons.add(userWeapon);
        cpuWeapons.add(cpuWeapon);        
    }

    public String getMatchInfo() {
        if(currentRound>rounds)
            setMatchInfo(rounds, wins, losses, ties);
        return matchInfo;
        
    }

    private String determineMatchWinner() {
        if (wins == losses) {
            this.winner = "Tie";
        } else if (wins > losses) {
            winner = "User";
        } else {
            winner = "cpu";
        }
        return winner;
    }

    public String getMatchWinner() {
        if (currentRound != rounds) {
            throw new IllegalStateException("The match is still being played!");
        }
        return winner;
    }
}
