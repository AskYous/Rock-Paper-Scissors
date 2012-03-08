
import java.util.Comparator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kqarlos
 */
public class WeaponComparator implements Comparator<Weapon>{
    

    
    /**
     * Similar to the Comparables compare method. Compares the weapons given
     * @param w1 weapon 1
     * @param w2weapon 2
     * @return Numerical value indicating win, loss, or tie.
     */
    @Override
    public int compare(Weapon userW, Weapon cpuW) {
        
        int compare = 0;   
        
        if (w.weapon.equals(rock)) {
            if (this.weapon.equals(paper))
                compare = 1;
            if (this.weapon.equals(scissor))
                compare = -1;
        }

        if (w.weapon.equals(paper)) {
            if (this.weapon.equals(scissor))
                compare = 1;             
            if (this.weapon.equals(rock))
                compare = -1;           
        }

        if (w.weapon.equals(scissor)) {
            if (this.weapon.equals(rock))
                compare = 1;
            if (this.weapon.equals(paper))
                compare = -1;
        }
        
        return compare;
    }
    
}
