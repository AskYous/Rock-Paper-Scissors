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
    public static CalculateWeapon makeCalc(int type) {
        switch (type) {
            case RANDOM:
                return new randomCalculator();
            case SMARTCALCULATOR:
                return new SmartCalculator();
        }
        throw new IllegalArgumentException("Not a valid type or type not yet supported.");
    }
    
    public abstract Weapon calculateWeapon();
}
