/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class OrganizationDir {
    
    
    private ArrayList<Organization> organizationList;

    public OrganizationDir() {
        organizationList = new ArrayList();
    }
/*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    public Organization createOrganization(Type type){
        Organization organization = null;
        
        //Adding the Organizations in the directory
        if (type.getValue().equals(Type.Farmer.getValue())){
            organization = new OrgFarmer();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Customer.getValue())){
            organization = new OrgCust();
            organizationList.add(organization);
        }
        
         else if (type.getValue().equals(Type.Warehouse.getValue())){
            organization = new OrgWH();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ManufacturerProducer.getValue())){
            organization = new OrgProduction();
            organizationList.add(organization);
        }
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        else if (type.getValue().equals(Type.ManufacturerSupplier.getValue())){
            organization = new OrgProducerDistributor();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.OfficeStaff.getValue())){
            organization = new OrgManagement();
            organizationList.add(organization);
        }
         /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
         else if (type.getValue().equals(Type.ManufacturerWarehouse.getValue())){
            organization = new OrgProducerWH();
            organizationList.add(organization);
        }
        
        return organization;
    }
    
}
