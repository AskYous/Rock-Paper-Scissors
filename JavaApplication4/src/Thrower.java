
/**
 *
 * @author Yousef_2, Carlos
 * @version 1.0
 */
public class Thrower {
    
    String winner;
    /**
     * Simular to the Comparable's compare method. Compares the weapons given
     * @param w1 weapon 1
     * @param w2weapon 2
     * @return Numerical value indicating win, loss, or tie.
     */
    public int compareWeapons(Weapon w1, Weapon w2){
        return w1.compare(w2);
    }
    
}
