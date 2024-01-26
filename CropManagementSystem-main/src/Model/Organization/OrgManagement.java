
package Model.Organization;

import Model.Role.Role;
import Model.Role.Role_Management;
import java.util.ArrayList;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class OrgManagement extends Organization{

    public OrgManagement() {
        super(Organization.Type.OfficeStaff.getValue());
    }
/*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Role_Management());
        return roles;
    }
     
   
    
    
}
