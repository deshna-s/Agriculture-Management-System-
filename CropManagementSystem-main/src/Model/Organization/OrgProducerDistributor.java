
package Model.Organization;

import Model.Role.Role_ManurerAdmin;
import Model.Role.Role_ManurerDistributor;
import Model.Role.Role_ManurerDistributor;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class OrgProducerDistributor extends Organization{
    
    public OrgProducerDistributor(){
        super(Type.ManufacturerSupplier.getValue());
    }
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Role_ManurerDistributor());
        return roles;
    }  
}
