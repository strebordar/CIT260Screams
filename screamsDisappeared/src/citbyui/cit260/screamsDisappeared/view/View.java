/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import screamsdisappeared.ScreamsDisappeared;
import screamsdisappeared.control.GameControl;

/**
 *
 * @author carriero
 */
public abstract class View implements ViewInterface {

    private String message;
    protected String displayMessage;

//    protected final BufferedReader keyboard = ScreamsDisappeared.getInFile();
//    protected final PrintWriter console = ScreamsDisappeared.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user want to quit
            {
                return; //exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(value);

        } while (!done);
    }

    @Override
    public String getInput() {

        String value = ""; //value to be returned
        boolean valid = false; // initialize to not valid
        try {
            while (!valid) { // loop while an invalid value is enter
                if (displayMessage != null) {
                    System.out.println("\n" + displayMessage);
                }

                value = this.keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks

                if (value.length() < 1) { // value is blank
                    System.out.println("\nI*** You must enter a value ***");
                    continue;
                }

                break;  // end the loop

            }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }

        return value; // return the value entered

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        boolean rtnValue = true;

        switch (value) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "G": // create and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                // Creat MainMenuView object
                HelpMenuView helpMenuView = new HelpMenuView();
                // Display the main menu view
                helpMenuView.display();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            case "R": //Menu to restart a saved game
                this.DisplayRestartGameMenu();
                // Creat RestartGameMenuView object
                RestartGameMenuView restartGameMenuView = new RestartGameMenuView();
                //Display the Restart Game Menu View
                restartGameMenuView.display();
                break;
            case "M": // display the game menu
                this.displayGameMenuView();
                // Creat GameMenuView object
                GameMenuView gameMenuView = new GameMenuView();
                // Display the game menu view
                gameMenuView.display();
                break;
            /*case "C": // Display the option to enter information to calculate
                this.tripNeededView();
                // Creat GallonsNeededView object
                TripNeededView tripNeededView = new TripNeededView();
                
                //Display the gallons needed view
                tripNeededView.displayTripNeededView();               
                break;*/
            case "T": // Display the move character menu
                this.moveCharacterView();
                // 
                MoveCharacterView moveCharacterView = new MoveCharacterView();

                moveCharacterView.display();
                break;
            /* case "E": // Display the option to enter information to calculate
                this.MoneyEarnedView();
                
                MoneyEarnedView moneyEarnedView = new MoneyEarnedView();
                
                moneyEarnedView.displayMoneyEarnedView();               
                break;*/

            case "D": // Display Description of Game
                this.startSceneDescription();
                break;
            case "K": // Display Description of Game
                this.startLeaveScene();
                break;
            case "P": // Display Description of Game
                this.startPickUpObject();
                break;
            case "U": // Display Description of Game
                this.startUseObject();
                break;
            case "L": // Display Description of Game
                this.locationMenuView();
                // Creat LocationMenuView object
                LocationMenuView locationMenuView = new LocationMenuView();

                // Display the location menu view
                locationMenuView.display();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                rtnValue = false;
                break;
            case "Z": // Display the move character menu
                this.homeLightOnView();
                // 
                HomeLightOnView homeLightOnView = new HomeLightOnView();

                homeLightOnView.display();

        }

        return rtnValue;
    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(ScreamsDisappeared.getPlayer());

        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("\n*** startExitingGame() function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("\n*** displayHelpMenu() function called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() function called ***");
    }

    private void DisplayRestartGameMenu() {
        System.out.println("\n*** RestartGameMenuView) function called ***");
    }

    private void displayGameMenuView() {
        System.out.println("\n*** RestartGameMenuView) function called ***");
    }

    private void tripNeededView() {
        System.out.println("\n*** tripNeededView) function called ***");
    }

    private void MoneyEarnedView() {
        System.out.println("\n*** MoneyEarnedView) function called ***");
    }

    private void ExplosivesNeededView() {
        System.out.println("\n*** explosivesNeededView) function called ***");
    }

    private void startSceneDescription() {
        System.out.println("\n*** startSceneDiscription) function called ***");
    }

    private void startLeaveScene() {
        System.out.println("\n*** startLeaveScene) function called ***");
    }

    private void startPickUpObject() {
        System.out.println("\n*** startPickUpObject function called ***");
    }

    private void startUseObject() {
        System.out.println("\n*** startUseObject function called ***");
    }

    private void locationMenuView() {
        System.out.println("\n*** locationMenuView function called ***");
    }

    private void moveCharacterView() {
        System.out.println("\n*** moveCharacterView function called ***");
    }

    private void homeLightOnView() {
        System.out.println("\n*** homeLightOnView function called ***");
    }
}
