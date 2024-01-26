/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Yield;

import java.util.ArrayList;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class YieldDir {
    
    
    private ArrayList<Yield>yieldList;
    private static YieldDir yieldInst;
    
    //Setting the singleton method for produce
     public static YieldDir getInstance(){
        if(yieldInst==null){
            System.out.println("Inside get instance");
            yieldInst=new YieldDir();
        }
        return yieldInst;
    }
    
    public YieldDir(){
        yieldList = new ArrayList<Yield>();
        
        
    }

    public void setYieldList(ArrayList<Yield> yieldList) {
        this.yieldList = yieldList;
    }

    public ArrayList<Yield> getYieldList() {
        return yieldList;
    }
    
      public Yield addYield() {
        Yield yield = new Yield();
        yieldList.add(yield);
        return yield;
    }
    
    public void removeYield(Yield yield) {
        yieldList.remove(yield);
    }
    
}
