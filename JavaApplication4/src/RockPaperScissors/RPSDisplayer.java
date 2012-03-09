package RockPaperScissors;


import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Displays information and contains the main method that runs and updates the game.
 * 
 * @author Yousef_2, Carlos
 * @version 1.0
 */
public class RPSDisplayer {

    String invalid;
    private String helpInfo;
    private final String roundMessage;
    private final String introMessage;

    public RPSDisplayer() {
        String invalid = "is not a valid input. Please enter a valid input...";
        
        this.helpInfo = "'Rock, Paper, Scissor' is a game in which players draw "
                + "their weapon and use them against each other. There are 3 weapons:\n"
                + "-Rock:'r'\tBeats scissors but losses to papers.\n"
                + "-Paper:'p'\tBeats rocks but losses to scissors.\n"
                + "-Scissor:'s'\tBeats papers but losses to rocks.\n"
                + "You are versing the computer and the computer chooses"
                + " its weapon at random. Enter your weapon to use against the computer:";
        this.introMessage = "Welcome to Rock, Paper, Scissor game! "
                + "Start by entering the number of rounds for this match:";
        this.roundMessage = "-----------------------------------------------------------------"
                + "\nRock, paper, scissor shoot!"
                + "\nEnter:'r' for rock, 'p' for paper, 's' for scissor."
                + "\nOR 'm' for match info,'h' for help";
    }

    /**
     * Prints help information.
     * @param current game information.
     */
    public void printHelpInfo() {
        System.out.println(helpInfo);
    }

    /**
     * Prints current match information.
     * @param current game information.
     */
    public void printMatchInfo(String matchInfo) {
        System.out.println(matchInfo);
    }

    /**
     * Prints current match information.
     * @param current game information.
     */
    public void printIntroMessage() {
        System.out.println(introMessage);
    }

    /**
     * Prints the invalid input message
     */
    public void printInvalid() {
        System.out.println(invalid);
    }

    /*
     * Prints that user won
     */
    public void printWin(Weapon weapon1, Weapon weapon2) {
        System.out.println("User threw: " + printWeapon(weapon1) + "!\t CPU threw: " + printWeapon(weapon2) + "!" + "\nUser Wins!");
    }

    /*
     * Prints that user lost
     */
    public void printLoss(Weapon weapon1, Weapon weapon2) {
        System.out.println("User threw: " + printWeapon(weapon1) + "!\t CPU threw: " + printWeapon(weapon2) + "!" + "\nCPU Wins!");
    }

    /*
     * Prints that user lost
     */
    public void printTie(Weapon weapon1) {
        System.out.println("User threw: " + printWeapon(weapon1) + "!\t CPU threw: " + printWeapon(weapon1) + "!" + "\nIt's a Tie!");
    }

    /**
     * Overrides Object's toString() method. Returns the weapon as a reader friendly string.
     * @return the weapon as a string.
     */
    private String printWeapon(Weapon weapon) {
        String wpn = "";
        switch (weapon) {
            case ROCK:
                wpn = "rock";
                break;
            case PAPER:
                wpn = "paper";
                break;
            case SCISSORS:
                wpn = "scissor";
                break;
        }
        return wpn;      
    }
   
    
}