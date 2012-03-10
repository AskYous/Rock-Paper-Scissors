package RockPaperScissors;


import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Runs the game with the main method
 * @version 1.0
 * @author Team Guilty Crown
 */
public class GameControl {

    /**    
     * Runs the game.
     * Updates match information.
     * @param args
     */
    public static void main(String[] args) {
        Information info = new Information();
        RPSDisplayer displayer = new RPSDisplayer();

        CPUThrower cpu = new CPUThrower();
        PlayerThrower user = new PlayerThrower();
        String input;
        Comparator<Weapon> comparator = new WeaponComparator();

        displayer.printIntroMessage();
        int rounds = -1;
        while (rounds == -1) {
            try {
                Scanner scanner = new Scanner(System.in);
                rounds = scanner.nextInt();
                info.setRounds(rounds);
            } catch (InputMismatchException e) {
                rounds = -1;
                displayer.printInvalid();

            }
        }

        while (!info.matchOver()) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Round " + info.getRound() + ". " + info.getRoundMessage());

            input = scan.nextLine();

            if (input.equals("h")) {
                displayer.printHelpInfo();
            } else if (input.equals("m")) {
                displayer.printMatchInfo(info.getMatchInfo());
            } else if (input.equals("r") || input.equals("p") || input.equals("s")) {
                user.generateWeapon(input);
                cpu.generateWeapon(1);

                int result = comparator.compare(user.getWeapon(), cpu.getWeapon());
                switch (result) {
                    //user wins
                    case (1):
                        displayer.printWin(user.getWeapon(), cpu.getWeapon());
                        break;
                    //tie
                    case (0):
                        displayer.printTie(user.getWeapon());
                        break;
                    //user loss
                    case (-1):
                        displayer.printLoss(user.getWeapon(), cpu.getWeapon());
                        break;
                }
                info.updateScores(result);

                info.updateMatchInfo(user.getWeapon(), cpu.getWeapon());
            } else {
                displayer.printInvalid();
            }

        }
        info.updateMatchInfo();
        displayer.printMatchInfo(info.getMatchInfo());
    }
}
