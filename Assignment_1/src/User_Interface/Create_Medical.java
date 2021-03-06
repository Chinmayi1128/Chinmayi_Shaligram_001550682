/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;

import Model.Medical;
import javax.swing.JOptionPane;

/**
 *
 * @author chinmayi_shaligram
 */
public class Create_Medical extends javax.swing.JPanel {

    /**
     * Creates new form Create_Medical1
     */
    Medical medical;
    public Create_Medical(Medical medical) {
        initComponents();
        
    this.medical = medical;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_save = new javax.swing.JButton();
        txt_Record = new javax.swing.JTextField();
        txt_BGroup = new javax.swing.JTextField();
        txt_Diabetes = new javax.swing.JTextField();
        txt_BPressure = new javax.swing.JTextField();
        Lbl_Medical = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Covid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setLayout(null);

        Btn_save.setText("Save");
        Btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_saveActionPerformed(evt);
            }
        });
        add(Btn_save);
        Btn_save.setBounds(210, 390, 57, 23);

        txt_Record.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_Record);
        txt_Record.setBounds(300, 180, 101, 18);

        txt_BGroup.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_BGroup);
        txt_BGroup.setBounds(300, 230, 101, 18);

        txt_Diabetes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_Diabetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DiabetesActionPerformed(evt);
            }
        });
        add(txt_Diabetes);
        txt_Diabetes.setBounds(300, 270, 101, 18);

        txt_BPressure.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_BPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BPressureActionPerformed(evt);
            }
        });
        add(txt_BPressure);
        txt_BPressure.setBounds(300, 310, 101, 18);

        Lbl_Medical.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        Lbl_Medical.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Medical.setText("Medical Records");
        add(Lbl_Medical);
        Lbl_Medical.setBounds(150, 100, 317, 32);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Record Number");
        add(jLabel1);
        jLabel1.setBounds(130, 180, 110, 19);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Blood Group");
        add(jLabel2);
        jLabel2.setBounds(130, 220, 90, 19);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Diabetes");
        add(jLabel3);
        jLabel3.setBounds(130, 270, 70, 19);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Blood Pressure");
        add(jLabel4);
        jLabel4.setBounds(130, 310, 110, 19);

        txt_Covid.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_Covid);
        txt_Covid.setBounds(300, 350, 101, 18);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Covid");
        add(jLabel5);
        jLabel5.setBounds(130, 350, 50, 19);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_Interface/medical.jpg"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(140, 70, 100, 90);

        jLabel6.setText(" ");
        add(jLabel6);
        jLabel6.setBounds(-5, 0, 1870, 630);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_Interface/back.jpg"))); // NOI18N
        jLabel8.setText("jLabel3");
        add(jLabel8);
        jLabel8.setBounds(0, 0, 1080, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_saveActionPerformed
        // TODO add your handling code here:

         medical.setRecord_No(txt_Record.getText());
         medical.setBlood_Grp(txt_BGroup.getText());
         medical.setDiabetes(txt_Diabetes.getText());
         medical.setCovid(txt_Covid.getText());
         medical.setBlood_Pressure(txt_BPressure.getText());
         
         JOptionPane.showMessageDialog(this, "Your information has been saved.");
         
    }//GEN-LAST:event_Btn_saveActionPerformed

    private void txt_DiabetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DiabetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DiabetesActionPerformed

    private void txt_BPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BPressureActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_save;
    private javax.swing.JLabel Lbl_Medical;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_BGroup;
    private javax.swing.JTextField txt_BPressure;
    private javax.swing.JTextField txt_Covid;
    private javax.swing.JTextField txt_Diabetes;
    private javax.swing.JTextField txt_Record;
    // End of variables declaration//GEN-END:variables

}
