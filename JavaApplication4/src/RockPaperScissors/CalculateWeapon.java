/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RockPaperScissors;

/**
 *
 * @author Yousef_2
 */
public abstract class CalculateWeapon {

    private final int RANDOM = 1;
    private final int NCALC = 2;
    private Weapon predictedWeapon;

    public CalculateWeapon makeCalc(int type) {
        switch (type) {
            case RANDOM:
                return new randomCalculator();
            case NCALC:
                return new NCalculator();
        }
        throw new IllegalArgumentException("Not a valid type or type not yet supported.");
    }

    public abstract Weapon calculateWeapon();
}
