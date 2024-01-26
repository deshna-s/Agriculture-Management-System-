
package UI.CustRole;

import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Enterprise.FoodDeptEnt;
import Model.Organization.OrgCust;
import Model.YieldReview.YieldReview;
import Model.YieldReview.YieldReviewDir;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.YieldRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class CustWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private OrgCust organization;
    private UserAccount userAccount;
    private FoodDeptEnt enterprise;
    private YieldReviewDir prDirectory;
     private ButtonGroup qualitybg = new ButtonGroup();
    private ButtonGroup shelfbg = new ButtonGroup();
    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    public CustWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, OrgCust organization, Enterprise enterprise,YieldReviewDir prDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = (FoodDeptEnt)enterprise;
        this.userAccount = account;
        this.prDirectory = prDirectory;
        valLbl.setText(enterprise.getName());
        populateRequestTable();
        qualitygroupbutton();
         shelfgroupbutton();
        //checkCompletion();
    }
     private void qualitygroupbutton() {
//        qualitybg.add(wertRadioButton);
//        qualitybg.add(qvgRadioButton);
//        qualitybg.add(qgRDBTN);
//        qualitybg.add(qaRDBTN);
//        qualitybg.add(qpRDBTN);
    }
    
     private void shelfgroupbutton() {
//        shelfbg.add(sleRDBTN);
//        shelfbg.add(svgRDBTN);
//        shelfbg.add(sgRDBTN);
//        shelfbg.add(saRDBTN);
//        shelfbg.add(spRDBTN);
    }

    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) wrkReqJTab.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            row[3] = request.getHarvestQty();
            model.addRow(row);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        wrkReqJTab = new javax.swing.JTable();
        reqTestJBtn = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        revBTN = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wrkReqJTab.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wrkReqJTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Receiver", "Status", "Crop Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(wrkReqJTab);
        if (wrkReqJTab.getColumnModel().getColumnCount() > 0) {
            wrkReqJTab.getColumnModel().getColumn(0).setResizable(false);
            wrkReqJTab.getColumnModel().getColumn(1).setResizable(false);
            wrkReqJTab.getColumnModel().getColumn(2).setResizable(false);
            wrkReqJTab.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 620, 165));

        reqTestJBtn.setBackground(new java.awt.Color(0, 204, 0));
        reqTestJBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reqTestJBtn.setText("Request Yield");
        reqTestJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqTestJBtnActionPerformed(evt);
            }
        });
        add(reqTestJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 220, 60));

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 127, 30));

        valLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(valLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 158, 26));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Review Crop");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 198, -1));

        revBTN.setBackground(new java.awt.Color(0, 204, 0));
        revBTN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        revBTN.setText("Review Yield");
        revBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revBTNActionPerformed(evt);
            }
        });
        add(revBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 190, 60));

        submitButton.setBackground(new java.awt.Color(102, 255, 102));
        submitButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 160, -1));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Customer ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 9, 334, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UICustRole.jpg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1000, 800));
    }// </editor-fold>//GEN-END:initComponents
    private void checkCompletion() {
    int tmp21 = wrkReqJTab.getRowCount();
    final String cultivateName = wrkReqJTab.getModel().getValueAt(tmp21, 0).toString();
    String fnlStat = wrkReqJTab.getModel().getValueAt(tmp21, 2).toString();
    final int qty = Integer.parseInt((String.valueOf(wrkReqJTab.getModel().getValueAt(tmp21, 4))));
    if(fnlStat.equalsIgnoreCase("Request Completed!")){
        int pause = 2111; //ms
            ActionListener tskPerf = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "The request for " +cultivateName+ " of quantity " +qty+ " has been successfully delivered!");      
                }
  };
                Timer tmw = new Timer(pause, tskPerf);
                tmw.setRepeats(false);
                tmw.start();
      
    }
    }
    
    private void reqTestJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqTestJBtnActionPerformed
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestProduceJPanel", new ReqYieldJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_reqTestJBtnActionPerformed

    private void revBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revBTNActionPerformed
        // TODO add your handling code here:
         int scltRecord = wrkReqJTab.getSelectedRow();

        if (scltRecord < 0){
            JOptionPane.showMessageDialog(null, "Kindly select a record");
            return;
        }
       
       String status = wrkReqJTab.getValueAt(scltRecord, 2).toString();
       
       if(status.equalsIgnoreCase("Request fulfilled") || status.equalsIgnoreCase("Completed") || status.equalsIgnoreCase("done")){
//            wertRadioButton.setEnabled(true);
//            qvgRadioButton.setEnabled(true);
//            qgRDBTN.setEnabled(true);
//            qaRDBTN.setEnabled(true);
//            qpRDBTN.setEnabled(true);
//
//            sleRDBTN.setEnabled(true);
//            svgRDBTN.setEnabled(true);
//            sgRDBTN.setEnabled(true);
//            saRDBTN.setEnabled(true);
//            spRDBTN.setEnabled(true);
//            
//            extraRevwText.setEnabled(true);
        
       }
       else{
           JOptionPane.showMessageDialog(null, "Request not Completed");
       }
   
    }//GEN-LAST:event_revBTNActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = wrkReqJTab.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Kindly select a record");
            return;
        }
        else{
             String status = wrkReqJTab.getValueAt(selectedRow, 2).toString();
       String cropName = wrkReqJTab.getValueAt(selectedRow, 0).toString();
       String farmerName = wrkReqJTab.getValueAt(selectedRow, 1).toString();
        if(status.equalsIgnoreCase("Request fulfilled") || status.equalsIgnoreCase("Completed") || status.equalsIgnoreCase("done") ){
        YieldReview pr = prDirectory.addYieldReview();
        pr.setHarvestName(cropName);
        pr.setFarmerName(farmerName);
        
        String quality = null;
//        if(wertRadioButton.isSelected())
//        quality = "Excellent";
//        else if (qvgRadioButton.isSelected())
//        quality = "Very Good";
//        else if (qgRDBTN.isSelected())
//        quality = "Good";
//        else if (qaRDBTN.isSelected())
//        quality = "Average";
//        else if(qpRDBTN.isSelected())
//        quality = "Poor";

        

        String shelfLife = null;
        
//        if(sleRDBTN.isSelected())
//        shelfLife = "Excellent";
//        else if (svgRDBTN.isSelected())
//        shelfLife = "Very Good";
//        else if (sgRDBTN.isSelected())
//        shelfLife = "Good";
//        else if (saRDBTN.isSelected())
//        shelfLife = "Average";
//        else if(spRDBTN.isSelected())
//        shelfLife = "Poor";
        if (shelfLife == null && quality == null)
        {
            JOptionPane.showMessageDialog(null,"A field is missing");
        }
        else
        {
        pr.setYieldQlty(quality);
        pr.setYieldStorageLife(shelfLife);
//        pr.setExtraRevirws(extraRevwText.getText());
        }
        }
//       
//        wertRadioButton.setEnabled(false);
//            qvgRadioButton.setEnabled(false);
//            qgRDBTN.setEnabled(false);
//            qaRDBTN.setEnabled(false);
//            qpRDBTN.setEnabled(false);
//
//            sleRDBTN.setEnabled(false);
//            svgRDBTN.setEnabled(false);
//            sgRDBTN.setEnabled(false);
//            saRDBTN.setEnabled(false);
//            spRDBTN.setEnabled(false);
//            
//            extraRevwText.setEnabled(false);
        }    
            qualitybg.clearSelection();
            shelfbg.clearSelection();
           
//            extraRevwText.setText(" ");
    }//GEN-LAST:event_submitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reqTestJBtn;
    private javax.swing.JButton revBTN;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel valLbl;
    private javax.swing.JTable wrkReqJTab;
    // End of variables declaration//GEN-END:variables
}