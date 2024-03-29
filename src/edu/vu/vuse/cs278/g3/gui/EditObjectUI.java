package edu.vu.vuse.cs278.g3.gui;
import edu.vu.vuse.cs278.g3.model.*;

import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EditObjectUI.java
 *
 * Created on Nov 29, 2011, 12:40:41 AM
 */
/**
 * This class holds the code for the Edit Oject Dialog box.
 * @author Amber Maria
 */
public class EditObjectUI extends javax.swing.JFrame {

    /**
     * The constructor for the class.  Since this is Edit Object, we want to "fill in" the fields
     * for the user to see what the current attributes are.
     */
    public EditObjectUI() {
        initComponents();
        // "preprocessor"
    	int MY_OFFSET = 5;
    	int BUS_STREET_CONTACT = -33;
    	int BUS_LENGTH = 286;
    	int BOX_OFFSET = 10;
    	int TOP_OF_BUS = 50;
        
        // display the current values for the current object
        PhysicsObject myObj = ObjectManager.getInstance().getObject("object");
        int weight = (int)myObj.getMass();
        System.out.println("cur weight = " + weight);
        int width = 1;
        widthValue.setValue(1);
        int radius = 1;
        radiusValue2.setValue(1);
        
        // determine what needs to be active and what doesn't and get current dimensions of objects
        // if the object is a ball
        if(myObj.getClass().equals(RoundObject.class))
        {
        	radius = (int)((RoundObject)myObj).getRadius();
        	radius /= (double)MY_OFFSET;
            widthValue.setEnabled(false);
        	radiusValue2.setEnabled(true);
            radiusValue2.setValue(radius);
        }
        // if the object is a box
        else if (myObj.getClass().equals(SquareObject.class))
        {
        	width = (int)((SquareObject)myObj).getWidth();
        	width /= (double)BOX_OFFSET;
        	widthValue.setEnabled(true);
            widthValue.setValue(width);
        	radiusValue2.setEnabled(false);
        }
        // if the world crashed and died
        else
        {
        	System.out.println("failboat");
        }
         
        // set the sliders with the current values of the dimensions
        weightValue.setValue(weight);
        
        String tmpStr = "";
        System.out.println(weight);
        switch (weight)
        {
	        case 1: tmpStr = "light"; break;
	        case 2: tmpStr = "medium"; break;
	        case 3: tmpStr = "heavy"; break;
	        case 4: tmpStr = "elephant"; break;
	        default: { tmpStr = "failboat"; System.out.println("weight default"); break;}
        }
        weightLabelValue.setText(tmpStr);
        
        System.out.println(width);
        switch (width)
        {
	        case 1: tmpStr = "small"; break;
	        case 2: tmpStr = "medium"; break;
	        case 3: tmpStr = "large"; break;
	        case 4: tmpStr = "xlarge"; break;
	        default: { tmpStr = "failboat"; System.out.println("width default"); break;}
        }
        widthLabelValue.setText(tmpStr);
        
        System.out.println(radius);
        switch (radius)
        {
	        case 1: tmpStr = "small"; break;
	        case 2: tmpStr = "medium"; break;
	        case 3: tmpStr = "large"; break;
	        case 4: tmpStr = "xlarge"; break;
	        default: { tmpStr = "failboat"; System.out.println("radius default"); break;}
        }
        radiusLabelValue.setText(tmpStr);
        
        // find the relationship so we can set it
        int x=0, y=0;
    	x = (int)myObj.getXCoord();
    	y = (int)myObj.getYCoord();
    	// relationship is not dependent on object type
    	if (RelationshipManager.getInstance().getRelationship("object", "bus") == RelationshipTypes.FRONT)
    		frontButton.setSelected(true);
    	else if (RelationshipManager.getInstance().getRelationship("object", "bus") == RelationshipTypes.BEHIND_ATTACHED) 
    		behindButton.setSelected(true);
    	else if (RelationshipManager.getInstance().getRelationship("object", "bus") == RelationshipTypes.ABOVE_UNRESTRAINED) 
    		topButton.setSelected(true);
    	else if (RelationshipManager.getInstance().getRelationship("object", "bus") == RelationshipTypes.INSIDE_RESTRAINED) 
    		insideRButton.setSelected(true);
    	else if (RelationshipManager.getInstance().getRelationship("object", "bus") == RelationshipTypes.INSIDE_UNRESTRAINED)
    		insideUButton.setSelected(true);
    	else if (RelationshipManager.getInstance().getRelationship("object", "bus") == RelationshipTypes.NO_RELATIONSHIP)
    		System.out.println("edit object fail boat");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
//        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        relationshipGroup = new javax.swing.ButtonGroup();
        radiusValue = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        topButton = new javax.swing.JRadioButton();
        insideRButton = new javax.swing.JRadioButton();
        insideUButton = new javax.swing.JRadioButton();
        behindButton = new javax.swing.JRadioButton();
        frontButton = new javax.swing.JRadioButton();
        editButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        weightValue = new javax.swing.JSlider();
        widthValue = new javax.swing.JSlider();
        weightLabelValue = new javax.swing.JLabel();
        radiusLabelValue = new javax.swing.JLabel();
        widthLabelValue = new javax.swing.JLabel();
        radiusValue2 = new javax.swing.JSlider();

       /* radiusValue.setMaximum(4);
        radiusValue.setSnapToTicks(true);
        radiusValue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radiusValueStateChanged(evt);
            }
        });*/

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jEditorPane1);

