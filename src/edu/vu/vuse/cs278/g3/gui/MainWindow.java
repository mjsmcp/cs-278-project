/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainWindow.java
 *
 * Created on Nov 29, 2011, 1:13:19 AM
 */
package edu.vu.vuse.cs278.g3.gui;
import org.nlogo.lite.InterfaceComponent;

/**
 *
 * @author Amber Maria
 */
public class MainWindow extends javax.swing.JFrame {

    /** Creates new form MainWindow */
    public MainWindow() {
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

        addObject = new javax.swing.JButton();
        editObject = new javax.swing.JButton();
        runSimulation = new javax.swing.JButton();
        stopSimulation = new javax.swing.JButton();
        pauseSimulation = new javax.swing.JButton();
        busAcceleration = new javax.swing.JSlider();
        busDeceleration = new javax.swing.JSlider();
        busAccelerationLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sillyNetLogo = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        busAccelerationLabelValue = new javax.swing.JLabel();
        busDecelerationLabelValue = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addObject.setText("Add Object");
        addObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addObjectActionPerformed(evt);
            }
        });

        editObject.setText("Edit Object");
        editObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editObjectActionPerformed(evt);
            }
        });

        runSimulation.setText("Run Simulation");
        runSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runSimulationActionPerformed(evt);
            }
        });

        stopSimulation.setText("Stop Simulation");

        pauseSimulation.setText("Pause Simulation");
        pauseSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseSimulationActionPerformed(evt);
            }
        });

        busAcceleration.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                busAccelerationStateChanged(evt);
            }
        });

        busDeceleration.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                busDecelerationStateChanged(evt);
            }
        });

        busAccelerationLabel.setText("Bus Acceleration");

        jLabel2.setText("Bus Deceleration");

        sillyNetLogo.setVisible(true);
        sillyNetLogo.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                //sillyNetLogoInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });        

        javax.swing.GroupLayout sillyNetLogoLayout = new javax.swing.GroupLayout(sillyNetLogo.getContentPane());
        sillyNetLogo.getContentPane().setLayout(sillyNetLogoLayout);
        sillyNetLogoLayout.setHorizontalGroup(
            sillyNetLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        sillyNetLogoLayout.setVerticalGroup(
            sillyNetLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        
		new Thread() {
			
			public void run() {
				try 
		        {
		            //final javax.swing.JFrame frame = new javax.swing.JFrame();
		            final InterfaceComponent comp = new InterfaceComponent(this);
		            java.awt.EventQueue.invokeAndWait	//breaks here
		                ( new Runnable()
		                    { public void run() {
		                   	 add(comp);
		                        try {
		                          comp.open("./CS278.nlogo");
		                        }
		                        catch(Exception ex) {
		                          ex.printStackTrace();
		                        }
		                    } } ) ;
		
		        }
		        catch(Exception ex) {
		            ex.printStackTrace();
		        }
		
		
			}
		}.start();

jLabel3.setText("0");

        jLabel4.setText("100");

        jLabel5.setText("0");

        jLabel6.setText("100");

        busAccelerationLabelValue.setText("50");

        busDecelerationLabelValue.setText("50");

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenu3.setText("New");
        jMenu1.add(jMenu3);

        jMenu4.setText("Open");
        jMenu1.add(jMenu4);

        jMenu5.setText("Save");
        jMenu1.add(jMenu5);

        jMenu6.setText("Exit");
        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(busAcceleration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(busDeceleration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6))))
                            .addComponent(stopSimulation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(runSimulation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editObject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addObject, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(pauseSimulation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(busAccelerationLabel)
                        .addGap(18, 18, 18)
                        .addComponent(busAccelerationLabelValue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(busDecelerationLabelValue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(sillyNetLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(addObject)
                        .addGap(18, 18, 18)
                        .addComponent(editObject)
                        .addGap(18, 18, 18)
                        .addComponent(runSimulation)
                        .addGap(18, 18, 18)
                        .addComponent(stopSimulation)
                        .addGap(18, 18, 18)
                        .addComponent(pauseSimulation)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(busAcceleration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(busAccelerationLabel)
                            .addComponent(busAccelerationLabelValue))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(busDeceleration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(busDecelerationLabelValue)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(sillyNetLogo)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void addObjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addObjectActionPerformed
// TODO add your handling code here:
    new ObjectUI().setVisible(true);
}//GEN-LAST:event_addObjectActionPerformed

private void editObjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editObjectActionPerformed
// TODO add your handling code here:
    new EditObjectUI().setVisible(true);
}//GEN-LAST:event_editObjectActionPerformed

private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
// TODO add your handling code here:
    System.exit(0);
}//GEN-LAST:event_jMenu1ActionPerformed

private void jInternalFrame1InternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
	//GEN-FIRST:event_jInternalFrame1InternalFrameActivated

}
//GEN-LAST:event_jInternalFrame1InternalFrameActivated

private void runSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runSimulationActionPerformed
// TODO add your handling code here:
    int busAccel = busAcceleration.getValue();
    int busDecel = busDeceleration.getValue();
}//GEN-LAST:event_runSimulationActionPerformed

private void pauseSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseSimulationActionPerformed
// TODO add your handling code here:
    
}//GEN-LAST:event_pauseSimulationActionPerformed

private void busAccelerationStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_busAccelerationStateChanged
// TODO add your handling code here:
    int tmp = busAcceleration.getValue();
    String tmpBusAccel = Integer.toString(tmp);
    busAccelerationLabelValue.setText(tmpBusAccel);
}//GEN-LAST:event_busAccelerationStateChanged

private void busDecelerationStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_busDecelerationStateChanged
// TODO add your handling code here:
    int tmp = busDeceleration.getValue();
    String tmpBusDecel = Integer.toString(tmp);
    busDecelerationLabelValue.setText(tmpBusDecel);
    busDecelerationLabelValue.setEnabled(true);                   
}//GEN-LAST:event_busDecelerationStateChanged

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addObject;
    private javax.swing.JSlider busAcceleration;
    private javax.swing.JLabel busAccelerationLabel;
    private javax.swing.JLabel busAccelerationLabelValue;
    private javax.swing.JSlider busDeceleration;
    private javax.swing.JLabel busDecelerationLabelValue;
    private javax.swing.JButton editObject;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton pauseSimulation;
    private javax.swing.JButton runSimulation;
    private javax.swing.JInternalFrame sillyNetLogo;
    private javax.swing.JButton stopSimulation;
    // End of variables declaration//GEN-END:variables
}
