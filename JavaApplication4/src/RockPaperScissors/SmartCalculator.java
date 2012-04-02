package RockPaperScissors;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yousef_2
 */
public class SmartCalculator extends CalculateWeapon {

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
     * 0 = R returns P 1 = P returns S 2 = S returns R Ignores first user's
     * weapon Uses last cpu weapon to generate the smart throw
     *
     * @return
     */
    private Weapon N2() {
        int[] occurrences = new int[3];
        Weapon last = weapons.get(weapons.size() - 1);
        for (int i = 0; i < weapons.size(); i++) {
            //position i is CPU's weapon
            if ((weapons.get(i).equals(last)) && (i != 0) && (i % 2 != 0) && (i != weapons.size() - 1)) {
                if (weapons.get(i + 1).equals(Weapon.ROCK)) {
                    occurrences[0]++;
                } else if (weapons.get(i + 1).equals(Weapon.PAPER)) {
                    occurrences[1]++;
                } else {
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

    private Weapon yousefsNCalculator(int N) {
        int[] occurrences = new int[3];

        //String of weapons, instead of List. For example: weaponString = "RPSSPRRPS";
        String weaponsString = "";

        //Adds each weapon to the weaponString Variable
        for (int i = 0; i < weapons.size(); i++) {
            weaponsString += weapons.get(i).toString();
        }

        int tail = weaponsString.length() - 1;

        //String of only the last N weapons. 
        String lastWeaponsThrown = weaponsString.substring(tail - N, tail);

        //a list of the strings (or weapons) between each 'lastWeaponsThrown' sequence. Kinda hard to explain.
        //It pretty much removes every sequence of the 'lastWeaponsThrown' and puts all the strings before and after the removed
        //sequence, into the array. Although all we care about is just the next letter (or weapon).
        String[] temp = weaponsString.split(lastWeaponsThrown);

        //Sees the next letter in the list. Adds to the occurences[] list just like Carlos's method.
        for (int i = 1; i < temp.length; i++) {
            if (temp[i].startsWith("R")) {
                occurrences[0]++;
            } else if (temp[i].startsWith("P")) {
                occurrences[1]++;
            } else if (temp[i].startsWith("S")) {
                occurrences[2]++;
            } else {
                throw new NullPointerException("Not R, P, or S. Was: " + temp[i]);
            }
        }

        //determines next weapon to throw.
        Weapon nextWeapon = null;
        switch (count(occurrences)) {
            case 0:
                nextWeapon = Weapon.PAPER;
                break;
            case 1:
                nextWeapon = Weapon.SCISSORS;
                break;
            case 2:
                nextWeapon = Weapon.ROCK;
                break;
        }
        return nextWeapon;
    }
}
