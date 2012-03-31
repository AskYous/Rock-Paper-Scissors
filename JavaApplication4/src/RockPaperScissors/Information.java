package RockPaperScissors;

import java.util.ArrayList;
import java.util.List;

/**
 * This class stores all the information of the match being played.
 * Can also determine match winner after the match is complete.
 * @version 1.0
 */
public class Information {

    private int rounds;
    private int currentRound;
    private String winner;
    private String matchInfo;
    private final String roundMessage;
    private static final int PLAYERS = 2;
    private List<Weapon> weaponsThrown;
    private Scores scores;

    /**
     * Constructor for Information class. Stores all information
     * related to the match being played.
     */
    public Information() {
        this(0);
    }

    /**
     * Constructor for Information class. Stores all information
     * related to the match being played.
     * @param roundsPerMatch sets the number of rounds per match
     */
    public Information(int roundsPerMatch) {
        this.rounds = roundsPerMatch;
        this.scores = new Scores();
        this.currentRound = 1;
        this.weaponsThrown = new ArrayList<Weapon>();

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
     * returns the current round in the match
     * @return rounds
     */
    public int getRound() {
        return this.currentRound;
    }

    /**
     * boolean to see if the match is over. 
     * @return true if match is over. False otherwise.
     */
    public boolean matchOver() {
        return currentRound > rounds;
    }

    /**
     * Sets the number of rounds for the match
     * @param rounds rounds per match
     */
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    /**
     * Resets the game.
     */
    public void reset() {
        this.scores.reset();
        this.rounds = 0;
        this.weaponsThrown.clear();
        this.weaponsThrown.clear();
    }

    /**
     * Updates score depending on if user wins, losses, or ties.
     * @param result Outcome of round
     */
    public void updateScores(int result) {
        if (result == 0) {
            scores.incrementTie();
        }
        if (result == -1) {
            scores.incrementLoss();
        }
        if (result == 1) {
            scores.incrementWin();
        }
    }

    /**
     * Updates the match information
     * @param userWeapon weapon chose by the user
     * @param cpuWeapon weapon chose by the cpu
     */
    public void updateMatchInfo(Weapon userWeapon, Weapon cpuWeapon) {
        currentRound++;
        this.matchInfo = "Current Round: " + currentRound + "\t\tWins: " + scores.getWins()
                + "\t\t Losses: " + scores.getLosses() + "\t\tTies: " + scores.getTies();
        weaponsThrown.add(userWeapon);
        weaponsThrown.add(cpuWeapon);
        if (currentRound > rounds) {
            this.winner = scores.determineMatchWinner();
        }
    }

    /**
     * Updates the match information as a final outro message printing the winner.
     */
    public void updateMatchInfo() {
        currentRound = rounds;
        if (scores.getWins() == scores.getLosses()) {
            this.matchInfo = "Total Rounds Played: " + currentRound + "\t\tWins: " + scores.getWins()
                    + "\t\t Losses: " + scores.getLosses() + "\t\tTies: " + scores.getTies() + "\nThe Match ended in a: " + getMatchWinner();
        } else {
            this.matchInfo = "Total Rounds Played: " + currentRound + "\t\tWins: " + scores.getWins()
                    + "\t\t Losses: " + scores.getLosses() + "\t\tTies: " + scores.getTies() + "\nThe winner is: " + getMatchWinner();
        }

    }

    /**
     * returns the match info as a reader friendly string after it's been updated.
     * Can be interpreted as a toString() method of this class.
     * @return match info
     */
    public String getMatchInfo() {
        return matchInfo;
    }

    /**
     * adds a weapon to the list of weapons
     * @param w weapon to be added
     */
    public void addWeapon(Weapon w) {
        weaponsThrown.add(w);
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