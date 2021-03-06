/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;

import Model.Medical;

/**
 *
 * @author chinmayi_shaligram
 */
public class View_Medical extends javax.swing.JPanel {

    /**
     * Creates new form View_Medical1
     */
    
    Medical medical;
    public View_Medical(Medical medical) {
        initComponents();
        
        this.medical = medical;
        
        displaymedical();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Covid = new javax.swing.JTextField();
        txt_Record = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_BGroup = new javax.swing.JTextField();
        txt_Diabetes = new javax.swing.JTextField();
        txt_BPressure = new javax.swing.JTextField();
        Lbl_Medical = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Record Number");
        add(jLabel1);
        jLabel1.setBounds(150, 180, 110, 19);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Blood Group");
        add(jLabel2);
        jLabel2.setBounds(150, 230, 90, 19);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Diabetes");
        add(jLabel3);
        jLabel3.setBounds(150, 280, 70, 19);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Blood Pressure");
        add(jLabel4);
        jLabel4.setBounds(150, 330, 110, 19);

        txt_Covid.setEditable(false);
        txt_Covid.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_Covid);
        txt_Covid.setBounds(330, 380, 101, 18);

        txt_Record.setEditable(false);
        txt_Record.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_Record);
        txt_Record.setBounds(330, 180, 101, 18);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Covid");
        add(jLabel5);
        jLabel5.setBounds(150, 370, 50, 19);

        txt_BGroup.setEditable(false);
        txt_BGroup.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_BGroup);
        txt_BGroup.setBounds(330, 230, 101, 18);

        txt_Diabetes.setEditable(false);
        txt_Diabetes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_Diabetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DiabetesActionPerformed(evt);
            }
        });
        add(txt_Diabetes);
        txt_Diabetes.setBounds(330, 280, 101, 18);

        txt_BPressure.setEditable(false);
        txt_BPressure.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_BPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BPressureActionPerformed(evt);
            }
        });
        add(txt_BPressure);
        txt_BPressure.setBounds(330, 330, 101, 18);

        Lbl_Medical.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        Lbl_Medical.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Medical.setText("Medical Records");
        add(Lbl_Medical);
        Lbl_Medical.setBounds(170, 110, 317, 22);
        add(jLabel7);
        jLabel7.setBounds(150, 100, 121, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_Interface/medical.jpg"))); // NOI18N
        jLabel6.setText(" ");
        add(jLabel6);
        jLabel6.setBounds(160, -270, 2000, 780);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_Interface/back.jpg"))); // NOI18N
        jLabel8.setText("jLabel3");
        add(jLabel8);
        jLabel8.setBounds(0, 0, 1080, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_DiabetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DiabetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DiabetesActionPerformed

    private void txt_BPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BPressureActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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

    private void displaymedical() {
   //To change body of generated methods, choose Tools | Templates.
   
     txt_Record.setText(medical.getRecord_No());
     txt_BGroup.setText(medical.getBlood_Pressure());
     txt_Diabetes.setText(medical.getDiabetes());
     txt_BPressure.setText(medical.getBlood_Pressure());
     txt_Covid.setText(medical.getCovid());
    }
}
