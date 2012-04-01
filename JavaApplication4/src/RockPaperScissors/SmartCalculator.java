/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RockPaperScissors;

import java.util.ArrayList;

/**
 *
 * @author Yousef_2
 */
public class SmartCalculator extends CalculateWeapon {

    private String weaponsThrown;
    private ArrayList<Weapon> weapons = new ArrayList<Weapon>();

    @Override
    public Weapon calculateWeapon() {
        Weapon calculatedWeapon = null;
//        weaponsThrown = super.getWeaponsThrown().toString();
        weapons = CPUThrower.getWeapons();
        calculatedWeapon = N2();
        return calculatedWeapon;
    }
    
    /**
     * 0 = R
     * 1 = P
     * 2 = S
     * @return 
     */
    public Weapon N2(){
        int[] ocurrences = new int[3];
        Weapon last = weapons.get(weapons.size()-1);
        for(int i = 0; i < weapons.size() ; i++){
            //position i is CPU weapon
            if((weapons.get(i).equals(last)) && i != 0 && i % 2 != 0 && i != weapons.size()-1){
                if(weapons.get(i+1).equals(Weapon.ROCK)){
                    ocurrences[0]++;
                }
                else if(weapons.get(i+1).equals(Weapon.PAPER)){
                    ocurrences[1]++;
                }
                else if(weapons.get(i+1).equals(Weapon.SCISSORS)){
                    ocurrences[2]++;
                }                
                               
            }
        }
        int result = 0;
        for(int i = 1; i < ocurrences.length; i++){
            if(ocurrences[i] > ocurrences[result])
                result = i;
        }
        if(result == 0){
            return Weapon.ROCK;
        }
        else if(result == 1){
            return Weapon.PAPER;
        }
        else if(result == 2){
            return Weapon.SCISSORS;
        }
        else
            return null;
     }
}
