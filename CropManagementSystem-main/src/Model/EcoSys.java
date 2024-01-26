/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Model.Network.Network;
import Model.Organization.Organization;
import Model.Yield.YieldDir;
import Model.YieldReview.YieldReviewDir;
import Model.PrimaryItem.PrimaryItemsDir;
import Model.PrimaryItemReview.PrimaryItemReviewDir;
import Model.Role.Role;
import Model.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class EcoSys extends Organization {
    private static EcoSys business;
    private ArrayList<Network> networkList;
    private YieldDir yieldDir;
    private PrimaryItemsDir rmDir;
    private YieldReviewDir yieldReviewDir;
    private PrimaryItemReviewDir rmReviewDir;
    

    public PrimaryItemsDir getRmDir() {
        return rmDir;
    }

    public void setRmDir(PrimaryItemsDir rmDir) {
        this.rmDir = rmDir;
    }
    public YieldDir getYieldDir() {
        return yieldDir;
    }

    public void setYieldDir(YieldDir yieldDir) {
        this.yieldDir = yieldDir;
    }

    public YieldReviewDir getYieldReviewDir() {
        return yieldReviewDir;
    }
/*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    public void setYieldReviewDir(YieldReviewDir yieldReviewDir) {
        this.yieldReviewDir = yieldReviewDir;
    }

    public PrimaryItemReviewDir getRmReviewDir() {
        return rmReviewDir;
    }
/*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    public void setRmReviewDir(PrimaryItemReviewDir rmReviewDir) {
        this.rmReviewDir = rmReviewDir;
    }

    
    
    
    // Initializing the singleton instance of Ecosystem
    public static EcoSys getInstance(){
        if(business==null){
            business=new EcoSys();
            System.out.println("Ecosystem has been initialized"+business);
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    //Setting the constructor of Ecosystem containing other singleton instance
    private EcoSys(){
        super(null);
        networkList=new ArrayList<Network>();
        yieldDir = YieldDir.getInstance();
        rmDir = PrimaryItemsDir.getInst();
        yieldReviewDir = YieldReviewDir.getInst();
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        rmReviewDir = PrimaryItemReviewDir.getInst();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    // Method for checking unique username
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDir().checkIfUsernameIsUnique(userName)){
            return false;
        }
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        for(Network network:networkList){
            
        }
        return true;
    }
}
