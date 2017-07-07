/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.screamsDisappeared.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author David Vera
 */

public enum ZombieDogs implements Serializable {

Pug (10),
Beagle (10),
Rottweiler (30),
Bulldog (35),
Husky (32),
Pitbull (34),
Galgo (38),
Boxer (30),

Doberman (40);

private final int weight;
private final Point coordinates;
//private final String description;

    ZombieDogs(int weight) {

    this.weight = weight;
    //this.description = description;
    Random rand = new Random();
    coordinates = new Point (rand.nextInt(10),rand.nextInt(10));

    }
    
    

    public int getWeight() {
        return weight;
    }
    
    public Point getCoordinates() {
    return coordinates;

    }
    
    @Override

    public String toString() {
        String Weight = null;

    return name() + "    Weight = " + weight + ",    coordinates = (" + getCoordinates().x + ", "
                    + getCoordinates().y + ").";

    }

    /*public String getDescription() {
        return description;
    }*/

    

}
/*public class ZombieDogs  implements Comparable<ZombieDogs>{
    
    private String race, size, weight;

    public ZombieDogs(String race, String size, String weight) {
        this.race = race;
        this.size = size;
        this.weight = weight;
       
    }
    

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  race + ".    \t"+ size +".    \t"+  weight +"\n";
    }

    @Override
    public int compareTo(ZombieDogs o) {
        return race.compareTo(o.getRace());
    }
    
    
}*/
