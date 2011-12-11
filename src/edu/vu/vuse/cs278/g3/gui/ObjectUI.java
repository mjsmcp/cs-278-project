/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ObjectUI.java
 *
 * Created on Nov 28, 2011, 3:06:41 AM
 */
package edu.vu.vuse.cs278.g3.gui;
import edu.vu.vuse.cs278.g3.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Class that handles the Add Object dialog
 * @author Amber
 */
public class ObjectUI extends javax.swing.JFrame {
	
    /**
     * Constructor. Calls initComponents to declare and initialize all fields of the dialog and
     * sets the sliders to a neutral value.
     */
    public ObjectUI() {
        initComponents();
        weightValue.setValue(2);
        //heightValue.setValue(2);
        widthValue.setValue(2);
        radiusValue.setValue(2);
        ballButton.setSelected(true);
        widthValue.setEnabled(false);
        //heightValue.setEnabled(false);
        insideRButton.setSelected(true);
        this.requestFocus();
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
        ballButton = new javax.swing.JRadioButton();
        boxButton = new javax.swing.JRadioButton();
        Weight_Label = new javax.swing.JLabel();
        Radius_Label = new javax.swing.JLabel();
        Width_Label = new javax.swing.JLabel();
        Relationship = new javax.swing.JLabel();
        insideRButton = new javax.swing.JRadioButton();
        insideUButton = new javax.swing.JRadioButton();
        topButton = new javax.swing.JRadioButton();
        behindButton = new javax.swing.JRadioButton();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        weightValue = new javax.swing.JSlider();
        radiusValue = new javax.swing.JSlider();
        widthValue = new javax.swing.JSlider();
        weightLabelValue = new javax.swing.JLabel();
        radiusLabelValue = new javax.swing.JLabel();
        widthLabelValue = new javax.swing.JLabel();
        inFrontButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Object_Label.setText("Object");

        Object_Group.add(ballButton);
        ballButton.setText("Ball");
        ballButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ballButtonActionPerformed(evt);
            }
        });

        Object_Group.add(boxButton);
        boxButton.setText("Box");
        boxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxButtonActionPerformed(evt);
            }
        });

        Weight_Label.setText("Weight");

        Radius_Label.setText("Radius");

        Width_Label.setText("Width");

        Relationship.setText("Relationship to Bus");

        Relationship_Group.add(insideRButton);
        insideRButton.setText("Inside (with a seatbelt)");
        insideRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insideRButtonActionPerformed(evt);
            }
        });

        Relationship_Group.add(insideUButton);
        insideUButton.setText("Inside (without a seatbelt)");

        Relationship_Group.add(topButton);
        topButton.setText("On Top");

        Relationship_Group.add(behindButton);
        behindButton.setText("Behind (Dragged)");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Object Attributes");

        weightValue.setMaximum(4);
        weightValue.setMinimum(1);
        weightValue.setSnapToTicks(true);
        weightValue.setValue(2);
        weightValue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                weightValueStateChanged(evt);
            }
        });

        radiusValue.setMaximum(4);
        radiusValue.setMinimum(1);
        radiusValue.setSnapToTicks(true);
        radiusValue.setValue(2);
        radiusValue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radiusValueStateChanged(evt);
            }
        });

        widthValue.setMaximum(4);
        widthValue.setMinimum(1);
        widthValue.setSnapToTicks(true);
        widthValue.setValue(2);
        widthValue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                widthValueStateChanged(evt);
            }
        });

        weightLabelValue.setText("medium");

        radiusLabelValue.setText("medium");

        widthLabelValue.setText("medium");

        Relationship_Group.add(inFrontButton);
        inFrontButton.setText("In Front of");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Object_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ballButton)
                                    .addComponent(boxButton))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Weight_Label)
                                            .addComponent(Radius_Label)
                                            .addComponent(Width_Label))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(widthValue, 0, 0, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(radiusValue, 0, 0, Short.MAX_VALUE)
                                                .addComponent(weightValue, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(widthLabelValue)
                                            .addComponent(weightLabelValue)
                                            .addComponent(radiusLabelValue))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addComponent(jLabel2))))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Relationship)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(behindButton)
                                    .addComponent(inFrontButton)
                                    .addComponent(insideUButton)
                                    .addComponent(insideRButton)
                                    .addComponent(topButton))))
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)
                        .addGap(193, 193, 193))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Relationship)
                    .addComponent(Object_Label)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(topButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insideRButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insideUButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(behindButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inFrontButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Weight_Label)
                                    .addComponent(weightValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Radius_Label)
                                    .addComponent(radiusValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(weightLabelValue)
                                .addGap(18, 18, 18)
                                .addComponent(radiusLabelValue)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Width_Label)
                            .addComponent(widthLabelValue)
                            .addComponent(widthValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ballButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(clearButton)
                    .addComponent(cancelButton))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void topButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_topButtonActionPerformed

private void insideRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insideRButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_insideRButtonActionPerformed

/**
 * The action that happens when the Add Button is pressed.  We save all the values and create a
 * new object, giving it those values. The object is then passed to NetLogo for displaying.
 * @param evt
 */
private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
	// "preprocessor"
	int MY_OFFSET = 5;
	int BUS_STREET_CONTACT = -33;
	int BUS_LENGTH = 286;
	int BOX_OFFSET = 100;
	int TOP_OF_BUS = 50;
	
    System.out.println("add object");
	double weight = weightValue.getValue();
    double radius = radiusValue.getValue();
    //double height = heightValue.getValue();
    double width = widthValue.getValue();
    int x = 0, y = 0;
    
    // get the bus object for the x, y coordinates
    PhysicsObject bus = ObjectManager.getInstance().getObject("bus");
    double busX = bus.getXCoord();
    double busY = bus.getYCoord();
    System.out.println("busX = " + busX + "\tbusY = " + busY);

    // If we are creating a box...
    if (boxButton.isSelected())
    {
    	System.out.println("making box");
    	if (topButton.isSelected())
    	{
        	x = (int)busX;
        	y = (int)(busY + width + TOP_OF_BUS);
    	}
    	else if (insideRButton.isSelected())
    	{
            x = (int)busX;
            y = (int)(width*(double)MY_OFFSET);
    	}
    	else if (insideUButton.isSelected())
    	{
    		/// TODO
    		x = (int)busX;
            y = (int)(width*(double)MY_OFFSET);
    	}
    	else if (behindButton.isSelected())
    	{
    		x = (int)(-0.5*(double)BUS_LENGTH);
            y = BUS_STREET_CONTACT;
    	}
    	else if (inFrontButton.isSelected())
    	{
        	x = (int)(0.5*(double)BUS_LENGTH);
        	y = BUS_STREET_CONTACT;
    	}
        	
        PhysicsObject boxOb = ObjectManager.getInstance().createSquare(x, y, (width*BOX_OFFSET), weight);
        ObjectManager.getInstance().addObject("leObj", boxOb);
        System.out.println("width = " + ((SquareObject)boxOb).getWidth());
        System.out.println("weight = " + boxOb.getMass());
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    // else if we are creating a ball...
    else if (ballButton.isSelected())
    {
    	System.out.println("making ball");
    	if (topButton.isSelected())
    	{
        	x = (int)busX;
        	y = (int)(busY + radius + TOP_OF_BUS);
    	}
    	else if (insideRButton.isSelected())
    	{
            x = (int)busX;
            y = (int)(radius*(double)MY_OFFSET);
    	}
    	else if (insideUButton.isSelected())
    	{
    		x = (int)busX;
            y = (int)(radius*(double)MY_OFFSET);
    	}
    	else if (behindButton.isSelected())
    	{
    		x = (int)(-0.5*BUS_LENGTH);
            y = (int)(BUS_STREET_CONTACT);
    	}
    	else if (inFrontButton.isSelected())
    	{
        	x = (int)(0.5*BUS_LENGTH);
        	y = (int)(BUS_STREET_CONTACT);
    	}
        PhysicsObject ballOb = ObjectManager.getInstance().createCircle(x, y, (radius*MY_OFFSET), weight);
        ObjectManager.getInstance().addObject("object", ballOb);
        System.out.println("weight = " + ballOb.getMass());
        System.out.println("radius = " + ((RoundObject)ballOb).getRadius());
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    } 
    // if the world crashed and died...
    else 
    {
    	System.out.println("failboat");
    }

    this.dispose();
}//GEN-LAST:event_addButtonActionPerformed

/**
 * Action that happens when the cancel button is pressed. This closes the dialog without saving
 * any of that data.
 * @param evt
 */
private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
	this.dispose();
	MainWindow.addObject.setEnabled(true);
	MainWindow.editObject.setEnabled(false);
	MainWindow.runSimulation.setEnabled(false);
}//GEN-LAST:event_cancelButtonActionPerformed

