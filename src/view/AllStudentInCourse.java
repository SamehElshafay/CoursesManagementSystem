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
import javax.swing.table.DefaultTableModel;
import model.Course;
import model.Student;
import model.Student_Course;

/**
 *
 * @author sameh
 */
public class AllStudentInCourse extends javax.swing.JFrame {
    private ArrayList <Student_Course> student_course ;
    private ArrayList <Student> student = new ArrayList<>(); ;
    private Course course ;
    private Database database = new Database();
    private String username ;
    DefaultTableModel model ;
    public AllStudentInCourse(Course course , String username) throws SQLException {
        initComponents();
        this.course = course ;
        this.username = username ;
        HEADSTATEMENTNAME.setText("All Student that enrolled in : " + course.getCourseName() ); 
        HEADSTATEMENTID  .setText("and Course ID is : " + course.getCourseID());
        model = (DefaultTableModel) STUDENTINFOSTABLE.getModel();
        student_course = database.retrieveAllStudent_CourseUsingCoursID(course.getCourseID());
        fillTable();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        HEADSTATEMENTNAME = new javax.swing.JLabel();
        HEADSTATEMENTID = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        STUDENTINFOSTABLE = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 450));
        setMinimumSize(new java.awt.Dimension(850, 450));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        HEADSTATEMENTNAME.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        HEADSTATEMENTNAME.setForeground(new java.awt.Color(255, 255, 255));
        HEADSTATEMENTNAME.setText("All Student that enrolled in :  ");

        HEADSTATEMENTID.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        HEADSTATEMENTID.setForeground(new java.awt.Color(255, 255, 255));
        HEADSTATEMENTID.setText("All Student that enrolled in :  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HEADSTATEMENTNAME)
                    .addComponent(HEADSTATEMENTID))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HEADSTATEMENTNAME)
                .addGap(10, 10, 10)
                .addComponent(HEADSTATEMENTID)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        STUDENTINFOSTABLE.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        STUDENTINFOSTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Phone", "Accept"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        STUDENTINFOSTABLE.setGridColor(new java.awt.Color(255, 255, 255));
        STUDENTINFOSTABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                STUDENTINFOSTABLEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(STUDENTINFOSTABLE);

        jButton1.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(82, 82, 82))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            new CourseModule(username).setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(AllStudentInCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void STUDENTINFOSTABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STUDENTINFOSTABLEMouseClicked
        onRowEntered();
    }//GEN-LAST:event_STUDENTINFOSTABLEMouseClicked
    void fillTable() throws SQLException{
        for(int i = 0 ; i < student_course.size() ; i++){
            student.add(database.retrieveStudentUsingID(student_course.get(i).getStudentID()));
            Object row [] = {
                student.get(i).getUserID() , student.get(i).getUsername() ,
                student.get(i).getPhone() , student_course.get(i).isAccepted()
            };
            model.addRow(row);
        }   
    }
    void onRowEntered(){
        if(STUDENTINFOSTABLE.getSelectedColumn() == 3){
            try {
                boolean accepted = Boolean.parseBoolean(String.valueOf(STUDENTINFOSTABLE.getValueAt(STUDENTINFOSTABLE.getSelectedRow(), STUDENTINFOSTABLE.getSelectedColumn()))) ;
                List list = new ArrayList();
                if(accepted)
                    list.add(0);
                else
                    list.add(1);
                
                list.add(student_course.get(STUDENTINFOSTABLE.getSelectedRow()).getStudent_courseID());
                database.updateAccepted( list );
                model.setValueAt(true, STUDENTINFOSTABLE.getSelectedRow() , STUDENTINFOSTABLE.getSelectedColumn());
            } catch (SQLException ex) {
                Logger.getLogger(AllStudentInCourse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllStudentInCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AllStudentInCourse(new Course() , "").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AllStudentInCourse.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HEADSTATEMENTID;
    private javax.swing.JLabel HEADSTATEMENTNAME;
    private javax.swing.JTable STUDENTINFOSTABLE;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
