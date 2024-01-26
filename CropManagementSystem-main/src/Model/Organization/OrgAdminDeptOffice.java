
package Model.Organization;

import Model.Role.Role_AdminOffice;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class OrgAdminDeptOffice extends Organization{

    public OrgAdminDeptOffice() {
        super(Type.OfficeAdmin.getValue());
    }
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Role_AdminOffice());
        return roles;
    }
     
}
