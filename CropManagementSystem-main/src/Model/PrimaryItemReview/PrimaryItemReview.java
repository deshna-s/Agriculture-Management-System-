/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.PrimaryItemReview;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class PrimaryItemReview {
    
   
    private String stockName;
    private String yieldQlty;
    private String yieldStorageLife;
    private String extraRevirws;
    private String distributorName;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getYieldQlty() {
        return yieldQlty;
    }
/*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
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
/*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    public void setExtraRevirws(String extraRevirws) {
        this.extraRevirws = extraRevirws;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }
    
    @Override
    
    public String toString(){
        return stockName;
        
    }
}
