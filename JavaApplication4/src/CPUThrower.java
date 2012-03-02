
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yousef_2
 */
public class CPUThrower {

    public Weapon weapon;

    public CPUThrower() {
        Random rnd = new Random();
        this.weapon = new Weapon();
        this.weapon.setWeapon(rnd.nextInt(3) + 1);
    }

    //for later
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
