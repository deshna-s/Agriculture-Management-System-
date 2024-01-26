
package UI.ManagementRole;

import Model.EcoSys;
import Model.Enterprise.*;
import Model.Enterprise.FoodDeptEnt;
import Model.Network.Network;
import Model.Organization.*;
import Model.Yield.Yield;
import Model.Yield.YieldDir;
import Model.YieldReview.YieldReview;
import Model.YieldReview.YieldReviewDir;
import Model.PrimaryItemReview.PrimaryItemReview;
import Model.PrimaryItemReview.PrimaryItemReviewDir;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
//import sun.applet.AppletViewer;
import static UI.WHManagerRole.WHWorkAreaJPanel.flag;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class ManagementWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private OrgManagement organization;
    private FoodDeptEnt enterprise;
    private UserAccount userAccount;
    private YieldDir produceDirectory;
    private YieldReviewDir prDirectory;
    private PrimaryItemReviewDir rmrDirectory;
    

    /**
     * Creates new form ManagementWorkAreaJPanel
     */
    private EcoSys business;
 
    public ManagementWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, OrgManagement organization, Enterprise enterprise,EcoSys business,YieldDir produceDirectory,YieldReviewDir prDirectory,PrimaryItemReviewDir rmrDirectory ) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = (FoodDeptEnt)enterprise;
        this.userAccount = account;
        this.business = business;
        this.produceDirectory = produceDirectory;
        this.prDirectory = prDirectory;
        this.rmrDirectory = rmrDirectory;
        
        valueLabel.setText(enterprise.getName());
        populateCustomerRequestTable();
        populateProduceTable();
        populateCustomerReviewTable();
        populateSupplierReviewTable();
       if (flag == true)
        {  
            sendToFarmerJButton.setEnabled(true);
            sendToWarehouseJButton.setEnabled(false);
            flag = false;
        }
        

    }
    
     public void populateSupplierReviewTable(){
        DefaultTableModel model = (DefaultTableModel)supplierReviewTable.getModel();
        
        
           /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        model.setRowCount(0);
        
        for(PrimaryItemReview review : rmrDirectory.getPrimaryItemReviewList()){
            Object[] row = new Object[6];
            row[0] = review;
            row[1] = review.getDistributorName();
            row[2] = review.getYieldQlty();
            
               /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            row[3] = review.getYieldStorageLife();
            row[4] = review.getExtraRevirws();
            
            model.addRow(row);
        }
        
    }

    
    public void populateCustomerReviewTable(){
        DefaultTableModel model = (DefaultTableModel)customerReviewTable.getModel();
        
        model.setRowCount(0);
        
        for(YieldReview review : prDirectory.getYieldReviewList()){
            Object[] row = new Object[6];
            row[0] = review;
            row[1] = review.getFarmerName();
            
               /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            row[2] = review.getYieldQlty();
            row[3] = review.getYieldStorageLife();
            row[4] = review.getExtraRevirws();
            
            model.addRow(row);
        }
        
    }

    public void populateCustomerRequestTable(){
     DefaultTableModel model = (DefaultTableModel)workRequestJTable1.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSender().getEmp().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmp().getName();
            row[3] = request.getStatus();
            
               /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            row[4] = request.getHarvestQty();
            row[5] = request.getPrimItemQty();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierReviewTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        customerReviewTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lineBtn = new javax.swing.JButton();
        barBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        produceTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        sendToFarmerJButton = new javax.swing.JButton();
        sendToWarehouseJButton = new javax.swing.JButton();
        sendToSupp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        customerReviewTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        supplierReviewTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        supplierReviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Raw Material", "Supplier Name", "Quality Review", "Shelf Life Review", "Additional Review"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierReviewTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 730, 90));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Customer Reviews");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, -1));

        customerReviewTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        customerReviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Crop Name", "Farmer Name", "Quality Review", "Shelf Life Review", "Additional Review"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(customerReviewTable);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, 730, 100));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Farmer Reviews");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        lineBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lineBtn.setText("Line Chart");
        lineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineBtnActionPerformed(evt);
            }
        });
        jPanel1.add(lineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 780, 180, -1));

        barBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        barBtn.setText("Bar Chart");
        barBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barBtnActionPerformed(evt);
            }
        });
        jPanel1.add(barBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 780, 180, -1));

        workRequestJTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        workRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Crop Quantity", "Raw Material Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workRequestJTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(workRequestJTable1);
        if (workRequestJTable1.getColumnModel().getColumnCount() > 0) {
            workRequestJTable1.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable1.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable1.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable1.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable1.getColumnModel().getColumn(4).setResizable(false);
            workRequestJTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 969, 96));

        produceTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        produceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Crop Name", "Quantity", "Price", "Farmer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(produceTable);
        if (produceTable.getColumnModel().getColumnCount() > 0) {
            produceTable.getColumnModel().getColumn(0).setResizable(false);
            produceTable.getColumnModel().getColumn(1).setResizable(false);
            produceTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 730, 110));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Yield Inventory");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        sendToFarmerJButton.setBackground(new java.awt.Color(51, 51, 51));
        sendToFarmerJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sendToFarmerJButton.setText("Send to Farmer");
        sendToFarmerJButton.setEnabled(false);
        sendToFarmerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToFarmerJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sendToFarmerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 225, -1));

        sendToWarehouseJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sendToWarehouseJButton.setText("Send to Warehouse Manager");
        sendToWarehouseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToWarehouseJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sendToWarehouseJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, -1, -1));

        sendToSupp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sendToSupp.setText("Send to Supplier");
        sendToSupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToSuppActionPerformed(evt);
            }
        });
        jPanel1.add(sendToSupp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 199, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Requests");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel1.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 160, 30));

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise");
        jPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 127, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Crop Demand");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 720, 180, -1));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Management");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 248, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 820));

        customerReviewTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Crop Name", "Farmer Name", "Quality Review", "Shelf Life Review", "Additional Review"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(customerReviewTable1);

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 730, 210));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UIDistributorRole.JPG"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 1560));
    }// </editor-fold>//GEN-END:initComponents

    private void sendToWarehouseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToWarehouseJButtonActionPerformed
        // TODO add your handling code here:
      int selectedRow = workRequestJTable1.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row before proceeding");
        }
        
        YieldRequest request = (YieldRequest)workRequestJTable1.getValueAt(selectedRow, 0);
        request.setStatus("sent to Warehouse Manager");
        populateCustomerRequestTable();
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        
        Organization org = null;
           /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof OrgWH){
                org = organization;
                
                   /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
                break;
            }
            else if (organization instanceof OrgWH){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
               /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        }
        
        
         sendToWarehouseJButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    JButton source = (JButton) e.getSource();
                    source.setEnabled(false);
                    source.setBackground(Color.GREEN);
            }
    });
    }//GEN-LAST:event_sendToWarehouseJButtonActionPerformed
    
    private void sendToSupplierJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToSupplierJButtonActionPerformed
        int selectedRow = workRequestJTable1.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        YieldRequest request = (YieldRequest)workRequestJTable1.getValueAt(selectedRow, 0);
        request.setStatus("sent to Manufacturer.Supplier ");
        populateCustomerRequestTable();
        
           /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof OrgProducerDistributor){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
        }
        
    }//GEN-LAST:event_sendToSupplierJButtonActionPerformed

    private void sendToSuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToSuppActionPerformed
         int selectedRow = workRequestJTable1.getSelectedRow();
        
        if (selectedRow < 0){
               /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            JOptionPane.showMessageDialog(null,"Please select a row before proceeding");
        }
        
        YieldRequest request = (YieldRequest)workRequestJTable1.getValueAt(selectedRow, 0);
        request.setStatus("Request sent to Supplier ");
        populateCustomerRequestTable();
           /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        
        Organization org = null;
           /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        for (Network network: business.getNetworkList()){
               
            for (Enterprise e: network.getEnterpriseDirectory().getEnterpriseList())
            {   
                
                if (e instanceof ProducerEnt)
                {
                       /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
                   for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
            
            if (organization instanceof OrgProducerDistributor){
                org = organization;
                System.out.println(org);
                break;
            }
        }
            if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
               /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            } 
                }
                
            }
        }
        
    }//GEN-LAST:event_sendToSuppActionPerformed

    private void workRequestJTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workRequestJTable1MouseClicked
       disableWarehouseButton();
    }//GEN-LAST:event_workRequestJTable1MouseClicked

    private void barBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barBtnActionPerformed
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
         int j= 0;
        
         for (j=0;j<workRequestJTable1.getRowCount();j++)
        {
            if (!(Integer.parseInt(String.valueOf(workRequestJTable1.getModel().getValueAt(j,4))) == 0))
            {
                String tempName = workRequestJTable1.getModel().getValueAt(j,0).toString();
                   /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            dataset.setValue(Integer.parseInt(String.valueOf(workRequestJTable1.getModel().getValueAt(j,4))), "CROPS", tempName);
            //System.out.println(dataset);
        }
        }
        
      
        JFreeChart chart = ChartFactory.createBarChart3D("DEMAND ANALYSIS REPORT","CROPS", "QUANTITY", dataset, PlotOrientation.VERTICAL, false, true, false);
        
        CategoryPlot barchart = chart.getCategoryPlot();
        
           /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        barchart.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("Bar chart" , chart);
        frame.setVisible(true);
           /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        frame.setSize(500,500);
        
        
        
    }//GEN-LAST:event_barBtnActionPerformed

    private void lineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineBtnActionPerformed
           DefaultCategoryDataset dataset = new DefaultCategoryDataset();
           
              /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
           
         int j= 0;
        
         for (j=0;j<workRequestJTable1.getRowCount();j++)
        {
            if (!(Integer.parseInt(String.valueOf(workRequestJTable1.getModel().getValueAt(j,4))) == 0))
            {   String tempName = workRequestJTable1.getModel().getValueAt(j,0).toString();
            dataset.setValue(Integer.parseInt(String.valueOf(workRequestJTable1.getModel().getValueAt(j,4))), "CROPS", tempName);
            //System.out.println(dataset);
        }
        }
         
            /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        
      
        JFreeChart chart = ChartFactory.createLineChart3D("DEMAND ANALYSIS REPORT","CROPS", "QUANTITY", dataset, PlotOrientation.VERTICAL, false, true, false);
        
        CategoryPlot barchart = chart.getCategoryPlot();
        barchart.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("Bar chart" , chart);
        frame.setVisible(true);
        frame.setSize(500,500);
    }//GEN-LAST:event_lineBtnActionPerformed

    private void sendToFarmerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToFarmerJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable1.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row before proceeding");
        }

        YieldRequest request = (YieldRequest)workRequestJTable1.getValueAt(selectedRow, 0);
        request.setStatus("Request sent to the Farmer ");
        populateCustomerRequestTable();
        /**
        *
        * /*submit the inputs and wait the output

        creates new panel for new role in the organization

        data to be defined.

        data passed in the function.

        */
        userAccount.getWorkQueue().getWorkRequestList().add(request);

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof OrgFarmer){

                /**
                *
                * /*submit the inputs and wait the output

                creates new panel for new role in the organization

                data to be defined.

                data passed in the function.

                */
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
        }
    }//GEN-LAST:event_sendToFarmerJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barBtn;
    private javax.swing.JTable customerReviewTable;
    private javax.swing.JTable customerReviewTable1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton lineBtn;
    private javax.swing.JTable produceTable;
    private javax.swing.JButton sendToFarmerJButton;
    private javax.swing.JButton sendToSupp;
    private javax.swing.JButton sendToWarehouseJButton;
    private javax.swing.JTable supplierReviewTable;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable1;
    // End of variables declaration//GEN-END:variables

    private void populateProduceTable() {
        DefaultTableModel model = (DefaultTableModel)produceTable.getModel();
        
        model.setRowCount(0);
        
        for(Yield produce : produceDirectory.getYieldList()){
            Object[] row = new Object[5];
            row[0] = produce;
            row[1] = produce.getHarvestQnty();
            row[2] = produce.getHarvestCost();
            
               /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            row[3] = produce.getFarmerName();
            model.addRow(row);
            
        }
        checkforProduce();
    }
    
             

    private void checkforProduce() {
        
        int i = 1;
        
        for (int j = 0; j < produceTable.getRowCount(); j++) {
           int tempQuantity = Integer.parseInt((String.valueOf(produceTable.getModel().getValueAt(j, i)))) ;
            if(tempQuantity == 0){
                  int delay = 4111; //ms
            ActionListener tskperf1 = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                JOptionPane.showMessageDialog(null,"Send produce request for" + "to farmer");
               
      }
  };
                Timer tme = new Timer(delay, tskperf1);
                tme.setRepeats(false);
                tme.start();
                
                 break;
            }
        }
    }

    private void disableWarehouseButton() {
        int selectedRow = workRequestJTable1.getSelectedRow();
        String requestedCrop = workRequestJTable1.getModel().getValueAt(selectedRow, 0).toString();
        int i = 0;
        
           /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        String tempName = null;
        for(int j = 0;j < produceTable.getRowCount(); j++) {
            tempName = produceTable.getModel().getValueAt(j, i).toString();
             //System.out.println(tempName);
                /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
                if(!(tempName.equals(requestedCrop))){
               continue; 
                }
                else {sendToWarehouseJButton.setEnabled(true);}
        }
        }
    
    
}
