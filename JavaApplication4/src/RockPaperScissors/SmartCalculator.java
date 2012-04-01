/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RockPaperScissors;

/**
 *
 * @author Yousef_2
 */
public class SmartCalculator extends CalculateWeapon {

    private String weaponsThrown;

    @Override
    public Weapon calculateWeapon() {
        Weapon calculatedWeapon = null;
        weaponsThrown = super.getWeaponsThrown().toString();
        //...algorithm for calculator...
        return calculatedWeapon;
    }
}
