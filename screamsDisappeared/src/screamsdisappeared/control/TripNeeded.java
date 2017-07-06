/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screamsdisappeared.control;
/**
 *
 * @author David Vera
 */
public class TripNeeded {
    
    public double calcTripNeeded (double gallonsNeeded,  double bottlePerTrip) {
    
        double literNeeded = gallonsNeeded*3.7854118;
        double numbersOfTrip = Math.ceil(literNeeded/(bottlePerTrip*2));//Each bottle will have a capacity of two liters, and the user only can carry up to two bottles per trip
        return numbersOfTrip;
    }

   
}
