
/**
 *
 * @author Yousef_2, Carlos
 * @version 1.0
 */
public class Thrower {
    
    String winner;
    
    /**
     * Similar to the Comparable's compare method. Compares the weapons given
     * @param w1 weapon 1
     * @param w2weapon 2
     * @return Numerical value indicating win, loss, or tie.
     */
    public int compareWeapons(Weapon userW, Weapon cpuW){
        return userW.compare(cpuW);
    }
    
    
}

