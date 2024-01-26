/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.YieldReview;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class YieldReview {
    
    String harvestName;
    String farmerName;
    String yieldQlty;
    
    //Yield Storage
    String yieldStorageLife;
    String extraRevirws;


    public String getHarvestName() {
        return harvestName;
    }

    public void setHarvestName(String harvestName) {
        this.harvestName = harvestName;
    }
    
    //Yield Storage
    public String getFarmerName() {
        return farmerName;
    }
//Yield Storage
    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }
    
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    
    public String getYieldQlty() {
        return yieldQlty;
    }
//Yield Storage
    public void setYieldQlty(String yieldQlty) {
        this.yieldQlty = yieldQlty;
    }

    public String getYieldStorageLife() {
        return yieldStorageLife;
    }
    
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/

    public void setYieldStorageLife(String yieldStorageLife) {
        this.yieldStorageLife = yieldStorageLife;
    }

    public String getExtraRevirws() {
        return extraRevirws;
    }
//Yield Storage
    public void setExtraRevirws(String extraRevirws) {
        this.extraRevirws = extraRevirws;
    }
    //Overrideing functions
    @Override
    public String toString(){
        return harvestName;
    }
    
}
