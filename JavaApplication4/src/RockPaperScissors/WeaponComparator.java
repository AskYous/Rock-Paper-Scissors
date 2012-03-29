
import java.util.Comparator;



/*
 *Weapon comparator class. Compares 2 weapons and returns corresponding value.
 */
public class WeaponComparator implements Comparator<Weapon> {

    /**
     * Similar to the Comparables compare method. Compares the weapons given.
     * @param weapon1 User's weapon.
     * @param weapon2 CPU's weapon.
     * @return Numerical value indicating win, loss, or tie.
     */
    @Override
    public int compare(Weapon weapon1, Weapon weapon2) {

        int compare = 0;

        switch (weapon1) {
            case ROCK:
                switch (weapon2) {
                    case PAPER:
                        compare = -1;
                        break;
                    case SCISSORS:
                        compare = 1;
                        break;
                }
                break;
            case PAPER:
                switch (weapon2) {
                    case SCISSORS:
                        compare = -1;
                        break;
                    case ROCK:
                        compare = 1;
                        break;
                }
                break;
            case SCISSORS:
                switch (weapon2) {
                    case ROCK:
                        compare = -1;
                        break;
                    case PAPER:
                        compare = 1;
                        break;
                }
                break;
        }
        return compare;
    }
}