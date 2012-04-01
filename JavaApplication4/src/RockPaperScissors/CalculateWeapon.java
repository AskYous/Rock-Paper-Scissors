package RockPaperScissors;

import java.util.ArrayList;

/**
 *
 * @author Yousef_2
 */
public abstract class CalculateWeapon {

    private static final int RANDOM = 1;
    private static final int SMARTCALCULATOR = 2;
    private StringBuilder weaponsThrown;

    
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

//    public void appendWeapon(Weapon w) {
////        weaponsThrown.append(w.toString());
//        weapons.add(w);
//    }

//    public String getWeaponsThrown() {
//        return weaponsThrown.toString();
//    }

    public abstract Weapon calculateWeapon();
}
