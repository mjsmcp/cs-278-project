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
    	int BOX_OFFSET = 100;
        
        // display the current values for the current object
        PhysicsObject myObj = ObjectManager.getInstance().getObject("leObj");
        int weight = (int)myObj.getMass();
        int height = 0;
        int width = 0;
        int radius = 0;       
        
        // determine what needs to be active and what doesn't and get current dimensions of objects
        // if the object is a ball
        if(myObj.getClass().equals(RoundObject.class))
        {
        	radius = (int)((RoundObject)myObj).getRadius();        	
            widthValue.setEnabled(false);
        	heightValue.setEnabled(false);
        	radiusValue.setEnabled(true);
        }
        // if the object is a box
        else if (myObj.getClass().equals(SquareObject.class))
        {
        	height = (int)((SquareObject)myObj).getHeight();
        	width = (int)((SquareObject)myObj).getWidth();
        	widthValue.setEnabled(true);
        	heightValue.setEnabled(true);
        	radiusValue.setEnabled(false);
        }
        // if the world crashed and died
        else
        {
        	System.out.println("failboat");
        }
        
        // set the sliders with the current values of the dimensions
        weightValue.setValue(weight);
        heightValue.setValue(height);
        widthValue.setValue(width);
        radiusValue.setValue(radius);
        
        String tmpStr = "";
        switch (weight)
        {
	        case 1: tmpStr = "small"; break;
	        case 2: tmpStr = "medium"; break;
	        case 3: tmpStr = "large"; break;
	        case 4: tmpStr = "xlarge"; break;
        }
        weightLabelValue.setText(tmpStr);
       
        switch (height)
        {
	        case 1: tmpStr = "small"; break;
	        case 2: tmpStr = "medium"; break;
	        case 3: tmpStr = "large"; break;
	        case 4: tmpStr = "xlarge"; break;
        }
        heightLabelValue.setText(tmpStr);
        
        switch (width)
        {
	        case 1: tmpStr = "small"; break;
	        case 2: tmpStr = "medium"; break;
	        case 3: tmpStr = "large"; break;
	        case 4: tmpStr = "xlarge"; break;
        }
        widthLabelValue.setText(tmpStr);
        
        switch (radius)
        {
	        case 1: tmpStr = "small"; break;
	        case 2: tmpStr = "medium"; break;
	        case 3: tmpStr = "large"; break;
	        case 4: tmpStr = "xlarge"; break;
        }
        radiusLabelValue.setText(tmpStr);
        
        // find the relationship so we can set it
        int x=0, y=0;
        // if the object is a ball
        if (myObj.getClass().equals(RoundObject.class))
        {
        	if (x == (int)(0.5*BUS_LENGTH)) frontButton.setSelected(true);
        	else if (x == (int)(-0.5*BUS_LENGTH)) behindButton.setSelected(true);
        	else if (y == (int)(radius*MY_OFFSET)) topButton.setSelected(true);
        	// we're going to default to this, unless someone knows a better way of getting the relationship other than x/y coords
        	else if (y == (int)(-radius*MY_OFFSET)) insideRButton.setSelected(true);
        }
        // else if the object is a box
        if (myObj.getClass().equals(SquareObject.class))
        {
        	if (x == (int)(0.5*BUS_LENGTH)) frontButton.setSelected(true);
        	else if (x == (int)(-0.5*BUS_LENGTH)) behindButton.setSelected(true);
        	else if (y == (int)(height*MY_OFFSET)) topButton.setSelected(true);
        	// we're going to default to this, unless someone knows a better way of getting the relationship other than x/y coords
        	else if (y == (int)(-0.5*height*MY_OFFSET)) insideRButton.setSelected(true);
        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        //bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        relationshipGroup = new javax.swing.ButtonGroup();
        radiusValue = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        //jLabel1 = new javax.swing.JLabel();
        //jLabel2 = new javax.swing.JLabel();
        //jLabel3 = new javax.swing.JLabel();
        //jLabel4 = new javax.swing.JLabel();
        //jLabel5 = new javax.swing.JLabel();
        //jLabel6 = new javax.swing.JLabel();
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
        heightValue = new javax.swing.JSlider();
        weightLabelValue = new javax.swing.JLabel();
        radiusLabelValue = new javax.swing.JLabel();
        widthLabelValue = new javax.swing.JLabel();
        heightLabelValue = new javax.swing.JLabel();
        radiusValue2 = new javax.swing.JSlider();

        radiusValue.setMaximum(4);
        radiusValue.setSnapToTicks(true);
        radiusValue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radiusValueStateChanged(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jEditorPane1);

        //jLabel1.setText("Weight");

        //jLabel2.setText("Radius");

        //jLabel3.setText("Width");

        //jLabel4.setText("Height");

        //jLabel5.setText("Relationship to Bus");

        //jLabel6.setText("Object Attributes");

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

        heightValue.setMaximum(4);
        heightValue.setMinimum(1);
        heightValue.setSnapToTicks(true);
        heightValue.setValue(2);
        heightValue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                heightValueStateChanged(evt);
            }
        });

        weightLabelValue.setText("medium");

        radiusLabelValue.setText("medium");

        widthLabelValue.setText("medium");

        heightLabelValue.setText("medium");

        radiusValue2.setMaximum(3);
        radiusValue2.setSnapToTicks(true);
        radiusValue2.setValue(1);

        //org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, radiusValue, org.jdesktop.beansbinding.ObjectProperty.create(), radiusValue2, org.jdesktop.beansbinding.BeanProperty.create("value"));
        //bindingGroup.addBinding(binding);

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
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))))
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
                                        .addComponent(widthLabelValue))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(heightValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(heightLabelValue)))))
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
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heightLabelValue)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(heightValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(clearButton)
                    .addComponent(editButton))
                .addGap(93, 93, 93))
        );

        //bindingGroup.bind();

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
    heightValue.setValue(0);
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
	int BOX_OFFSET = 100;
	
	double weight = weightValue.getValue();
    double radius = radiusValue.getValue();
    double height = heightValue.getValue();
    double width = widthValue.getValue();
    
    int x=0, y=0;
    
    // get the bus object
    PhysicsObject bus = ObjectManager.getInstance().getObject("bus");
    double busX = bus.getXCoord();
    double busY = bus.getYCoord();
    
    PhysicsObject myObj = ObjectManager.getInstance().getObject("leObj");
    
    // if the object is a ball...
    if(myObj.getClass().equals(RoundObject.class)) 
    {
        myObj.setMass(weight);
        ((RoundObject)myObj).setRadius(radius*MY_OFFSET);
        
    	if (topButton.isSelected())
    	{
        	x = (int)busX;
        	y = (int)(busY + radius*MY_OFFSET);
    	}
    	else if (insideRButton.isSelected())
    	{
    		///TODO
            x = (int)busX;
            y = (int)(busY - (radius*MY_OFFSET));
    	}
    	else if (insideUButton.isSelected())
    	{
    		//TODO
    		x = (int)busX;
            y = (int)(busY - (radius*MY_OFFSET));
    	}
    	else if (behindButton.isSelected())
    	{
    		x = (int)(-0.5*BUS_LENGTH);
            y = (int)(BUS_STREET_CONTACT);
    	}
    	else if (frontButton.isSelected())
    	{
        	x = (int)(0.5*BUS_LENGTH);
        	y = (int)(BUS_STREET_CONTACT);
    	}
        
        ((RoundObject)myObj).setXCoord(x);
        ((RoundObject)myObj).setYCoord(y);
        ObjectManager.getInstance().updateObject("leObj", myObj);
    }
    
    // if the object is a box
    else if (myObj.getClass().equals(SquareObject.class))
    {
        myObj.setMass(weight);
        ((SquareObject)myObj).setHeight(height*BOX_OFFSET);
        ((SquareObject)myObj).setWidth(width*BOX_OFFSET);  
        
    	if (topButton.isSelected())
    	{
        	x = (int)busX;
        	y = (int)(busY + radius*MY_OFFSET);
    	}
    	else if (insideRButton.isSelected())
    	{
    		/// TODO
            x = (int)busX;
            y = (int)(busY - ((0.5*height)*MY_OFFSET));
    	}
    	else if (insideUButton.isSelected())
    	{
    		/// TODO
    		x = (int)busX;
            y = (int)(busY - ((0.5*height)*MY_OFFSET));
    	}
    	else if (behindButton.isSelected())
    	{
    		x = (int)(-0.5*BUS_LENGTH);
            y = BUS_STREET_CONTACT;
    	}
    	else if (frontButton.isSelected())
    	{
        	x = (int)(0.5*BUS_LENGTH);
        	y = BUS_STREET_CONTACT;
    	}
        
        myObj.setXCoord(x);
        myObj.setYCoord(y);
        ObjectManager.getInstance().updateObject("leObj", myObj);
    }
    
    // if the world crashed and died...
    else
    {
    	System.out.println("failboat");
    }
    
    
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
        case 1: tmpWeight = "small";  break;
        case 2: tmpWeight = "medium"; break;
        case 3: tmpWeight = "large";  break;
        case 4: tmpWeight = "xlarge"; break;
    }
    weightLabelValue.setText(tmpWeight);
}//GEN-LAST:event_weightValueStateChanged

/**
 * Action that happens when the Radius slider is moved. We update the label so the student can see
 * the current radius of the round object (in terms of small, medium, large, extra large)
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
    }
    widthLabelValue.setText(tmpWidth);
}//GEN-LAST:event_widthValueStateChanged

/**
 * Action that happens when the height slider is moved. We update the label so the student can see
 * the current height of the square object (in terms of small, medium, large, extra large)
 * @param evt
 */
private void heightValueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_heightValueStateChanged
    int tmp = heightValue.getValue();
    String tmpHeight = "";
    switch (tmp)
    {
        case 1: tmpHeight = "small";  break;
        case 2: tmpHeight = "medium"; break;
        case 3: tmpHeight = "large";  break;
        case 4: tmpHeight = "xlarge"; break;
    }
    heightLabelValue.setText(tmpHeight);
}//GEN-LAST:event_heightValueStateChanged

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
    private javax.swing.JLabel heightLabelValue;
    private javax.swing.JSlider heightValue;
    private javax.swing.JRadioButton insideRButton;
    private javax.swing.JRadioButton insideUButton;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
