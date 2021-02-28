/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;

import Model.Checkin;

/**
 *
 * @author chinmayi_shaligram
 */
public class View_Checkin extends javax.swing.JPanel {

    /**
     * Creates new form View_Checkin1
     */
    Checkin checkin;
    public View_Checkin(Checkin checkin) {
        initComponents();
        
        this.checkin = checkin;
        
        displaycheckin();
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_BName = new javax.swing.JTextField();
        txt_BRouting = new javax.swing.JTextField();
        txt_AccNo = new javax.swing.JTextField();
        txt_Balance = new javax.swing.JTextField();
        Lbl_Savings = new javax.swing.JLabel();
        txt_Acctype = new javax.swing.JTextField();
        Lbl_BName = new javax.swing.JLabel();
        Lbl_Routing = new javax.swing.JLabel();
        Lbl_Balance = new javax.swing.JLabel();
        Lbl_AccNo = new javax.swing.JLabel();
        Lbl_AccType = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        txt_BName.setEditable(false);
        txt_BName.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_BName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BNameActionPerformed(evt);
            }
        });
        add(txt_BName);
        txt_BName.setBounds(370, 250, 92, 18);

        txt_BRouting.setEditable(false);
        txt_BRouting.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_BRouting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BRoutingActionPerformed(evt);
            }
        });
        add(txt_BRouting);
        txt_BRouting.setBounds(370, 300, 92, 18);

        txt_AccNo.setEditable(false);
        txt_AccNo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_AccNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AccNoActionPerformed(evt);
            }
        });
        add(txt_AccNo);
        txt_AccNo.setBounds(370, 350, 92, 18);

        txt_Balance.setEditable(false);
        txt_Balance.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_Balance);
        txt_Balance.setBounds(370, 400, 92, 18);

        Lbl_Savings.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        Lbl_Savings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Savings.setText("Checkings Account");
        add(Lbl_Savings);
        Lbl_Savings.setBounds(220, 150, 322, 74);

        txt_Acctype.setEditable(false);
        txt_Acctype.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_Acctype);
        txt_Acctype.setBounds(370, 450, 92, 18);

        Lbl_BName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_BName.setText("Bank Name");
        add(Lbl_BName);
        Lbl_BName.setBounds(180, 260, 90, 19);

        Lbl_Routing.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Routing.setText("Routing Number");
        add(Lbl_Routing);
        Lbl_Routing.setBounds(180, 310, 120, 19);

        Lbl_Balance.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Balance.setText("Bank Balance");
        add(Lbl_Balance);
        Lbl_Balance.setBounds(180, 360, 100, 19);

        Lbl_AccNo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_AccNo.setText("Account Number");
        add(Lbl_AccNo);
        Lbl_AccNo.setBounds(180, 400, 120, 19);

        Lbl_AccType.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_AccType.setText("Account Type");
        add(Lbl_AccType);
        Lbl_AccType.setBounds(180, 450, 110, 19);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_Interface/checkin.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(190, 150, 70, 80);

        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(-50, -310, 1070, 1410);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_Interface/back.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1080, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_BNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BNameActionPerformed

    private void txt_BRoutingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BRoutingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BRoutingActionPerformed

    private void txt_AccNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AccNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AccNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_AccNo;
    private javax.swing.JLabel Lbl_AccType;
    private javax.swing.JLabel Lbl_BName;
    private javax.swing.JLabel Lbl_Balance;
    private javax.swing.JLabel Lbl_Routing;
    private javax.swing.JLabel Lbl_Savings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_AccNo;
    private javax.swing.JTextField txt_Acctype;
    private javax.swing.JTextField txt_BName;
    private javax.swing.JTextField txt_BRouting;
    private javax.swing.JTextField txt_Balance;
    // End of variables declaration//GEN-END:variables

    private void displaycheckin() {
        
//To change body of generated methods, choose Tools | Templates.

    txt_BName.setText(checkin.getBank_Name1());
    txt_BRouting.setText(checkin.getBank_Routing1());
    txt_Balance.setText(checkin.getBank_Balance1());
    txt_AccNo.setText(checkin.getAccount_No1());
    txt_Acctype.setText(checkin.getAccount_Type1());
    }
}