/**
 * The action that happens when the Clear Button is pressed.  All fields go to 0, empty of neutral
 * and re-enables things as needed.
 * @param evt
 */
private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
    weightValue.setValue(0);
    radiusValue.setValue(0);
    //heightValue.setValue(0);
    widthValue.setValue(0);
    Object_Group.clearSelection();
    Relationship_Group.clearSelection();
    
    // re-enable everything
    weightValue.setEnabled(true);
    radiusValue.setEnabled(true);
    //heightValue.setEnabled(true);
    widthValue.setEnabled(true);
}//GEN-LAST:event_clearButtonActionPerformed

/**
 * If the user selects Ball as object type, we disable the fields for height and weight because
 * they do not apply.
 * @param evt
 */
private void ballButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ballButtonActionPerformed
// TODO add your handling code here:
    widthValue.setEnabled(false);
    //heightValue.setEnabled(false);
    radiusValue.setEnabled(true);
}//GEN-LAST:event_ballButtonActionPerformed

/**
 * If the user selects Box as object type, we disable the field for radius because it does not apply.
 * @param evt
 */
private void boxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxButtonActionPerformed
// TODO add your handling code here:
    radiusValue.setEnabled(false);
    //heightValue.setEnabled(true);
    widthValue.setEnabled(true);
}//GEN-LAST:event_boxButtonActionPerformed

