
import java.util.Comparator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kqarlos
 */
public class WeaponComparator implements Comparator<Weapon> {

    /**
     * Similar to the Comparables compare method. Compares the weapons given
     * @param w1 weapon 1
     * @param w2weapon 2
     * @return Numerical value indicating win, loss, or tie.
     */
    @Override
    public int compare(Weapon userW, Weapon cpuW) {

        int compare = 0;

        switch (userW) {
            case ROCK:
                switch (cpuW) {
                    case PAPER:
                        compare = 1;
                        break;
                    case SCISSORS:
                        compare = -1;
                        break;
                }
                break;
            case PAPER:
                switch (cpuW) {
                    case SCISSORS:
                        compare = 1;
                        break;
                    case ROCK:
                        compare = -1;
                        break;
                }
            case SCISSORS:
                switch (cpuW) {
                    case ROCK:
                        compare = 1;
                        break;
                    case PAPER:
                        compare = -1;
                        break;

                }
        }
        
        return compare;
    }
}
