
package Model.Role;

import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Enterprise.ProducerEnt;
import Model.Organization.*;
import Model.Yield.YieldDir;
import Model.YieldReview.YieldReviewDir;
import Model.PrimaryItem.PrimaryItemsDir;
import Model.PrimaryItemReview.PrimaryItemReviewDir;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.DistributorRole.DistributorWorkAreaJPanel;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class Role_ManurerDistributor extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business,YieldDir produceDirectory, PrimaryItemsDir rmDirectory,YieldReviewDir prDirectory,PrimaryItemReviewDir rmrDirectory) {
        return new DistributorWorkAreaJPanel(userProcessContainer,account,(OrgProducerDistributor)organization, (ProducerEnt)enterprise, business);
       
    }

}
