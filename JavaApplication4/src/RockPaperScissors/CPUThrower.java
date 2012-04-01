package RockPaperScissors;

/**
 * Simulates the computer as a player of rock paper scissors game.
 */
public class CPUThrower extends Thrower {

    private CalculateWeapon cw;

    /**
     * Generates computer's next weapon.
     *
     * @param ALG_TYPE Type of algorithm to generate cpu's next weapon. Used
     * later.
     * @return Cpu's next weapon.
     */
    public void generateWeapon(int ALG_TYPE) {
        Weapon w;
        cw = CalculateWeapon.makeCalc(ALG_TYPE);
        w = cw.calculateWeapon();
        super.setWeapon(w);
    }

    public void appendWeapon(Weapon w) {
        cw.appendWeapon(w);
    }
}