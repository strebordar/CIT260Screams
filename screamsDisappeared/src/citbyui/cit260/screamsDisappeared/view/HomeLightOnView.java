/*To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.screamsDisappeared.view;

import java.util.Scanner;

/**
 *
 * @author lauravaleriogibbs
 */
public class HomeLightOnView extends View{
    
    
    void displayMenu() {
       this.console.println("\n*** displayMenu stub function called ***");
   }
    private String menu;
    private String promptMessage;
    private String display="";
    
    public HomeLightOnView() {
         super("\n"
                + "\n------------------------------------------"
                + "\n| Home Light On Menu                     |"
                + "\n------------------------------------------"
                + "\nA - Go to the city"
                + "\nB- Go to the car"
                + "\nC - Go inside the House"
                + "\nD - Go to the gas station"
                + "\nF - Go outside"
                + "\n------------------------------------------");
  }
 
    
    @Override
   public boolean doAction(String choice) {
        
   choice = choice.toUpperCase();

        boolean rtnValue = true;

        switch (choice) {
            case "A": // Go to the city
                this.goTotheCity();
                break;
            case "B": // Go to the car
                this.goTotheCar();
                break;
            case "C": // Go inside the House
                this.goInsideTheHouse();
                break;
            case "D": // Go to the gas station
                this.goToTheGasStation();
                break;
            case "F": // Go outside
                this.goOutside();
                break;   
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try Again");
                rtnValue = false;
                break;

       }

        return rtnValue;
    }

    

    private void goTotheCity() {
        this.console.println("\n*** goTotheCity function called");
    }

    private void goTotheCar() {
    this.console.println("\n*** goTotheCar function called");    
    }

    private void goInsideTheHouse() {
    this.console.println("\n*** goInsideTheHouse function called");    
    }

    private void goToTheGasStation() {
     this.console.println("\n*** goToTheGasStation function called");   
    }

    private void goOutside() {
    this.console.println("\n*** goOutside function called");  
    }

    
}

