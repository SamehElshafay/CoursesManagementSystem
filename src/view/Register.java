/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.Database;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sameh
 */
public class Register extends javax.swing.JFrame {
    Database database = new Database();
    private int slide ;
    private String username ;
    /**
     * Creates new form Register
     */
    public Register(int slide , String username) {
        initComponents();
        this.slide = slide ;
        this.username = username ;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TYPE = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PASSWORD = new javax.swing.JTextField();
        PHONE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        FIRSTNAME = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        LASTNAME = new javax.swing.JTextField();
        GENDER = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Gender1 = new javax.swing.JLabel();
        AGE = new javax.swing.JTextField();
        USERNAME = new javax.swing.JTextField();
        Gender2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 560));
        setMinimumSize(new java.awt.Dimension(900, 560));
        setPreferredSize(new java.awt.Dimension(900, 560));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registeration");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(330, 330, 330))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TYPE.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        TYPE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "student", "instructor" }));

        jLabel2.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel2.setText("Password");

        jLabel5.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel5.setText("Phone");

        PASSWORD.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        PASSWORD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PASSWORD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PHONE.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        PHONE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PHONE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel3.setText("First Name");

        jButton1.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        FIRSTNAME.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        FIRSTNAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FIRSTNAME.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton2.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jButton2.setText("Send Response");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        LASTNAME.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        LASTNAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LASTNAME.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        GENDER.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        GENDER.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel4.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel4.setText("Last Name");

        Gender.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        Gender.setText("Gender");

        Gender1.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        Gender1.setText("Age");

        AGE.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        AGE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AGE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        USERNAME.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        USERNAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        USERNAME.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Gender2.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        Gender2.setText("type");

        jLabel1.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel1.setText("Username");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(USERNAME)
                            .addComponent(PASSWORD)
                            .addComponent(FIRSTNAME, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TYPE, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(Gender)
                            .addComponent(Gender2)
                            .addComponent(Gender1))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AGE)
                            .addComponent(LASTNAME)
                            .addComponent(PHONE)
                            .addComponent(GENDER, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(250, 250, 250))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(USERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FIRSTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LASTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender)
                    .addComponent(GENDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gender1))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender2)
                    .addComponent(TYPE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        openFrame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        addUser();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    void addUser(){
        try {
            database.addRow("user", fillListTOAddRow());
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    List fillListTOAddRow() throws SQLException{
        List list = new ArrayList();
        list.add(database.maxValue()+1);
        list.add(USERNAME.getText());
        list.add(PASSWORD.getText());
        list.add(FIRSTNAME.getText());
        list.add(LASTNAME.getText());
        list.add(PHONE.getText());
        list.add(GENDER.getSelectedItem());
        list.add(AGE.getText());
        list.add(0);
        list.add(0);
        list.add(TYPE.getSelectedItem());
        return list ;
    }
    void openFrame(){
        if(slide == 1)
            new Login().setVisible(true);
        else
            new adminMainpage(username).setVisible(true);
        dispose();
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register(0 , "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AGE;
    private javax.swing.JTextField FIRSTNAME;
    private javax.swing.JComboBox<String> GENDER;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Gender1;
    private javax.swing.JLabel Gender2;
    private javax.swing.JTextField LASTNAME;
    private javax.swing.JTextField PASSWORD;
    private javax.swing.JTextField PHONE;
    private javax.swing.JComboBox<String> TYPE;
    private javax.swing.JTextField USERNAME;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
