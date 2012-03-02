
/**
 *
 * @author Yousef_2
 */
public class Weapon {

    public final String rock = "r";
    public final String paper = "p";
    public final String scissor = "s";
    public String weapon;

    public void setWeapon(String w) {
        this.weapon = w;
    }

    public void setWeapon(int w) {
        switch (w) {
            case (1):
                weapon = rock;
                break;
            case (2):
                weapon = paper;
                break;
            case (3):
                weapon = scissor;
                break;
        }
    }

    public String getWeapon() {
        return weapon;
    }

    public int compare(Weapon weapon) {
        int compare = 0;
        String w = weapon.toString();
        if (w.equals(rock) || w.equals("rock")) {
            if (this.weapon.equals(rock)) {
                compare = 0;
            }
            if (this.weapon.equals(paper)) {
                compare = 1;
            }
            if (this.weapon.equals(scissor)) {
                compare = -1;
            }
        }

        if (w.equals(paper) || w.equals("paper")) {
            if (this.weapon.equals(rock)) {
                compare = -1;
            }
            if (this.weapon.equals(paper)) {
                compare = 0;
            }
            if (this.weapon.equals(scissor)) {
                compare = 1;
            }
        }

        if (w.equals(scissor) || w.equals("scissor")) {
            if (this.weapon.equals(rock)) {
                compare = 1;
            }
            if (this.weapon.equals(paper)) {
                compare = -1;
            }
            if (this.weapon.equals(scissor)) {
                compare = 0;
            }
        }
        return compare;
    }// end compareWeapon method

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
