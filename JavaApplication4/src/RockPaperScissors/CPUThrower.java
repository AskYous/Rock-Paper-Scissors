package RockPaperScissors;

import java.util.ArrayList;

/**
 * Simulates the computer as a player of rock paper scissors game.
 */
public class CPUThrower extends Thrower {

    private CalculateWeapon cw;
    private Weapon predictedWeapon;

    public Weapon getPredictedWeapon() {
        return predictedWeapon;
    }
    private static ArrayList<Weapon> weapons = new ArrayList<Weapon>();

    /**
     * Generates computer's next weapon base on an algorithm.
     *
     * @param ALG_TYPE Type of algorithm to generate cpu's next weapon.
     * @return Cpu's next weapon.
     */
    public void generateWeapon(int ALG_TYPE, int roundNumber) {
        Weapon w;
        cw = CalculateWeapon.makeCalc(ALG_TYPE, roundNumber);
        w = cw.calculateWeapon();
        super.setWeapon(w);
        if (ALG_TYPE == 1) {
            setPredictedWeapon(null);
        } else {
            setPredictedWeapon(w);
        }
    }

    /**
     * Add the end of a round it adds first the user weapon and then the cpu
     * weapon
     *
     * @param w
     */
    public void appendWeapon(Weapon w) {
        weapons.add(w);
        weapons.add(super.getWeapon());
    }

    public static ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    private void setPredictedWeapon(Weapon predicted) {
        if (predicted == null) {
            this.predictedWeapon = null;
        } else {
            switch (predicted) {
                case ROCK:
                    this.predictedWeapon = Weapon.SCISSORS;
                case PAPER:
                    this.predictedWeapon = Weapon.ROCK;
                case SCISSORS:
                    this.predictedWeapon = Weapon.PAPER;
            }
        }
    }
}