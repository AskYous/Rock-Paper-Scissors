package RockPaperScissors;
/**
*
 */
public class Scores {

    private int wins;
    private int losses;
    private int ties;

    /**
     * Constructor for the scores class.
     */
    public Scores() {
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
    }

    /**
     * Resets all fields.
     */
    public void reset() {
        this.losses = 0;
        this.wins = 0;
        this.ties = 0;
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
     * determines the match winner between user and cpu (or a tie).
     * @return match winner.
     */
    public String determineMatchWinner() {
        String winner = "";
        if (wins == losses) {
            winner = "Tie";
        } else if (wins > losses) {
            winner = "User";
        } else {
            winner = "CPU";
        }
        return winner;
    }
}