/**
 * Action that happens when the Weight Slider is changed. We update the label beside it so the user
 * can see the weight of the object.
 * @param evt
 */
private void weightValueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_weightValueStateChanged
    int tmp = weightValue.getValue();
    String tmpWeight = "";
    switch (tmp)
    {
        case 1: tmpWeight = "small";  break;
        case 2: tmpWeight = "medium"; break;
        case 3: tmpWeight = "large";  break;
        case 4: tmpWeight = "xlarge"; break;
    }
    weightLabelValue.setText(tmpWeight);
}//GEN-LAST:event_weightValueStateChanged

/**
 * Action that happens when the Radius Slider is changed. We update the label beside it so the user
 * can see the radius of the object.
 * @param evt
 */
private void radiusValueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radiusValueStateChanged
    int tmp = radiusValue.getValue();
    String tmpRadius = "";
    switch (tmp)
    {
        case 1: tmpRadius = "small";  break;
        case 2: tmpRadius = "medium"; break;
        case 3: tmpRadius = "large";  break;
        case 4: tmpRadius = "xlarge"; break;
    }
    radiusLabelValue.setText(tmpRadius);
}//GEN-LAST:event_radiusValueStateChanged

/**
 * Action that happens when the Height Slider is changed. We update the label beside it so the user
 * can see the height of the object.
 * @param evt
 */
/**
 * Action that happens when the width Slider is changed. We update the label beside it so the user
 * can see the width of the object.
 * @param evt
 */
private void widthValueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_widthValueStateChanged
    int tmp = widthValue.getValue();
    String tmpWidth = "";
    switch (tmp)
    {
        case 1: tmpWidth = "small";  break;
        case 2: tmpWidth = "medium"; break;
        case 3: tmpWidth = "large";  break;
        case 4: tmpWidth = "xlarge"; break;
    }
    widthLabelValue.setText(tmpWidth);
}//GEN-LAST:event_widthValueStateChanged

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
            java.util.logging.Logger.getLogger(ObjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ObjectUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Object_Group;
    private javax.swing.JLabel Object_Label;
    private javax.swing.JLabel Radius_Label;
    private javax.swing.JLabel Relationship;
    private javax.swing.ButtonGroup Relationship_Group;
    private javax.swing.JLabel Weight_Label;
    private javax.swing.JLabel Width_Label;
    private javax.swing.JButton addButton;
    private javax.swing.JRadioButton ballButton;
    private javax.swing.JRadioButton behindButton;
    private javax.swing.JRadioButton boxButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JRadioButton inFrontButton;
    private javax.swing.JRadioButton insideRButton;
    private javax.swing.JRadioButton insideUButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel radiusLabelValue;
    private javax.swing.JSlider radiusValue;
    private javax.swing.JRadioButton topButton;
    private javax.swing.JLabel weightLabelValue;
    private javax.swing.JSlider weightValue;
    private javax.swing.JLabel widthLabelValue;
    private javax.swing.JSlider widthValue;
    // End of variables declaration//GEN-END:variables
}
