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
import model.Course;
import model.Student;

/**
 *
 * @author sameh
 */
public class courseEnrollment extends javax.swing.JFrame {
    private Database database = new Database();
    private ArrayList <Course> courses     = new ArrayList<>();
    private Student student   = new Student();
    private String username ;
    DefaultTableModel model ;
    /**
     * Creates new form courseEnrollment
     */
    public courseEnrollment(String username) throws SQLException {
        initComponents();
        student = database.retrieveStudent(username);
        courses = database.retrieveCourses("courses");
        model = (DefaultTableModel) COURSESTABLE.getModel();
        fillTableWithCourseInformation() ;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        COURSESTABLE = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 500));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ENROLLMENT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        COURSESTABLE.setFont(new java.awt.Font("Ravie", 0, 11)); // NOI18N
        COURSESTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "courseID", "courseName", "instructor", "room", "branch", "price", "parentCourse", "startDate", "duration", "endDate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(COURSESTABLE);

        jButton2.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jButton1.setText("Enroll");
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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(356, 356, 356))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(15, 15, 15))
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
        addStudentCourse();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            new studentMainpage(student.getUsername()).setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Grades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    void fillTableWithCourseInformation(){
        for(int i = 0 ; i < courses.size() ; i++){
            Object[] rowCourseTable = {courses.get(i).getCourseID(), courses.get(i).getCourseName(),
                            courses.get(i).getInstructor(), courses.get(i).getRoom(),
                            courses.get(i).getBranch(), courses.get(i).getPrice(),
                            courses.get(i).getParentCourse(), courses.get(i).getStartDate(),
                            courses.get(i).getDuration(), courses.get(i).getEndDate()
            };
            model.addRow(rowCourseTable);
        }
    }
    List fileListToAddStudent_CourseRelation(){
        List list = new ArrayList();
        list.add(student.getUserID() +"_"+courses.get(COURSESTABLE.getSelectedRow()).getCourseID()) ;
        list.add(student.getUserID());
        list.add(courses.get(COURSESTABLE.getSelectedRow()).getCourseID());
        list.add(0) ;
        list.add(false) ;
        list.add(0) ;
        return list;
    }
    void addStudentCourse(){
        try {
            database.addRow("student_course", fileListToAddStudent_CourseRelation());
            JOptionPane.showMessageDialog(this, "Enrolled Successfully !!");
        } catch (SQLException ex) {
            if(String.valueOf(ex).contains("Duplicate entry")){
                JOptionPane.showMessageDialog(this, "enrolled Before !!");
            }
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new courseEnrollment("").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(courseEnrollment.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable COURSESTABLE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
/*
if(student.getCourse().contains(String.valueOf(model.getValueAt(COURSESTABLE.getSelectedRow(), 0)))){
            JOptionPane.showMessageDialog(this, "Enrolled Before");
        }
        else{
            //add in course
            try {
                String newValue = student.getCourse() + " , " + String.valueOf(model.getValueAt(COURSESTABLE.getSelectedRow(), 0)) ;
                List list = new ArrayList();
                list.add(student.getUserID());
                list.add("course");
                list.add(newValue);
                database.updateValue("user", list);
                JOptionPane.showMessageDialog(this, "wait for agreement");
            } catch (SQLException ex) {
                Logger.getLogger(courseEnrollment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
*/