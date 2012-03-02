
import java.util.Scanner;

/**
 *
 * @author Yousef_2
 */
public class RPSDisplayer {

    /**
     * @param args the command line arguments
     */
    private static void printHelpInfo() {
        System.out.println(new Information().getHelpInfo());
    }

    private static void printMatchInfo(Information infor) {
        System.out.println(infor.getMatchInfo());
    }

    public static void main(String[] args) {
        Information info = new Information();
        Thrower thrower = new Thrower();
        PlayerThrower user;

        //This automatically generates computers weapon
        CPUThrower cpu;String input;
        Scanner scanner = new Scanner(System.in);

        System.out.println(info.getIntroMessage());
        info.setRounds(scanner.nextInt());

        while (!info.matchOver()) {
            Scanner scan = new Scanner(System.in);
            cpu = new CPUThrower(); //generates cpu's next weapon.
            System.out.println("Round " + info.getRound() + ". " + info.getRoundMessage());
            
            input = scan.nextLine();

            if (input.equals("h")) {
                printHelpInfo();
            } else if (input.equals("m")) {
                printMatchInfo(info);
            } else if (input.equals("r") || input.equals("p") || input.equals("s")) {
                user = new PlayerThrower(input);
                String output = "User threw a " + user.weapon + "!\t "
                        + "CPU threw a " + cpu.weapon + "!";
                info.updateMatchInfo(user.weapon, cpu.weapon);

                switch (thrower.compareWeapons(user.weapon, cpu.weapon)) {
                    //user wins
                    case (1):
                        System.out.println(output + "\tUSER wins!");
                        info.incrementWin();
                        break;
                    //tie
                    case (0):
                        System.out.println(output + "\tIt's a TIE!");
                        info.incrementTie();
                        break;
                    //user loss
                    case (-1):
                        System.out.println(output + "\tCPU wins!");
                        info.incrementLoss();
                        break;
                }
            } else {
                System.out.println(input + " is not a valid input. Please enter a valid input...");
            }
        }
        printMatchInfo(info);

    }
}
