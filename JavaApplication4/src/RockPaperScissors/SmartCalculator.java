package RockPaperScissors;

import java.util.ArrayList;

/**
 *
 * @author Yousef_2
 */
public class SmartCalculator extends CalculateWeapon {

    private String weaponsThrown;
    private ArrayList<Weapon> weapons = new ArrayList<Weapon>();

    @Override
    public Weapon calculateWeapon() {
        Weapon calculatedWeapon = null;
//        weaponsThrown = super.getWeaponsThrown().toString();
        weapons = CPUThrower.getWeapons();
        calculatedWeapon = N2();
        return calculatedWeapon;
    }

    /**
     * 0 = R returns P
     * 1 = P returns S
     * 2 = S returns R
     * Ignores first user's weapon
     * Uses last cpu weapon to generate the smart throw
     * @return 
     */
    private Weapon N2() {
        int[] occurrences = new int[3];
        Weapon last = weapons.get(weapons.size() - 1);
        for (int i = 0; i < weapons.size(); i++) {
            //position i is CPU's weapon
            if ((weapons.get(i).equals(last)) && i != 0 && i % 2 != 0 && i != weapons.size() - 1) {
                if (weapons.get(i + 1).equals(Weapon.ROCK)) {
                    occurrences[0]++;
                } else if (weapons.get(i + 1).equals(Weapon.PAPER)) {
                    occurrences[1]++;
                } else{
                    occurrences[2]++;
                }
            }
        }

        int result = count(occurrences);

        if (result == 0) {
            return Weapon.PAPER;
        } else if (result == 1) {
            return Weapon.SCISSORS;
        } else {
            return Weapon.ROCK;
        }
    }

    /**
     * @param occurrences array of occurrences of combinations .
     * @return position with biggest number
     */
    private int count(int[] occurrences) {
        int result = 0;
        for (int i = 1; i < occurrences.length; i++) {
            if (occurrences[i] > occurrences[result]) {
                result = i;
            }
        }
        return result;
    }
}
