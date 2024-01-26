
package Model.Enterprise;

import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class FoodDeptEnt extends Enterprise {
    
    public FoodDeptEnt(String name){
        super(name,EnterpriseType.FoodDept);
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
