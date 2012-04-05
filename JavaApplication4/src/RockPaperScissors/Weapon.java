package RockPaperScissors;

/**
 * Weapon class. Has fields of ROCK, PAPER, SCISSORS.
 */
public enum Weapon {

    /**
     * Rock weapon. Beats scissors but losses to paper.
     */
    ROCK,
    /**
     * Paper weapon. Beats rock but losses to scissors.
     */
    PAPER,
    /**
     * Scissors weapon. Beats paper but losses to rock.
     */
    SCISSORS;

    @Override
    public String toString() {
        String wString = null;
        switch (this) {
            case ROCK:
                wString = "R";
                break;
            case PAPER:
                wString = "P";
                break;
            case SCISSORS:
                wString = "S";
                break;
        }
        return wString;
    }
}