        jLabel1.setText("Weight");

        jLabel2.setText("Radius");

        jLabel3.setText("Width");

        jLabel5.setText("Relationship to Bus");

        jLabel6.setText("Object Attributes");

        relationshipGroup.add(topButton);
        topButton.setText("On Top");
        topButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topButtonActionPerformed(evt);
            }
        });

        relationshipGroup.add(insideRButton);
        insideRButton.setText("Inside (with a seat belt)");

        relationshipGroup.add(insideUButton);
        insideUButton.setText("Inside (without a seat belt)");

        relationshipGroup.add(behindButton);
        behindButton.setText("Behind (dragged)");

        relationshipGroup.add(frontButton);
        frontButton.setText("In Front (pushed)");
        frontButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frontButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
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

        weightValue.setMaximum(4);
        weightValue.setMinimum(1);
        weightValue.setSnapToTicks(true);
        weightValue.setValue(2);
        weightValue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                weightValueStateChanged(evt);
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

        radiusValue2.setMaximum(4);
        radiusValue2.setMinimum(1);
        radiusValue2.setSnapToTicks(true);
        radiusValue2.setValue(2);
        radiusValue2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radiusValueStateChanged(evt);
            }
        });

//        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, radiusValue, org.jdesktop.beansbinding.ObjectProperty.create(), radiusValue2, org.jdesktop.beansbinding.BeanProperty.create("value"));
//        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(weightValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(weightLabelValue))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radiusValue2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radiusLabelValue))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(widthValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(widthLabelValue)))))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insideRButton, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(topButton)
                                    .addComponent(insideUButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(behindButton)
                                    .addComponent(frontButton)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weightValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radiusValue2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(radiusLabelValue))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(widthLabelValue)
                            .addComponent(jLabel3)
                            .addComponent(widthValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightLabelValue)
                            .addComponent(topButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insideRButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insideUButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(behindButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frontButton)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(clearButton)
                    .addComponent(editButton))
                .addContainerGap())
        );

//        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

/**
 * This is for one of the radio buttons
 * @param evt
 */
private void frontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frontButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_frontButtonActionPerformed

/**
 * This is for one of the radio buttons
 * @param evt
 */
private void topButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_topButtonActionPerformed

/**
 * The actio that happens when the clear button is pressed.  All values go to null.
 * @param evt
 */
private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
    weightValue.setValue(0);
    widthValue.setValue(0);
    radiusValue.setValue(0);
    relationshipGroup.clearSelection();
}//GEN-LAST:event_clearButtonActionPerformed

/**
 * Action that happens when the cancel button is pressd. The dialog closes without saving any data.
 * @param evt
 */
private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
    this.dispose();
   
}//GEN-LAST:event_cancelButtonActionPerformed

/**
 * The action that happens when the Edit button is pressed.  This saves all the values, updates the
 * object's instance, and closes the dialog.
 * @param evt
 */
