/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SoftwareUI.java
 *
 * Created on Nov 28, 2011, 3:06:41 AM
 */
package my.software;

/**
 *
 * @author Brandon
 */
public class SoftwareUI extends javax.swing.JFrame {

    /** Creates new form SoftwareUI */
    public SoftwareUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Object_Group = new javax.swing.ButtonGroup();
        Relationship_Group = new javax.swing.ButtonGroup();
        Object_Label = new javax.swing.JLabel();
        Ball_Button = new javax.swing.JRadioButton();
        Box_Button = new javax.swing.JRadioButton();
        Weight_Label = new javax.swing.JLabel();
        Weight_Text = new javax.swing.JTextField();
        Radius_Text = new javax.swing.JTextField();
        Height_Text = new javax.swing.JTextField();
        Width_Text = new javax.swing.JTextField();
        Radius_Label = new javax.swing.JLabel();
        Height_Label = new javax.swing.JLabel();
        Width_Label = new javax.swing.JLabel();
        Relationship = new javax.swing.JLabel();
        InsideR_Button = new javax.swing.JRadioButton();
        InsideU_Button = new javax.swing.JRadioButton();
        Top_Button = new javax.swing.JRadioButton();
        Behind_Button = new javax.swing.JRadioButton();
        Add_Button = new javax.swing.JButton();
        Clear_Button = new javax.swing.JButton();
        Cancel_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Object_Label.setText("Object");

        Object_Group.add(Ball_Button);
        Ball_Button.setText("Ball");

        Object_Group.add(Box_Button);
        Box_Button.setText("Box");

        Weight_Label.setText("Weight");

        Weight_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Weight_TextActionPerformed(evt);
            }
        });

        Height_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Height_TextActionPerformed(evt);
            }
        });

        Radius_Label.setText("Radius");

        Height_Label.setText("Height");

        Width_Label.setText("Width");

        Relationship.setText("Relationship to Bus");

        Relationship_Group.add(InsideR_Button);
        InsideR_Button.setText("On Top");
        InsideR_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsideR_ButtonActionPerformed(evt);
            }
        });

        Relationship_Group.add(InsideU_Button);
        InsideU_Button.setText("Inside (with a seatbelt)");

        Relationship_Group.add(Top_Button);
        Top_Button.setText("Inside (without a seatbelt)");
        Top_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Top_ButtonActionPerformed(evt);
            }
        });

        Relationship_Group.add(Behind_Button);
        Behind_Button.setText("Behind (Dragged)");

        Add_Button.setText("Add");
        Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ButtonActionPerformed(evt);
            }
        });

        Clear_Button.setText("Clear");
        Clear_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_ButtonActionPerformed(evt);
            }
        });

        Cancel_Button.setText("Cancel");
        Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("grams");

        jLabel2.setText("Object Attributes");

        jLabel3.setText("cm");

        jLabel4.setText("cm");

        jLabel5.setText("cm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ball_Button)
                    .addComponent(Box_Button)
                    .addComponent(Object_Label))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Width_Label)
                            .addComponent(Weight_Label)
                            .addComponent(Radius_Label)
                            .addComponent(Height_Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Width_Text)
                            .addComponent(Height_Text)
                            .addComponent(Radius_Text)
                            .addComponent(Weight_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Relationship)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Top_Button)
                            .addComponent(InsideU_Button)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Behind_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(InsideR_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Add_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Clear_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cancel_Button)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Weight_Label)
                            .addComponent(Weight_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Radius_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Radius_Label)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Height_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Height_Label)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Width_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Width_Label)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Object_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ball_Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Box_Button))
                            .addComponent(Relationship)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(InsideR_Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InsideU_Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Top_Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Behind_Button)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cancel_Button)
                            .addComponent(Clear_Button)
                            .addComponent(Add_Button))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void Weight_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Weight_TextActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_Weight_TextActionPerformed

private void Height_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Height_TextActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_Height_TextActionPerformed

private void Top_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Top_ButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_Top_ButtonActionPerformed

private void InsideR_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsideR_ButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_InsideR_ButtonActionPerformed

private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_Add_ButtonActionPerformed

private void Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_ButtonActionPerformed
    System.exit(0);
}//GEN-LAST:event_Cancel_ButtonActionPerformed

private void Clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_ButtonActionPerformed
    Weight_Text.setText("");
    Radius_Text.setText("");
    Height_Text.setText("");
    Width_Text.setText("");
}//GEN-LAST:event_Clear_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SoftwareUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SoftwareUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SoftwareUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SoftwareUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SoftwareUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JRadioButton Ball_Button;
    private javax.swing.JRadioButton Behind_Button;
    private javax.swing.JRadioButton Box_Button;
    private javax.swing.JButton Cancel_Button;
    private javax.swing.JButton Clear_Button;
    private javax.swing.JLabel Height_Label;
    private javax.swing.JTextField Height_Text;
    private javax.swing.JRadioButton InsideR_Button;
    private javax.swing.JRadioButton InsideU_Button;
    private javax.swing.ButtonGroup Object_Group;
    private javax.swing.JLabel Object_Label;
    private javax.swing.JLabel Radius_Label;
    private javax.swing.JTextField Radius_Text;
    private javax.swing.JLabel Relationship;
    private javax.swing.ButtonGroup Relationship_Group;
    private javax.swing.JRadioButton Top_Button;
    private javax.swing.JLabel Weight_Label;
    private javax.swing.JTextField Weight_Text;
    private javax.swing.JLabel Width_Label;
    private javax.swing.JTextField Width_Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}