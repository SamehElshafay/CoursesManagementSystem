/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.* ;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Instructor;
import model.Student;
import model.User;


/**
 *
 * @author sameh
 */
public class InstructorProfile extends javax.swing.JFrame {
    private String username ;
    private Instructor instructor ;
    private Database database = new Database();
    
    public InstructorProfile(String username) throws SQLException {
        initComponents();
        this.username = username ;
        instructor = database.retrieveInstructor(username);
        fillEntitys();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        GENDER = new javax.swing.JLabel();
        FIRSTNAME = new javax.swing.JTextField();
        AGE = new javax.swing.JTextField();
        LASTNAME = new javax.swing.JTextField();
        PHONE = new javax.swing.JTextField();
        PASSWORD = new javax.swing.JTextField();
        BACK = new javax.swing.JButton();
        SAVE = new javax.swing.JButton();
        USERID = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        USERNAME = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Your Profile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel1.setText("User ID :");

        jLabel3.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel3.setText("username :");

        jLabel5.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel5.setText("First Name :");

        jLabel7.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel7.setText("Last Name :");

        jLabel10.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel10.setText("Phone :");

        jLabel13.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel13.setText("Gender :");

        jLabel14.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel14.setText("Password :");

        GENDER.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        GENDER.setText("                                     ");

        FIRSTNAME.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N

        AGE.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N

        LASTNAME.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N

        PHONE.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N

        PASSWORD.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N

        BACK.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        BACK.setText("Back");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        SAVE.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        SAVE.setText("Save");
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });

        USERID.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        USERID.setText("                                     ");

        jLabel15.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel15.setText("Age :");

        USERNAME.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        USERNAME.setText("                                     ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SAVE)
                        .addGap(18, 18, 18)
                        .addComponent(BACK)
                        .addGap(71, 71, 71))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FIRSTNAME)
                            .addComponent(LASTNAME)
                            .addComponent(PHONE)
                            .addComponent(PASSWORD)
                            .addComponent(AGE)
                            .addComponent(GENDER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(USERNAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(USERID))))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(USERID))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(USERNAME))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FIRSTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(LASTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(GENDER))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BACK)
                    .addComponent(SAVE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
        saveInstructorInformation();
    }//GEN-LAST:event_SAVEActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        try {
            new instructorMainpage(username).setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(InstructorProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BACKActionPerformed
    void saveInstructorInformation(){
        try {
            List list = new ArrayList();
            list.add("userID");
            list.add(instructor.getUserID());
            database.deleteValue("user" , list );
            list.clear();
            list = addInstructorInformationToList();
            database.addRow("user" , list);
            JOptionPane.showMessageDialog(this, "updated successfully");
        } catch (SQLException ex) {
            Logger.getLogger(InstructorProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    List addInstructorInformationToList(){
        List list = new ArrayList();
        list.add(instructor.getUserID());
        list.add(instructor.getUsername());
        list.add(PASSWORD.getText());
        list.add(FIRSTNAME.getText());
        list.add(LASTNAME.getText());
        list.add(PHONE.getText());
        list.add(instructor.getGender());
        list.add(AGE.getText());
        list.add(instructor.isActive());
        list.add(instructor.getCourse());
        list.add(instructor.getType());
        return list ;
    }
    void fillEntitys(){
        USERID.setText(String.valueOf(instructor.getUserID()));
        USERNAME.setText(instructor.getUsername());
        FIRSTNAME.setText(instructor.getFname());
        LASTNAME.setText(instructor.getLname());
        PHONE.setText(instructor.getPhone());
        PASSWORD.setText(instructor.getPassword());
        GENDER.setText(instructor.getGender());
        AGE.setText(String.valueOf(instructor.getAge()));
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InstructorProfile("").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(InstructorProfile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AGE;
    private javax.swing.JButton BACK;
    private javax.swing.JTextField FIRSTNAME;
    private javax.swing.JLabel GENDER;
    private javax.swing.JTextField LASTNAME;
    private javax.swing.JTextField PASSWORD;
    private javax.swing.JTextField PHONE;
    private javax.swing.JButton SAVE;
    private javax.swing.JLabel USERID;
    private javax.swing.JLabel USERNAME;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
