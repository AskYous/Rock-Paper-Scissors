
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
    private String helpInfo;
    private String winner;
    private String matchInfo;
    private final String roundMessage;
    private final String introMessage;
    private static final int PLAYERS = 2;
    private List<Weapon> cpuWeapons;
    private List<Weapon> userWeapons;
    private Scores scores;

    public Information() {
        this(0);
    }

    public Information(int roundsPerMatch) {
        this.rounds = roundsPerMatch;
        this.scores = new Scores();
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
        this.cpuWeapons.clear();
        this.userWeapons.clear();
    }

    public void updateScores(int result){
        if (result == 0){
            scores.incrementTie();
        }
        if (result == -1){
            scores.incrementLoss();
        }
        if (result == 1){
            scores.incrementWin();
        }
    }

    /**
     * returns help dialogue.
     * @return help dialogue.
     */
    public String getHelpInfo() {
        return helpInfo;
    }
    
    /**
     * Updates the match information
     * @param userWeapon weapon chose by the user
     * @param cpuWeapon weapon chose by the cpu
     */
    public void updateMatchInfo(Weapon userWeapon, Weapon cpuWeapon) {
        currentRound++;
        this.matchInfo = "Current Round: " + currentRound + "\t\tWins: " + scores.getWins() + 
                "\t\t Losses: " + scores.getLosses() + "\t\tTies: " + scores.getTies();
        userWeapons.add(userWeapon);
        cpuWeapons.add(cpuWeapon); 
        if (currentRound > rounds) {
            this.winner = scores.determineMatchWinner();
        }        
    }    
    
    /**
     * Updates the match information as a final outro message printing the winner.
     */
    public void updateMatchInfo() {
        currentRound = rounds;
        if(scores.getWins() == scores.getLosses()){
        this.matchInfo = "Total Rounds Played: " + currentRound + "\t\tWins: " + scores.getWins() + 
                "\t\t Losses: " + scores.getLosses() + "\t\tTies: " + scores.getTies() + "\nThe Match ended in a: " + getMatchWinner();
        }
        else{
        this.matchInfo = "Total Rounds Played: " + currentRound + "\t\tWins: " + scores.getWins() + 
                "\t\t Losses: " + scores.getLosses() + "\t\tTies: " + scores.getTies() + "\nThe winner is: " + getMatchWinner();           
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
