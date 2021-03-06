/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;

import Model.Savings;
import javax.swing.JOptionPane;

/**
 *
 * @author chinmayi_shaligram
 */
public class Create_Savings extends javax.swing.JPanel {

    /**
     * Creates new form Create_Savings
     */
    Savings savings;
    public Create_Savings(Savings savings) {
        initComponents();
        
        this.savings = savings;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_BName2 = new javax.swing.JTextField();
        txt_BRouting = new javax.swing.JTextField();
        txt_AccNo = new javax.swing.JTextField();
        txt_Balance = new javax.swing.JTextField();
        txt_Acctype = new javax.swing.JTextField();
        Lbl_Savings = new javax.swing.JLabel();
        Lbl_BName = new javax.swing.JLabel();
        Lbl_Routing = new javax.swing.JLabel();
        Lbl_Balance = new javax.swing.JLabel();
        Lbl_Accno = new javax.swing.JLabel();
        Lbl_Acctype = new javax.swing.JLabel();
        Btn_save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(null);

        txt_BName2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_BName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BName2ActionPerformed(evt);
            }
        });
        add(txt_BName2);
        txt_BName2.setBounds(320, 210, 92, 18);

        txt_BRouting.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_BRouting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BRoutingActionPerformed(evt);
            }
        });
        add(txt_BRouting);
        txt_BRouting.setBounds(320, 250, 92, 18);

        txt_AccNo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_AccNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AccNoActionPerformed(evt);
            }
        });
        add(txt_AccNo);
        txt_AccNo.setBounds(320, 290, 92, 18);

        txt_Balance.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_Balance);
        txt_Balance.setBounds(320, 330, 92, 18);

        txt_Acctype.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_Acctype);
        txt_Acctype.setBounds(320, 370, 92, 18);

        Lbl_Savings.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        Lbl_Savings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Savings.setText("Savings Account");
        add(Lbl_Savings);
        Lbl_Savings.setBounds(160, 110, 322, 32);

        Lbl_BName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_BName.setText("Bank Name");
        add(Lbl_BName);
        Lbl_BName.setBounds(120, 210, 100, 19);

        Lbl_Routing.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Routing.setText("Routing Number");
        add(Lbl_Routing);
        Lbl_Routing.setBounds(120, 250, 120, 19);

        Lbl_Balance.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Balance.setText("Balance");
        add(Lbl_Balance);
        Lbl_Balance.setBounds(120, 290, 60, 19);

        Lbl_Accno.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Accno.setText("Account Number");
        add(Lbl_Accno);
        Lbl_Accno.setBounds(120, 330, 120, 19);

        Lbl_Acctype.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Acctype.setText("Account Type");
        add(Lbl_Acctype);
        Lbl_Acctype.setBounds(120, 370, 100, 19);

        Btn_save.setText("Save");
        Btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_saveActionPerformed(evt);
            }
        });
        add(Btn_save);
        Btn_save.setBounds(220, 420, 57, 23);
        add(jLabel1);
        jLabel1.setBounds(590, 210, 0, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_Interface/savings.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(140, 90, 70, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\umair\\OneDrive\\Desktop\\AED\\Assignment_1\\src\\Images\\savings.png")); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(-134, -10, 1550, 840);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_Interface/back.jpg"))); // NOI18N
        jLabel4.setText("jLabel3");
        add(jLabel4);
        jLabel4.setBounds(0, 0, 1080, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_BName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BName2ActionPerformed

    private void txt_BRoutingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BRoutingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BRoutingActionPerformed

    private void txt_AccNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AccNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AccNoActionPerformed

    private void Btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_saveActionPerformed
        // TODO add your handling code here:
        savings.setBank_Name(txt_BName2.getText());
        savings.setBank_Routing(txt_BRouting.getText());
        savings.setBank_Balance(txt_Balance.getText());
        savings.setAccount_No(txt_AccNo.getText());
        savings.setAccount_Type(txt_Acctype.getText());
        
        JOptionPane.showMessageDialog(this, "Your information has been saved.");
    }//GEN-LAST:event_Btn_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_save;
    private javax.swing.JLabel Lbl_Accno;
    private javax.swing.JLabel Lbl_Acctype;
    private javax.swing.JLabel Lbl_BName;
    private javax.swing.JLabel Lbl_Balance;
    private javax.swing.JLabel Lbl_Routing;
    private javax.swing.JLabel Lbl_Savings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_AccNo;
    private javax.swing.JTextField txt_Acctype;
    private javax.swing.JTextField txt_BName2;
    private javax.swing.JTextField txt_BRouting;
    private javax.swing.JTextField txt_Balance;
    // End of variables declaration//GEN-END:variables
}