private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
	// "preprocessor"
	int MY_OFFSET = 5;
	int BUS_STREET_CONTACT = -33;
	int BUS_LENGTH = 286;
	int BOX_OFFSET = 10;
	int TOP_OF_BUS = 50;
	
	double weight = weightValue.getValue();
    double radius = radiusValue2.getValue();
    double width = widthValue.getValue();
    
    int x=0, y=0;
    
    // get the bus object
    PhysicsObject bus = ObjectManager.getInstance().getObject("bus");
    double busX = bus.getXCoord();
    double busY = bus.getYCoord();
    
    PhysicsObject myObj = ObjectManager.getInstance().getObject("object");
    
    // if the object is a ball...
    if(myObj.getClass().equals(RoundObject.class)) 
    {
        myObj.setMass(weight);
        ((RoundObject)myObj).setRadius(radius*MY_OFFSET);
        
    	if (topButton.isSelected())
    	{
        	x = (int)busX;
        	y = (int)(radius + TOP_OF_BUS);
        	RelationshipManager.getInstance().setRelationship("object", "bus", RelationshipTypes.ABOVE_UNRESTRAINED);
    	}
    	else if (insideRButton.isSelected())
    	{
            x = (int)busX;
            y = (int)(radius*(double)MY_OFFSET);
            RelationshipManager.getInstance().setRelationship("object", "bus", RelationshipTypes.INSIDE_RESTRAINED);
    	}
    	else if (insideUButton.isSelected())
    	{
    		x = (int)busX;
            y = (int)(radius*(double)MY_OFFSET);
            RelationshipManager.getInstance().setRelationship("object", "bus", RelationshipTypes.INSIDE_UNRESTRAINED);
    	}
    	else if (behindButton.isSelected())
    	{
    		x = (int)(-0.5*(double)BUS_LENGTH);
            y = (int)(BUS_STREET_CONTACT);
            RelationshipManager.getInstance().setRelationship("object", "bus", RelationshipTypes.BEHIND_ATTACHED);
    	}
    	else if (frontButton.isSelected())
    	{
        	x = (int)(0.5*(double)BUS_LENGTH);
        	y = (int)(BUS_STREET_CONTACT);
        	RelationshipManager.getInstance().setRelationship("object", "bus", RelationshipTypes.FRONT);
    	}
        
        ((RoundObject)myObj).setXCoord(x);
        ((RoundObject)myObj).setYCoord(y);
    }
    
    // if the object is a box
    else if (myObj.getClass().equals(SquareObject.class))
    {
        myObj.setMass(weight);
        ((SquareObject)myObj).setWidth(width*BOX_OFFSET);  
        
    	if (topButton.isSelected())
    	{
        	x = (int)busX;
        	y = (int)(width + TOP_OF_BUS);
        	RelationshipManager.getInstance().setRelationship("object", "bus", RelationshipTypes.ABOVE_UNRESTRAINED);
    	}
    	else if (insideRButton.isSelected())
    	{
            x = (int)busX;
            y = (int)(width*(double)MY_OFFSET);
            RelationshipManager.getInstance().setRelationship("object", "bus", RelationshipTypes.INSIDE_RESTRAINED);
    	}
    	else if (insideUButton.isSelected())
    	{
    		x = (int)busX;
            y = (int)(width*(double)MY_OFFSET);
            RelationshipManager.getInstance().setRelationship("object", "bus", RelationshipTypes.INSIDE_UNRESTRAINED);
    	}
    	else if (behindButton.isSelected())
    	{
    		x = (int)(-0.5*BUS_LENGTH);
            y = BUS_STREET_CONTACT;
            RelationshipManager.getInstance().setRelationship("object", "bus", RelationshipTypes.BEHIND_ATTACHED);
    	}
    	else if (frontButton.isSelected())
    	{
        	x = (int)(0.5*BUS_LENGTH);
        	y = BUS_STREET_CONTACT;
        	RelationshipManager.getInstance().setRelationship("object", "bus", RelationshipTypes.FRONT);
    	}
        
        myObj.setXCoord(x);
        myObj.setYCoord(y);
    }
    
    // if the world crashed and died...
    else
    {
    	System.out.println("failboat");
    }
    
    myObj.commit();
    this.dispose();
}//GEN-LAST:event_editButtonActionPerformed

/**
 * Action that happens when the Weight slider is moved. We update the label so the student can see
 * the current mass of the object (in terms of small, medium, large, extra large)
 * @param evt
 */
private void weightValueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_weightValueStateChanged
    int tmp = weightValue.getValue();
    String tmpWeight = "";
    switch (tmp)
    {
        case 1: tmpWeight = "light";  break;
        case 2: tmpWeight = "medium"; break;
        case 3: tmpWeight = "heavy";  break;
        case 4: tmpWeight = "elephant"; break;
        default: tmpWeight = "medium"; break;
    }
    weightLabelValue.setText(tmpWeight);
}//GEN-LAST:event_weightValueStateChanged

/**
 * Action that happens when the Radius slider is moved. We update the label so the student can see
 * the current radius of the round object (in terms of small, medium, large, extra large)
 * @param evt
 */
private void radiusValueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radiusValueStateChanged
    int tmp = radiusValue2.getValue();
    String tmpRadius = "";
    switch (tmp)
    {
        case 1: tmpRadius = "small";  break;
        case 2: tmpRadius = "medium"; break;
        case 3: tmpRadius = "large";  break;
        case 4: tmpRadius = "xlarge"; break;
        default: tmpRadius = "medium"; break;
    }
    radiusLabelValue.setText(tmpRadius);
}//GEN-LAST:event_radiusValueStateChanged

/**
 * Action that happens when the Width slider is moved. We update the label so the student can see
 * the current width of the square object (in terms of small, medium, large, extra large)
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
        default: tmpWidth = "medium"; break;
    }
    widthLabelValue.setText(tmpWidth);
}//GEN-LAST:event_widthValueStateChanged

/**
 * Action that happens when the height slider is moved. We update the label so the student can see
 * the current height of the square object (in terms of small, medium, large, extra large)
 * @param evt
 */
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
            java.util.logging.Logger.getLogger(EditObjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditObjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditObjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditObjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new EditObjectUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton behindButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton editButton;
    private javax.swing.JRadioButton frontButton;
    private javax.swing.JRadioButton insideRButton;
    private javax.swing.JRadioButton insideUButton;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel radiusLabelValue;
    private javax.swing.JSlider radiusValue;
    private javax.swing.JSlider radiusValue2;
    private javax.swing.ButtonGroup relationshipGroup;
    private javax.swing.JRadioButton topButton;
    private javax.swing.JLabel weightLabelValue;
    private javax.swing.JSlider weightValue;
    private javax.swing.JLabel widthLabelValue;
    private javax.swing.JSlider widthValue;
    //private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
