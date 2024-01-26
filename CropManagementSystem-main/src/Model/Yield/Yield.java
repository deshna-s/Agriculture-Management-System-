/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Yield;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class Yield {
    
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    private String harvestName;
    private int harvestQnty;
    private double harvestCost;
    private String farmerName;
    
    //Declaring the getter setter for the varaibles
    public String getHarvestName() {
        return harvestName;
    }

    public void setHarvestName(String harvestName) {
        this.harvestName = harvestName;
    }
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/

    public int getHarvestQnty() {
        return harvestQnty;
    }

    public void setHarvestQnty(int harvestQnty) {
        this.harvestQnty = harvestQnty;
    }

    public double getHarvestCost() {
        return harvestCost;
    }
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/

    public void setHarvestCost(double harvestCost) {
        this.harvestCost = harvestCost;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    
     @Override
    public String toString() {
        return harvestName;
    }
    
}
