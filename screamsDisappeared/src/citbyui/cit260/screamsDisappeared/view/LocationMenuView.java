/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import citbyui.cit260.screamsDisappeared.exceptions.CalculationControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Darin
 */
public class LocationMenuView extends View {

    private String menu;
    private String promptMessage;

    public LocationMenuView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n| Location Menu                           |"
                + "\n------------------------------------------"
                + "\nD - Scene Description"
                + "\nL - Leave this Scene"
                + "\nP - Pick Up Object and Put It In Backpack"
                + "\nU - Use Object from Backpack"
                + "\nM - Main Menu"
                //+ "\nC - Calculate the Trip Needed"
                + "\nT - Go to Move Character Menu"
                + "\nY - Go to Location with Weapon"
                + "\nX - Explosives Needed"
                + "\n------------------------------------------");
    }

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        boolean rtnValue = true;

        switch (choice) {
            case "D": // Display Description of Game
                this.startSceneDescription();
                break;
            case "L": // Display Description of Game
                this.startLeaveScene();
                break;
            case "P": // Display Description of Game
                this.startPickUpObject();
                break;
            case "U": // Display Description of Game
                this.startUseObject();
                break;
            case "M": // Return to MainMenu
                this.mainMenuView();
                // Creat MainMenuView object
                MainMenuView mainMenuView = new MainMenuView();

                // Display the main menu view
                mainMenuView.display();
                break;
            /*case "C": // Display the option to enter information to calculate
                //this.tripNeededView();
                // Creat GallonsNeededView object
                TripNeededView tripNeededView = new TripNeededView();

                //Display the gallons needed view
                try {tripNeededView.displaytripNeededView();
                }catch (CalculationControlException me) {
                    ErrorView.display(this.getClass().getName(),me.getMessage());
                    doAction("C");
                }
                break;*/
            case "T": // Display the option to enter information to calculate
                this.moveCharacterView();
                // Creat GallonsNeededView object
                MoveCharacterView moveCharacterView = new MoveCharacterView();

                //Display the gallons needed view
                moveCharacterView.display();
                break;
                
           case "Y": // Display the option to choose the weapon
                this.locationWithWeaponView();
                // Creat LocationWithWeaponView object
                LocationWithWeaponView locationWithWeaponView = new LocationWithWeaponView();

                //Display the location weapon view
                locationWithWeaponView.display();
                break;

            case "X": // Display the option to enter information to calculate
                this.ExplosivesNeededView();

                ExplosivesNeededView explosivesNeededView = new ExplosivesNeededView();
                try {
                    explosivesNeededView.displayExplosivesNeededView();
                } catch (CalculationControlException me) {
                    ErrorView.display(this.getClass().getName(),me.getMessage());
                    doAction("X");
                }

                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try Again");
                rtnValue = false;
                break;

        }

        return rtnValue;
    }

    private void startSceneDescription() {
        this.console.println("\n*** SceneDescription function called ***");
    }

    private void startLeaveScene() {
        this.console.println("\n*** LeaveScene function called ***");
    }

    private void startPickUpObject() {
        this.console.println("\n*** PickUpObject function called ***");
    }

    private void startUseObject() {
        this.console.println("\n*** UseObject function called ***");
    }

    private void mainMenuView() {
        this.console.println("\n*** MainMenu function called ***");
    }

    /*private void tripNeededView() {
        this.console.println("\n*** tripNeededView function called ***");
    }*/

    private void MoneyEarnedView() {

    }

    private void ExplosivesNeededView() {

    }

    private void moveCharacterView() {
        this.console.println("\n*** moveCharacterView function called ***");
    }

    private void locationWithWeaponView() {
        this.console.println("\n*** locationWithWeaponView function called ***");
    }

    

}
