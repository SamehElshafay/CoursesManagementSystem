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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Admin;
import model.Instructor;
import model.Student;
import model.User;

/**
 *
 * @author sameh
 */
public class ShowStudent extends javax.swing.JFrame {
    private Database database = new Database();
    private ArrayList<Student> students = new ArrayList<>();
    private static String username ;
    private ArrayList<String> databaseHead = new ArrayList<>();
    DefaultTableModel model ;
    public ShowStudent(String username) throws SQLException {
        initComponents();
        this.username = username ;
        students    = database.retrieveStudents("user");
        model = (DefaultTableModel) studentTable.getModel() ;
        fillTabelWithInstructorInformation();
        fillListWithHeadOfdatabaseTable();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        VALUE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        DELETE = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        UPDATE = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("STUDENTS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        VALUE.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel4.setText("value");

        DELETE.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        DELETE.setText("delete");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(2, 60));
        jPanel1.setMinimumSize(new java.awt.Dimension(2, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane4.setToolTipText("");

        studentTable.setFont(new java.awt.Font("Ravie", 0, 12)); // NOI18N
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "userID", "username", "password", "fname", "lname", "phone", "gender", "age", "Activate", "Courses"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(studentTable);

        UPDATE.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        UPDATE.setText("update");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(VALUE, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UPDATE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DELETE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(VALUE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UPDATE))
                    .addComponent(DELETE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new adminMainpage(username).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        updateTableValues();
    }//GEN-LAST:event_UPDATEActionPerformed
    
    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        deleteRowFromTable();
    }//GEN-LAST:event_DELETEActionPerformed
    
    void fillTabelWithInstructorInformation(){
        for(int i = 0 ; i < students.size() ; i++){
            Object[] rowStudentTable = {
                students.get(i).getUserID() , students.get(i).getUsername() ,
                students.get(i).getPassword() , students.get(i).getFname() ,
                students.get(i).getLname() , students.get(i).getPhone() ,
                students.get(i).getGender() , students.get(i).getAge() ,
                students.get(i).isActive() , students.get(i).getCourse()
            };
            fillTableIn(studentTable, rowStudentTable);
        }
    }
    void fillListWithHeadOfdatabaseTable(){
        databaseHead.add("userID");
        databaseHead.add("username");
        databaseHead.add("password");
        databaseHead.add("firstname");
        databaseHead.add("lasttname");
        databaseHead.add("phone");
        databaseHead.add("gender");
        databaseHead.add("age");
        databaseHead.add("isActive");
        databaseHead.add("course");
        databaseHead.add("type");
    }
    void fillTableIn(JTable table , Object[] row){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(row);
    }
    void updateTableValues(){
        if(studentTable.getSelectedColumn() != 0){
            try {
                updateValueOfActive();
                database.updateValue("user", fillListToUpdateTable());
            } catch (SQLException ex) {
                Logger.getLogger(ShowInstructor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "user id cant be updated");
        }
    }
    List fillListToUpdateTable(){
        List list = new ArrayList();
        list.add((int) model.getValueAt(studentTable.getSelectedRow(), 0));
        list.add(databaseHead.get(studentTable.getSelectedColumn()));
        list.add(VALUE.getText());
        return list ;
    }
    void updateValueOfActive(){
        if(studentTable.getSelectedColumn() == 8){
            turnActive();
        }
        else{
            model.setValueAt(VALUE.getText(), studentTable.getSelectedRow() , studentTable.getSelectedColumn());
        }
    }
    void turnActive(){
        if(VALUE.getText().equals("1")){
            model.setValueAt(true , studentTable.getSelectedRow() , studentTable.getSelectedColumn());
        }
        else if(VALUE.getText().equals("0")){
            model.setValueAt(false , studentTable.getSelectedRow() , studentTable.getSelectedColumn());
        }
    }
    void deleteRowFromTable(){
        try {
            model.setValueAt(VALUE.getText(), studentTable.getSelectedRow() , studentTable.getSelectedColumn());
            database.deleteValue("user" , fileListToDeleteRow() );
            model.removeRow(studentTable.getSelectedRow());
        } catch (SQLException ex) {
            Logger.getLogger(ShowInstructor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    List fileListToDeleteRow(){
        List list = new ArrayList();
        list.add("userID");
        list.add(model.getValueAt(studentTable.getSelectedRow(), 0));
        return list ;
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new ShowStudent(username).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ShowStudent.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETE;
    private javax.swing.JButton UPDATE;
    private javax.swing.JTextField VALUE;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables
}
