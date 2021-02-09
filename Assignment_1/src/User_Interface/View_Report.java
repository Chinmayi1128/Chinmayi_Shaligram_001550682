/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;

import Model.Person;
import Model.Address;
import Model.Savings;
import Model.Checkin;
import Model.Liscense;
import Model.Medical;

/**
 *
 * @author chinmayi_shaligram
 */
public class View_Report extends javax.swing.JPanel {

    /**
     * Creates new form View_Report
     */
    
    Person person;
    Address address;
    Savings savings;
    Checkin checkin;
    Liscense liscense;
    Medical medical;
    
    public View_Report(Person person, Address address, Savings savings, Checkin checkin, Liscense liscense, Medical medical) {
        initComponents();
        
    this.person = person;
    this.address = address;
    this.savings = savings;
    this.checkin = checkin;
    this.liscense = liscense;
    this.medical = medical;
        
        
       
    
    displayperson();
    displayaddress();
    displaysavings();
    displaycheckin();
    displayliscense();
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

        Lbl_Weight = new javax.swing.JLabel();
        Txt_LN = new javax.swing.JTextField();
        Lbl_SSN = new javax.swing.JLabel();
        Txt_Phno = new javax.swing.JTextField();
        Txt_DOB = new javax.swing.JTextField();
        Lbl_Firstname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Lbl_LastName = new javax.swing.JLabel();
        Txt_Age = new javax.swing.JTextField();
        Lbl_Phno = new javax.swing.JLabel();
        Txt_Ht = new javax.swing.JTextField();
        Lbl_DOB = new javax.swing.JLabel();
        Lbl_Age = new javax.swing.JLabel();
        Txt_FN = new javax.swing.JTextField();
        Lbl_Height = new javax.swing.JLabel();
        Txt_Wt = new javax.swing.JTextField();
        txt_Street = new javax.swing.JTextField();
        txt_City2 = new javax.swing.JTextField();
        txt_State = new javax.swing.JTextField();
        txt_Zip = new javax.swing.JTextField();
        Lbl_Street = new javax.swing.JLabel();
        Lbl_City = new javax.swing.JLabel();
        Lbl_State = new javax.swing.JLabel();
        Lbl_Zip = new javax.swing.JLabel();
        Lbl_Address = new javax.swing.JLabel();
        Lbl_Expiry = new javax.swing.JLabel();
        txt_Photo = new javax.swing.JTextField();
        Lbl_Photo = new javax.swing.JLabel();
        txt_Liscense = new javax.swing.JTextField();
        txt_Issue = new javax.swing.JTextField();
        txt_Expiry = new javax.swing.JTextField();
        Lbl_Liscense = new javax.swing.JLabel();
        Lbl_Issue = new javax.swing.JLabel();
        Lbl_Liscense1 = new javax.swing.JLabel();
        Lbl_BName = new javax.swing.JLabel();
        Lbl_Routing = new javax.swing.JLabel();
        Lbl_Balance = new javax.swing.JLabel();
        Lbl_Accno = new javax.swing.JLabel();
        Lbl_Acctype = new javax.swing.JLabel();
        txt_BName2 = new javax.swing.JTextField();
        txt_BRouting = new javax.swing.JTextField();
        txt_AccNo = new javax.swing.JTextField();
        txt_Balance = new javax.swing.JTextField();
        txt_Acctype = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Record = new javax.swing.JTextField();
        txt_BGroup = new javax.swing.JTextField();
        txt_Diabetes = new javax.swing.JTextField();
        txt_BPressure = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Covid = new javax.swing.JTextField();
        Lbl_BName1 = new javax.swing.JLabel();
        Lbl_Routing1 = new javax.swing.JLabel();
        Lbl_Balance1 = new javax.swing.JLabel();
        Lbl_AccNo = new javax.swing.JLabel();
        Lbl_AccType = new javax.swing.JLabel();
        txt_BName = new javax.swing.JTextField();
        txt_BRouting1 = new javax.swing.JTextField();
        txt_AccNo1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_SSN = new javax.swing.JTextField();
        Txt_BRouting = new javax.swing.JTextField();
        Txt_BName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setLayout(null);

        Lbl_Weight.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Weight.setText("Weight");
        add(Lbl_Weight);
        Lbl_Weight.setBounds(180, 210, 50, 17);

        Txt_LN.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        Txt_LN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_LNActionPerformed(evt);
            }
        });
        add(Txt_LN);
        Txt_LN.setBounds(110, 170, 47, 20);

        Lbl_SSN.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_SSN.setText("SSN");
        add(Lbl_SSN);
        Lbl_SSN.setBounds(180, 250, 40, 17);

        Txt_Phno.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        Txt_Phno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_PhnoActionPerformed(evt);
            }
        });
        add(Txt_Phno);
        Txt_Phno.setBounds(110, 210, 47, 19);

        Txt_DOB.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(Txt_DOB);
        Txt_DOB.setBounds(110, 250, 50, 20);

        Lbl_Firstname.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Firstname.setText("First Name");
        add(Lbl_Firstname);
        Lbl_Firstname.setBounds(20, 130, 80, 17);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Person");
        add(jLabel1);
        jLabel1.setBounds(30, 70, 228, 22);

        Lbl_LastName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_LastName.setText("Last Name");
        add(Lbl_LastName);
        Lbl_LastName.setBounds(20, 170, 70, 17);

        Txt_Age.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        Txt_Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_AgeActionPerformed(evt);
            }
        });
        add(Txt_Age);
        Txt_Age.setBounds(230, 130, 54, 20);

        Lbl_Phno.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Phno.setText("Phone No");
        add(Lbl_Phno);
        Lbl_Phno.setBounds(20, 210, 100, 17);

        Txt_Ht.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        Txt_Ht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_HtActionPerformed(evt);
            }
        });
        add(Txt_Ht);
        Txt_Ht.setBounds(230, 170, 54, 20);

        Lbl_DOB.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_DOB.setText("Date of Birth");
        add(Lbl_DOB);
        Lbl_DOB.setBounds(20, 250, 90, 17);

        Lbl_Age.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Age.setText("Age");
        add(Lbl_Age);
        Lbl_Age.setBounds(180, 130, 40, 17);

        Txt_FN.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(Txt_FN);
        Txt_FN.setBounds(110, 130, 47, 20);

        Lbl_Height.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Height.setText("Height");
        add(Lbl_Height);
        Lbl_Height.setBounds(180, 170, 60, 17);

        Txt_Wt.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(Txt_Wt);
        Txt_Wt.setBounds(230, 210, 54, 20);

        txt_Street.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_Street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_StreetActionPerformed(evt);
            }
        });
        add(txt_Street);
        txt_Street.setBounds(440, 130, 70, 18);

        txt_City2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_City2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_City2ActionPerformed(evt);
            }
        });
        add(txt_City2);
        txt_City2.setBounds(440, 160, 70, 20);

        txt_State.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_State);
        txt_State.setBounds(400, 470, 83, 20);

        txt_Zip.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_Zip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ZipActionPerformed(evt);
            }
        });
        add(txt_Zip);
        txt_Zip.setBounds(440, 240, 70, 20);

        Lbl_Street.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Street.setText("Street");
        add(Lbl_Street);
        Lbl_Street.setBounds(370, 120, 50, 30);

        Lbl_City.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_City.setText("City");
        add(Lbl_City);
        Lbl_City.setBounds(370, 160, 40, 30);

        Lbl_State.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_State.setText("State");
        add(Lbl_State);
        Lbl_State.setBounds(370, 190, 50, 40);

        Lbl_Zip.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Zip.setText("ZipCode");
        add(Lbl_Zip);
        Lbl_Zip.setBounds(370, 240, 60, 30);

        Lbl_Address.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Lbl_Address.setText("Address");
        add(Lbl_Address);
        Lbl_Address.setBounds(378, 72, 80, 20);

        Lbl_Expiry.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Expiry.setText("Expiry Date");
        Lbl_Expiry.setToolTipText("");
        add(Lbl_Expiry);
        Lbl_Expiry.setBounds(610, 210, 80, 21);

        txt_Photo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_Photo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PhotoActionPerformed(evt);
            }
        });
        add(txt_Photo);
        txt_Photo.setBounds(710, 250, 73, 20);

        Lbl_Photo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Photo.setText("Photo ID");
        Lbl_Photo.setToolTipText("");
        add(Lbl_Photo);
        Lbl_Photo.setBounds(610, 250, 60, 17);

        txt_Liscense.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_Liscense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LiscenseActionPerformed(evt);
            }
        });
        add(txt_Liscense);
        txt_Liscense.setBounds(710, 210, 73, 20);

        txt_Issue.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_Issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IssueActionPerformed(evt);
            }
        });
        add(txt_Issue);
        txt_Issue.setBounds(710, 170, 73, 20);

        txt_Expiry.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_Expiry);
        txt_Expiry.setBounds(710, 130, 73, 20);

        Lbl_Liscense.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Liscense.setText("Liscense No.");
        Lbl_Liscense.setToolTipText("");
        add(Lbl_Liscense);
        Lbl_Liscense.setBounds(610, 130, 90, 17);

        Lbl_Issue.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Issue.setText("Issue Date");
        Lbl_Issue.setToolTipText("");
        add(Lbl_Issue);
        Lbl_Issue.setBounds(610, 170, 80, 17);

        Lbl_Liscense1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Lbl_Liscense1.setText("Driver's Liscense");
        add(Lbl_Liscense1);
        Lbl_Liscense1.setBounds(625, 72, 150, 22);

        Lbl_BName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_BName.setText("Bank Name");
        add(Lbl_BName);
        Lbl_BName.setBounds(20, 390, 90, 17);

        Lbl_Routing.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Routing.setText("Routing No.");
        add(Lbl_Routing);
        Lbl_Routing.setBounds(20, 430, 90, 20);

        Lbl_Balance.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Balance.setText("Balance");
        add(Lbl_Balance);
        Lbl_Balance.setBounds(20, 470, 60, 17);

        Lbl_Accno.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Accno.setText("Account No.");
        add(Lbl_Accno);
        Lbl_Accno.setBounds(20, 510, 83, 20);

        Lbl_Acctype.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Acctype.setText("Account Type");
        add(Lbl_Acctype);
        Lbl_Acctype.setBounds(20, 550, 93, 20);

        txt_BName2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_BName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BName2ActionPerformed(evt);
            }
        });
        add(txt_BName2);
        txt_BName2.setBounds(120, 380, 83, 20);

        txt_BRouting.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_BRouting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BRoutingActionPerformed(evt);
            }
        });
        add(txt_BRouting);
        txt_BRouting.setBounds(120, 430, 83, 20);

        txt_AccNo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_AccNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AccNoActionPerformed(evt);
            }
        });
        add(txt_AccNo);
        txt_AccNo.setBounds(120, 470, 83, 20);

        txt_Balance.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_Balance);
        txt_Balance.setBounds(120, 510, 83, 20);

        txt_Acctype.setText("Savings ");
        txt_Acctype.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_Acctype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AcctypeActionPerformed(evt);
            }
        });
        add(txt_Acctype);
        txt_Acctype.setBounds(120, 550, 83, 20);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Covid");
        add(jLabel5);
        jLabel5.setBounds(560, 540, 39, 17);

        txt_Record.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_Record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RecordActionPerformed(evt);
            }
        });
        add(txt_Record);
        txt_Record.setBounds(680, 420, 101, 20);

        txt_BGroup.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_BGroup);
        txt_BGroup.setBounds(680, 380, 101, 20);

        txt_Diabetes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_Diabetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DiabetesActionPerformed(evt);
            }
        });
        add(txt_Diabetes);
        txt_Diabetes.setBounds(680, 460, 101, 20);

        txt_BPressure.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_BPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BPressureActionPerformed(evt);
            }
        });
        add(txt_BPressure);
        txt_BPressure.setBounds(680, 500, 101, 20);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Record Number");
        add(jLabel2);
        jLabel2.setBounds(560, 380, 110, 17);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Blood Group");
        add(jLabel3);
        jLabel3.setBounds(560, 420, 86, 17);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Diabetes");
        add(jLabel4);
        jLabel4.setBounds(560, 460, 59, 17);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Blood Pressure");
        add(jLabel6);
        jLabel6.setBounds(560, 500, 102, 17);

        txt_Covid.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(txt_Covid);
        txt_Covid.setBounds(680, 540, 101, 20);

        Lbl_BName1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_BName1.setText("Bank Name");
        add(Lbl_BName1);
        Lbl_BName1.setBounds(280, 390, 80, 17);

        Lbl_Routing1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Routing1.setText("Routing Number");
        add(Lbl_Routing1);
        Lbl_Routing1.setBounds(280, 430, 113, 17);

        Lbl_Balance1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_Balance1.setText("Bank Balance");
        add(Lbl_Balance1);
        Lbl_Balance1.setBounds(280, 470, 89, 17);

        Lbl_AccNo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_AccNo.setText("Account Number");
        add(Lbl_AccNo);
        Lbl_AccNo.setBounds(280, 510, 115, 17);

        Lbl_AccType.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Lbl_AccType.setText("Account Type");
        add(Lbl_AccType);
        Lbl_AccType.setBounds(280, 540, 93, 26);

        txt_BName.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_BName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BNameActionPerformed(evt);
            }
        });
        add(txt_BName);
        txt_BName.setBounds(440, 200, 70, 20);

        txt_BRouting1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_BRouting1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BRouting1ActionPerformed(evt);
            }
        });
        add(txt_BRouting1);
        txt_BRouting1.setBounds(400, 510, 83, 20);

        txt_AccNo1.setText("Checkings");
        txt_AccNo1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_AccNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AccNo1ActionPerformed(evt);
            }
        });
        add(txt_AccNo1);
        txt_AccNo1.setBounds(400, 550, 83, 20);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel7.setText("View Report ");
        add(jLabel7);
        jLabel7.setBounds(336, 17, 180, 30);

        txt_SSN.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txt_SSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SSNActionPerformed(evt);
            }
        });
        add(txt_SSN);
        txt_SSN.setBounds(230, 250, 54, 20);

        Txt_BRouting.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(Txt_BRouting);
        Txt_BRouting.setBounds(400, 420, 83, 20);

        Txt_BName.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        add(Txt_BName);
        Txt_BName.setBounds(400, 380, 83, 20);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setText("Savings Account");
        add(jLabel8);
        jLabel8.setBounds(60, 330, 160, 20);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setText("Checking Account");
        add(jLabel9);
        jLabel9.setBounds(310, 330, 160, 22);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setText("Medical Report");
        add(jLabel10);
        jLabel10.setBounds(610, 330, 140, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon("/Users/chinmayi_shaligram/Library/Containers/com.microsoft.Word/Data/Library/Application Support/Microsoft/Office/16.0/WebServiceCache/AllUsers/NetBeansProjects/Assignment_1/src/Images/back.jpg")); // NOI18N
        jLabel11.setText("jLabel11");
        add(jLabel11);
        jLabel11.setBounds(-10, 0, 1110, 690);

        jLabel12.setText("jLabel12");
        add(jLabel12);
        jLabel12.setBounds(890, 230, 53, 16);
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_LNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_LNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_LNActionPerformed

    private void Txt_PhnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_PhnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_PhnoActionPerformed

    private void Txt_AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_AgeActionPerformed

    private void Txt_HtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_HtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_HtActionPerformed

    private void txt_StreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_StreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_StreetActionPerformed

    private void txt_City2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_City2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_City2ActionPerformed

    private void txt_PhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PhotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PhotoActionPerformed

    private void txt_LiscenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LiscenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LiscenseActionPerformed

    private void txt_BName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BName2ActionPerformed

    private void txt_BRoutingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BRoutingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BRoutingActionPerformed

    private void txt_AccNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AccNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AccNoActionPerformed

    private void txt_DiabetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DiabetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DiabetesActionPerformed

    private void txt_BPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BPressureActionPerformed

    private void txt_BNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BNameActionPerformed

    private void txt_BRouting1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BRouting1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BRouting1ActionPerformed

    private void txt_AccNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AccNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AccNo1ActionPerformed

    private void txt_SSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SSNActionPerformed

    private void txt_ZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ZipActionPerformed

    private void txt_AcctypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AcctypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AcctypeActionPerformed

    private void txt_RecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RecordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RecordActionPerformed

    private void txt_IssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IssueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IssueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_AccNo;
    private javax.swing.JLabel Lbl_AccType;
    private javax.swing.JLabel Lbl_Accno;
    private javax.swing.JLabel Lbl_Acctype;
    private javax.swing.JLabel Lbl_Address;
    private javax.swing.JLabel Lbl_Age;
    private javax.swing.JLabel Lbl_BName;
    private javax.swing.JLabel Lbl_BName1;
    private javax.swing.JLabel Lbl_Balance;
    private javax.swing.JLabel Lbl_Balance1;
    private javax.swing.JLabel Lbl_City;
    private javax.swing.JLabel Lbl_DOB;
    private javax.swing.JLabel Lbl_Expiry;
    private javax.swing.JLabel Lbl_Firstname;
    private javax.swing.JLabel Lbl_Height;
    private javax.swing.JLabel Lbl_Issue;
    private javax.swing.JLabel Lbl_LastName;
    private javax.swing.JLabel Lbl_Liscense;
    private javax.swing.JLabel Lbl_Liscense1;
    private javax.swing.JLabel Lbl_Phno;
    private javax.swing.JLabel Lbl_Photo;
    private javax.swing.JLabel Lbl_Routing;
    private javax.swing.JLabel Lbl_Routing1;
    private javax.swing.JLabel Lbl_SSN;
    private javax.swing.JLabel Lbl_State;
    private javax.swing.JLabel Lbl_Street;
    private javax.swing.JLabel Lbl_Weight;
    private javax.swing.JLabel Lbl_Zip;
    private javax.swing.JTextField Txt_Age;
    private javax.swing.JTextField Txt_BName;
    private javax.swing.JTextField Txt_BRouting;
    private javax.swing.JTextField Txt_DOB;
    private javax.swing.JTextField Txt_FN;
    private javax.swing.JTextField Txt_Ht;
    private javax.swing.JTextField Txt_LN;
    private javax.swing.JTextField Txt_Phno;
    private javax.swing.JTextField Txt_Wt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_AccNo;
    private javax.swing.JTextField txt_AccNo1;
    private javax.swing.JTextField txt_Acctype;
    private javax.swing.JTextField txt_BGroup;
    private javax.swing.JTextField txt_BName;
    private javax.swing.JTextField txt_BName2;
    private javax.swing.JTextField txt_BPressure;
    private javax.swing.JTextField txt_BRouting;
    private javax.swing.JTextField txt_BRouting1;
    private javax.swing.JTextField txt_Balance;
    private javax.swing.JTextField txt_City2;
    private javax.swing.JTextField txt_Covid;
    private javax.swing.JTextField txt_Diabetes;
    private javax.swing.JTextField txt_Expiry;
    private javax.swing.JTextField txt_Issue;
    private javax.swing.JTextField txt_Liscense;
    private javax.swing.JTextField txt_Photo;
    private javax.swing.JTextField txt_Record;
    private javax.swing.JTextField txt_SSN;
    private javax.swing.JTextField txt_State;
    private javax.swing.JTextField txt_Street;
    private javax.swing.JTextField txt_Zip;
    // End of variables declaration//GEN-END:variables

    private void displayperson() {
        //To change body of generated methods, choose Tools | Templates.
        Txt_FN.setText(person.getFirst_Name());
        Txt_LN.setText(person.getLast_Name());
        Txt_Phno.setText(person.getPhone_Num());
        Txt_DOB.setText(person.getDOB());
        Txt_Age.setText(person.getAge());
        Txt_Ht.setText(person.getHeight());
        Txt_Wt.setText(person.getWeight());
        Txt_Wt.setText(person.getSSN());
    }

    private void displayaddress() {
    txt_Street.setText(address.getStreet());
    txt_City2.setText(address.getCity());
    txt_State.setText(address.getState());
    txt_Zip.setText(address.getZipcode()); //To change body of generated methods, choose Tools | Templates.
    }

    private void displaysavings() {
    txt_BName2.setText(savings.getBank_Name());
    txt_BRouting.setText(savings.getBank_Routing());
    txt_Balance.setText(savings.getBank_Balance());
    txt_AccNo.setText(savings.getAccount_No());
    txt_Acctype.setText(savings.getAccount_Type()); //To change body of generated methods, choose Tools | Templates.
    }

    private void displaycheckin() {
    txt_BName.setText(checkin.getBank_Name1());
    txt_BRouting.setText(checkin.getBank_Routing1());
    txt_Balance.setText(checkin.getBank_Balance1());
    txt_AccNo.setText(checkin.getAccount_No1());
    txt_Acctype.setText(checkin.getAccount_Type1());//To change body of generated methods, choose Tools | Templates.
    }

    private void displayliscense() {
         
       txt_Liscense.setText(liscense.getLiscense_No());
       txt_Issue.setText(liscense.getIssue_Date());
       txt_Expiry.setText(liscense.getExpiry_Date());
       txt_Photo.setText(liscense.getPhoto());//To change body of generated methods, choose Tools | Templates.
    }

    private void displaymedical() {
     txt_Record.setText(medical.getRecord_No());
     txt_BGroup.setText(medical.getBlood_Pressure());
     txt_Diabetes.setText(medical.getDiabetes());
     txt_BPressure.setText(medical.getBlood_Pressure());
     txt_Covid.setText(medical.getCovid());//To change body of generated methods, choose Tools | Templates.
    }
    
}