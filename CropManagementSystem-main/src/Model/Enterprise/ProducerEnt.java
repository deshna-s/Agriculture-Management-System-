
package Model.Enterprise;

import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class ProducerEnt extends Enterprise {
    
     public ProducerEnt(String name){
        super(name,Enterprise.EnterpriseType.Producer);
    }
     /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
