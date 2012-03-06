
/**
 * 
 * @author Yousef_2, Carlos
 * @version 1.0
 */
public class Weapon {

    public final String rock = "r";
    public final String paper = "p";
    public final String scissor = "s";
    public String weapon;

    /**
     * Set the weapon for the user.
     * @param w user's choice of weapon gotten as an input.
     */    
    public Weapon(String w) {
        this.weapon = w;
    }

    /**
     * Returns weapon selected
     * @return the weapon
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * Determines winner among weapons.
     * @param weapon.
     * @return whether the comparison returned a win (1), loss (-1) or tie (0)
     */    
    public int compare(Weapon w) {
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

    
    /**
     * Overrides Object's toString() method. Returns the weapon as a reader friendly string.
     * @return the weapon as a string.
     */
    @Override
    public String toString() {
        String wpn = "";
        if (weapon.equals(rock)) {
            wpn = "rock";
        } else if (weapon.equals(paper)) {
            wpn = "paper";
        } else if (weapon.equals(scissor)) {
            wpn = "scissor";
        } else {
            throw new NullPointerException("Weapon not chosen yet!");
        }
        return wpn;
    }
}