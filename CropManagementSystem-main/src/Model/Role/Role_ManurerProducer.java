
package Model.Role;

import Model.EcoSys;
import Model.Enterprise.*;
import Model.Organization.*;
import Model.Yield.YieldDir;
import Model.YieldReview.YieldReviewDir;
import Model.PrimaryItem.PrimaryItemsDir;
import Model.PrimaryItemReview.PrimaryItemReviewDir;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.ProducerRole.ManurerProducerJPanel;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class Role_ManurerProducer extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business,YieldDir produceDirectory, PrimaryItemsDir rmDirectory,YieldReviewDir prDirectory,PrimaryItemReviewDir rmrDirectory) {
        return new ManurerProducerJPanel(userProcessContainer,account, (OrgProduction)organization,(ProducerEnt)enterprise,business,rmDirectory);
    }

}
