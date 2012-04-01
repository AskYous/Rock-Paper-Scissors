/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
