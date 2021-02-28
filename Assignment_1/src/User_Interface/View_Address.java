/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;
import Model.Address;
/**
 *
 * @author chinmayi_shaligram
 */
public class View_Address extends javax.swing.JPanel {

    /**
     * Creates new form View_Address
     */
    Address address;
    public View_Address(Address address) {
        initComponents();
        
       this.address = address;
       
       displayaddress();
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
        Lbl_Address = new javax.swing.JLabel();
        Lbl_Street = new javax.swing.JLabel();
        Lbl_City = new javax.swing.JLabel();
        txt_Street = new javax.swing.JTextField();
        Lbl_State = new javax.swing.JLabel();
        txt_City2 = new javax.swing.JTextField();
        Lbl_Zip = new javax.swing.JLabel();
        txt_State = new javax.swing.JTextField();
        txt_Zip = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setLayout(null);

        Lbl_Address.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Lbl_Address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Address.setText("Address");
        add(Lbl_Address);
        Lbl_Address.setBounds(120, 90, 366, 30);

        Lbl_Street.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Street.setText("Street");
        add(Lbl_Street);
        Lbl_Street.setBounds(160, 180, 80, 17);

        Lbl_City.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_City.setText("City");
        add(Lbl_City);
        Lbl_City.setBounds(160, 240, 60, 17);

        txt_Street.setEditable(false);
        txt_Street.setForeground(new java.awt.Color(153, 153, 153));
        txt_Street.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_Street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_StreetActionPerformed(evt);
            }
        });
        add(txt_Street);
        txt_Street.setBounds(300, 180, 111, 20);

        Lbl_State.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_State.setText("State");
        add(Lbl_State);
        Lbl_State.setBounds(160, 300, 60, 17);

        txt_City2.setEditable(false);
        txt_City2.setForeground(new java.awt.Color(153, 153, 153));
        txt_City2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_City2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_City2ActionPerformed(evt);
            }
        });
        add(txt_City2);
        txt_City2.setBounds(300, 240, 111, 20);

        Lbl_Zip.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Zip.setText("ZipCode");
        add(Lbl_Zip);
        Lbl_Zip.setBounds(160, 360, 80, 17);

        txt_State.setEditable(false);
        txt_State.setForeground(new java.awt.Color(153, 153, 153));
        txt_State.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_State);
        txt_State.setBounds(300, 300, 111, 20);

        txt_Zip.setEditable(false);
        txt_Zip.setForeground(new java.awt.Color(153, 153, 153));
        txt_Zip.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_Zip);
        txt_Zip.setBounds(300, 360, 111, 20);
        add(jLabel4);
        jLabel4.setBounds(170, 60, 0, 70);
        add(jLabel2);
        jLabel2.setBounds(170, -330, 1540, 860);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_Interface/back.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1080, 600);

        jLabel5.setPreferredSize(new java.awt.Dimension(1400, 800));
        jLabel5.setRequestFocusEnabled(false);
        add(jLabel5);
        jLabel5.setBounds(210, 80, 70, 70);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_StreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_StreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_StreetActionPerformed

    private void txt_City2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_City2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_City2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Address;
    private javax.swing.JLabel Lbl_City;
    private javax.swing.JLabel Lbl_State;
    private javax.swing.JLabel Lbl_Street;
    private javax.swing.JLabel Lbl_Zip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_City2;
    private javax.swing.JTextField txt_State;
    private javax.swing.JTextField txt_Street;
    private javax.swing.JTextField txt_Zip;
    // End of variables declaration//GEN-END:variables

    private void displayaddress() {
    //To change body of generated methods, choose Tools | Templates.
    txt_Street.setText(address.getStreet());
    txt_City2.setText(address.getCity());
    txt_State.setText(address.getState());
    txt_Zip.setText(address.getZipcode());
    }
}
