
package Model.Role;

import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Enterprise.FoodDeptEnt;
import Model.Organization.OrgCust;
import Model.Organization.OrgFarmer;
import Model.Organization.Organization;
import Model.Yield.YieldDir;
import Model.YieldReview.YieldReviewDir;
import Model.PrimaryItem.PrimaryItemsDir;
import Model.PrimaryItemReview.PrimaryItemReviewDir;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.CustRole.CustWorkAreaJPanel;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class Role_Cust extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business,YieldDir yieldDir, PrimaryItemsDir rmDir,YieldReviewDir prDir,PrimaryItemReviewDir rmrDir) {
        return new CustWorkAreaJPanel(userProcessContainer,account, (OrgCust)organization,(FoodDeptEnt)enterprise,prDir);
        
    }

}

        