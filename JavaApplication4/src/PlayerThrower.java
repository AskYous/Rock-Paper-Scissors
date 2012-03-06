
/**
 * This class sets the weapon for the user.
 * @version 1.0
 */
public class PlayerThrower extends Thrower{
    public Weapon weapon;

    public PlayerThrower() {
    }
    
    /**
     * sets the weapon of the user.
     * @param ALG_TYPE type of algorithm
     * @param input the weapon as a string
     */
    public Weapon generateWeapon(int ALG_TYPE,String input){
        if(ALG_TYPE ==1){
            this.weapon = new Weapon(input);
            return weapon;  
        }
        else
            return null;
    } 
    
    public Weapon getWeapon(){
        return weapon;
    }
    
}