
package Model.Role;

import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Enterprise.FoodDeptEnt;
import Model.Organization.Organization;
import Model.Yield.YieldDir;
import Model.YieldReview.YieldReviewDir;
import Model.PrimaryItem.PrimaryItemsDir;
import Model.PrimaryItemReview.PrimaryItemReviewDir;
import Model.UserAccount.UserAccount;
import UI.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class Role_AdminOffice extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business,YieldDir produceDirectory, PrimaryItemsDir rmDirectory,YieldReviewDir prDirectory,PrimaryItemReviewDir rmrDirectory) {
        return new AdminWorkAreaJPanel(userProcessContainer, (FoodDeptEnt)enterprise);
    }

    
    
}
