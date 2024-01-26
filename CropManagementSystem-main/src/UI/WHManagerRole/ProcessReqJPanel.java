
package UI.WHManagerRole;


import Model.WorkQueue.YieldRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class ProcessReqJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    YieldRequest request;
    
    
    
       /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    public ProcessReqJPanel(JPanel userProcessContainer, YieldRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        //populate under combo box
        populateResultCombo();
    }

      /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SBTJButton = new javax.swing.JButton();
        jLabel121 = new javax.swing.JLabel();
        bkJButton = new javax.swing.JButton();
        rsltComboBox = new javax.swing.JComboBox();
        jLabel223 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SBTJButton.setBackground(new java.awt.Color(255, 102, 102));
        SBTJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SBTJButton.setText("Submit Result");
        SBTJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBTJButtonActionPerformed(evt);
            }
        });
        add(SBTJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jLabel121.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel121.setText("Produce Result");
        add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 140, 40));

        bkJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bkJButton.setText("Back");
        bkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkJButtonActionPerformed(evt);
            }
        });
        add(bkJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 690, 120, 50));

        rsltComboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(rsltComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 248, -1));

        jLabel223.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel223.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel223.setText("Produce Request Result");
        add(jLabel223, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -10, 375, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UIAdministrativeRole.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 810));
    }// </editor-fold>//GEN-END:initComponents
    
    private void bkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        
        //Having to Produce this is a request.
        WHWorkAreaJPanel wwjp = (WHWorkAreaJPanel) component;
        wwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_bkJButtonActionPerformed
   /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    private void SBTJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBTJButtonActionPerformed
      
        String status = (String) rsltComboBox.getSelectedItem();
//request status set here below.
//under process
        request.setStatus(status);
    }//GEN-LAST:event_SBTJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SBTJButton;
    private javax.swing.JButton bkJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JComboBox rsltComboBox;
    // End of variables declaration//GEN-END:variables

       /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    private void populateResultCombo() {
        rsltComboBox.addItem("Done");
           }
}
