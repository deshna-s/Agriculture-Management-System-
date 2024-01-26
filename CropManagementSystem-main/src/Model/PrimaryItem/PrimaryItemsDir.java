/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.PrimaryItem;

import java.util.ArrayList;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class PrimaryItemsDir {
    
    
    private ArrayList <PrimaryItem> primItem;
    private static PrimaryItemsDir primItemInst;
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    //Declaring the singleton instance for rawmaterial directory
    public static PrimaryItemsDir getInst()
    {
        if (primItemInst == null)
        {
            primItemInst = new PrimaryItemsDir();
        }
        return primItemInst;
    }
    
    public PrimaryItemsDir()
    {
        primItem = new ArrayList<PrimaryItem>();
    }
/*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    public ArrayList<PrimaryItem> getPrimItem() {
        return primItem;
    }

    public void setPrimItem(ArrayList<PrimaryItem> primItem) {
        this.primItem = primItem;
    }
    
    public PrimaryItem addPrimItem()
    {
        PrimaryItem primItem1 = new PrimaryItem();
        primItem.add(primItem1);
        return primItem1;
    }
   /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/ 
    public void removePrimItem(PrimaryItem primItem1)
    {
        primItem.remove(primItem1);
         
    }
    
}
