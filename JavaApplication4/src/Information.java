
import java.util.ArrayList;
import java.util.List;

/**
 * This class stores all the information of the match being played.
 * Can also determine match winner after the match is complete.
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

    /**
     * Gets the round intro message
     * @return the message
     */
    public String getRoundMessage() {
        return roundMessage;
    }

    /**
     * Sets the number of rounds for the match
     * @param rounds rounds per match
     */
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    /**
     * Returns returns the current number of losses
     * @return losses
     */
    public int getLosses() {
        return losses;
    }

    /**
     * returns the current number of ties
     * @return ties
     */
    public int getTies() {
        return ties;
    }

    /**
     * returns the current number of wins.
     * @return wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * returns the current round in the match
     * @return rounds
     */
    public int getRound() {
        return this.currentRound;
    }

    /**
     * returns the introductory message to the game.
     * @return intro message
     */
    public String getIntroMessage() {
        return introMessage;
    }

    /**
     * boolean to see if the match is over. 
     * @return true if match is over. False otherwise.
     */
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
    }

    /**
     * increments the current number of wins. 
     */
    public void incrementWin() {
        this.wins++;
    }

    /** 
     * increments the current number of losses.
     */
    public void incrementLoss() {
        losses++;
    }

    /**
     * increments the current number of ties.
     */
    public void incrementTie() {
        ties++;
    }

    /**
     * returns help diologue.
     * @return help dialogue.
     */
    public String getHelpInfo() {
        return helpInfo;
    }

    /**
     * Sets all the match information needed.
     * @param rounds rounds per match
     * @param wins number of wins
     * @param losses number of losses
     * @param ties number of ties
     */
    public void setMatchInfo(int rounds, int wins, int losses, int ties) {
        this.matchInfo = "Current Round: " + rounds + "\tWins: " + wins + "\t Losses: " + losses + "\tTies: " + ties;
    }

    /**
     * Updates the match information. Increments the current round, adds the last weapon used by the user and the cpu,
     * and updates wins, losses, and ties.
     * @param userWeapon
     * @param cpuWeapon 
     */
    public void updateMatchInfo(Weapon userWeapon, Weapon cpuWeapon) {
        currentRound++;
        setMatchInfo(currentRound, wins, losses, ties);
        userWeapons.add(userWeapon);
        cpuWeapons.add(cpuWeapon);
        if (currentRound == rounds) {
            this.winner = determineMatchWinner();
        }

    }

    /**
     * returns the match info as a reader friendly string after it's been updated.
     * Can be interpreted as a toString() method of this class.
     * @return match info
     */
    public String getMatchInfo() {
        if (currentRound > rounds) {
            setMatchInfo(rounds, wins, losses, ties);
        }
        return matchInfo;

    }

    /**
     * determines the match winner between user and cpu (or a tie).
     * @return match winner.
     */
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

    /**
     * gets the match winner. 
     * Can only be accessed if the match is over.
     * @return winner as a string
     */
    public String getMatchWinner() {
        if (currentRound != rounds) {
            throw new IllegalStateException("The match is still being played!");
        }
        return winner;
    }
}
