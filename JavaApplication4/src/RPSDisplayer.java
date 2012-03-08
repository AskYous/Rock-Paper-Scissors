
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Displays information and contains the main method that runs and updates the game.
 * 
 * @author Yousef_2, Carlos
 * @version 1.0
 */
public class RPSDisplayer {

    /**
     * Prints help information.
     * @param current game information.
     */
    private static void printHelpInfo(Information infor) {
        System.out.println(infor.getHelpInfo());
    }

    /**
     * Prints current match information.
     * @param current game information.
     */    
    private static void printMatchInfo(Information infor) {
        System.out.println(infor.getMatchInfo());
    }

    /**
     * Prints introductory message.
     * Runs the game.
     * Updates match information.
     * @param args
     */
    public static void main(String[] args) {
        Information info = new Information();
        Thrower thrower = new Thrower();

        CPUThrower cpu = new CPUThrower();
        PlayerThrower user = new PlayerThrower();
        String input;
        Comparator<Weapon> comparator =  new WeaponComparator();

        System.out.println(info.getIntroMessage());
        int rounds = -1;
        while(rounds == -1){
            try{
                Scanner scanner = new Scanner(System.in);
                rounds = scanner.nextInt();
                info.setRounds(rounds);
            }
            catch(InputMismatchException e){
                rounds = -1;
                System.out.println(  "is not a valid input. Please enter a valid input...");
                
            }
        }

        while (!info.matchOver()) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Round " + info.getRound() + ". " + info.getRoundMessage());

            input = scan.nextLine();

            if (input.equals("h")) {
                printHelpInfo(info);
            } else if (input.equals("m")) {
                printMatchInfo(info);
            } else if (input.equals("r") || input.equals("p") || input.equals("s")) {
                user.generateWeapon(1, input);
                cpu.generateWeapon(1);
                String output = "User threw a " + user.getWeapon() + "!\t CPU threw a " + cpu.getWeapon() + "!";

                int result = comparator.compare(user.getWeapon(), cpu.getWeapon());
                switch (result) {
                    //user wins
                    case (1):
                        System.out.println(output + "\tUSER wins!");                       
                        break;
                    //tie
                    case (0):
                        System.out.println(output + "\tIt's a TIE!");                   
                        break;
                    //user loss
                    case (-1):
                        System.out.println(output + "\tCPU wins!");
                        break;
                }
                info.updateScores(result);

                info.updateMatchInfo(user.getWeapon(), cpu.getWeapon());
            } else {
                System.out.println(input + " is not a valid input. Please enter a valid input...");
            }

        }
        info.updateMatchInfo();
        printMatchInfo(info);
    }
}
