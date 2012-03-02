/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yousef_2
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
