
package Model.Organization;

import Model.Role.Role_ManurerProducer;
import Model.Role.Role;
import Model.Role.Role_WHManager;
import java.util.ArrayList;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class OrgWH extends Organization {
    public OrgWH(){
        super(Type.Warehouse.getValue());
    }
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Role_WHManager());
        return roles;
    }  
}
