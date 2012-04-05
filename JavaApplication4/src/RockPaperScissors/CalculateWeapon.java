package RockPaperScissors;

/**
 *
 * @author Yousef_2
 */
public abstract class CalculateWeapon {

    private static final int RANDOM = 1;
    private static final int SMARTCALCULATOR = 2;

    /**
     * @param type type of calculator wanted
     * @return a weapon calculator
     */
    public static CalculateWeapon makeCalc(int type, int roundNumber) {
        switch (type) {
            case RANDOM:
                return new RandomCalculator();
            case SMARTCALCULATOR:
                return new SmartCalculator(roundNumber);
        }
        throw new IllegalArgumentException("Not a valid type or type not yet supported.");
    }

    public abstract Weapon calculateWeapon();
}
