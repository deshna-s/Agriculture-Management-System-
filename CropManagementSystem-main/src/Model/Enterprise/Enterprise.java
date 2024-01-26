/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Enterprise;


import Model.Organization.Organization;
import Model.Organization.OrganizationDir;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public abstract class Enterprise extends Organization{
    
    
    private EnterpriseType enterpriseType;
    private OrganizationDir organizationDirectory;

    public OrganizationDir getOrganizationDirectory() {
        return organizationDirectory;
    }
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    //Declaring enumeration for two enterprises
    public enum EnterpriseType{
        FoodDept("USFD"),Producer("Manufacturer");          
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDir();
    }
    
}
