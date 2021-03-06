/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JOptionPane;
import model.Product;

/**
 *
 * @author chinmayi_shaligram
 */
public class CreateJPanel extends javax.swing.JPanel {
    

    /**
     * Creates new form CreateJPanel
     */
    Product product;
    
    public CreateJPanel(Product product) {
        initComponents();
        this.product = product;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LblTitle = new javax.swing.JLabel();
        LblName = new javax.swing.JLabel();
        LblDescp = new javax.swing.JLabel();
        BtnPrice = new javax.swing.JLabel();
        LblAvail = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        TxtDescription = new javax.swing.JTextField();
        TxtPrice = new javax.swing.JTextField();
        TxtAvail = new javax.swing.JTextField();
        BtnSave = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setLayout(null);

        LblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitle.setText("Title");
        add(LblTitle);
        LblTitle.setBounds(25, 38, 350, 16);

        LblName.setText("Name");
        add(LblName);
        LblName.setBounds(40, 89, 36, 16);

        LblDescp.setText("Description");
        add(LblDescp);
        LblDescp.setBounds(40, 138, 73, 16);

        BtnPrice.setText("Price");
        add(BtnPrice);
        BtnPrice.setBounds(40, 188, 30, 16);

        LblAvail.setText("Availability");
        add(LblAvail);
        LblAvail.setBounds(40, 243, 70, 16);
        add(TxtName);
        TxtName.setBounds(201, 89, 168, 26);

        TxtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDescriptionActionPerformed(evt);
            }
        });
        add(TxtDescription);
        TxtDescription.setBounds(201, 133, 168, 26);

        TxtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPriceActionPerformed(evt);
            }
        });
        add(TxtPrice);
        TxtPrice.setBounds(201, 183, 168, 26);

        TxtAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAvailActionPerformed(evt);
            }
        });
        add(TxtAvail);
        TxtAvail.setBounds(201, 238, 168, 26);

        BtnSave.setText("save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });
        add(BtnSave);
        BtnSave.setBounds(134, 295, 75, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAvailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAvailActionPerformed

    private void TxtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPriceActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        // TODO add your handling code here:
        product.setName(TxtName.getText());
        product.setDescription(TxtDescription.getText());
        product.setPrice(TxtPrice.getText());
        product.setAvailNum(TxtAvail.getText());
        
        JOptionPane.showMessageDialog(this,"Product Information Saved.");
        
        
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void TxtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDescriptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnPrice;
    private javax.swing.JButton BtnSave;
    private javax.swing.JLabel LblAvail;
    private javax.swing.JLabel LblDescp;
    private javax.swing.JLabel LblName;
    private javax.swing.JLabel LblTitle;
    private javax.swing.JTextField TxtAvail;
    private javax.swing.JTextField TxtDescription;
    private javax.swing.JTextField TxtName;
    private javax.swing.JTextField TxtPrice;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
