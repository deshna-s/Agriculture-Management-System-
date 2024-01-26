
package Model.Enterprise;

import Model.Organization.OrganizationDir;
import java.util.ArrayList;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class EnterpriseDir {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDir(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    //Creating  enterprises and adding to the arraylist
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.FoodDept){
            enterprise=new FoodDeptEnt(name);
            enterpriseList.add(enterprise);
            /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            System.out.println("List has added"+enterpriseList);
        }
        else if(type==Enterprise.EnterpriseType.Producer){
            enterprise=new ProducerEnt(name);
            enterpriseList.add(enterprise);
            /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            System.out.println("List has added"+enterpriseList);
        }
        return enterprise;
    }
}
