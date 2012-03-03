
/**
 *
 * @author Yousef_2, Carlos
 * @version 1.0
 */
public class PlayerThrower extends Thrower{
    public String input;
    public Weapon weapon;

    public PlayerThrower(String input) {
        this.input = input;
        this.weapon = new Weapon();
        weapon.setWeapon(input);
        
    }
    
}
