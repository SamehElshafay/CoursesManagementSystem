/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.Database;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Course;
import model.Instructor;
import model.Student;

/**
 *
 * @author sameh
 */
public class CourseModule extends javax.swing.JFrame {
    private Database database = new Database();
    private ArrayList <Course> courses = new ArrayList<>();
    private Student student = new Student();
    private String username ;
    private ArrayList <Instructor> instructors = new ArrayList() ;
    private ArrayList <String> headTable = new ArrayList<>();
    DefaultTableModel model ;
    
    public CourseModule(String username) throws SQLException {
        initComponents();
        this.username = username ;
        instructors = database.retrieveInstructors() ;
        courses = database.retrieveCourses("courses");
        model = (DefaultTableModel) COURSESTABLE.getModel();
        preperFrame();
        fillListOFHead();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        INSTRUCTOR = new javax.swing.JComboBox<>();
        PARENTCOURSE = new javax.swing.JComboBox<>();
        ROOM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BRANCH = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PRICE = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sww = new javax.swing.JLabel();
        STARTDATA = new javax.swing.JTextField();
        DURATION = new javax.swing.JTextField();
        ee = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        COURSENAME = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ENDDATE = new javax.swing.JTextField();
        ss = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        DELETE = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        VALUE = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        COURSESTABLE = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 617));
        setMinimumSize(new java.awt.Dimension(900, 617));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel2.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Course");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        INSTRUCTOR.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        INSTRUCTOR.setMaximumSize(new java.awt.Dimension(43, 31));

        PARENTCOURSE.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        PARENTCOURSE.setToolTipText("");
        PARENTCOURSE.setMaximumSize(new java.awt.Dimension(43, 31));

        ROOM.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel5.setText("Branch");

        BRANCH.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel6.setText("Price");

        PRICE.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel7.setText("Parent Course");

        sww.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        sww.setText("Start Date");

        STARTDATA.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N

        DURATION.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N

        ee.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        ee.setText("Duration");

        jLabel1.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel1.setText("Course Name");

        COURSENAME.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel3.setText("Instructor");

        jLabel4.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel4.setText("Room");

        ENDDATE.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N

        ss.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        ss.setText("End Date");

        jButton2.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        UPDATE.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        UPDATE.setText("update");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
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

        DELETE.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        DELETE.setText("delete");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel11.setText("value");

        VALUE.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N

        COURSESTABLE.setFont(new java.awt.Font("Ravie", 0, 11)); // NOI18N
        COURSESTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Name", "Instructor", "Room", "Branch", "Price", "Parent Course", "Start Date", "Duration", "End Date", "near to start", "near to end"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        COURSESTABLE.setGridColor(new java.awt.Color(255, 255, 255));
        COURSESTABLE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                COURSESTABLEKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(COURSESTABLE);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(COURSENAME, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(INSTRUCTOR, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ROOM, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BRANCH, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PARENTCOURSE, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(sww, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(STARTDATA, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(ee, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DURATION, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ENDDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(VALUE, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UPDATE)
                                .addGap(14, 14, 14)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(DELETE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(225, 225, 225))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(COURSENAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(INSTRUCTOR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ROOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(BRANCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(PARENTCOURSE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sww)
                            .addComponent(STARTDATA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ee)
                            .addComponent(DURATION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ss)
                            .addComponent(ENDDATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
                        .addComponent(DELETE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(VALUE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UPDATE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        update(COURSESTABLE);
    }//GEN-LAST:event_UPDATEActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        addCourse();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        deleteCourse();
    }//GEN-LAST:event_DELETEActionPerformed

    private void COURSESTABLEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_COURSESTABLEKeyPressed
        keybordValueEntered(evt);
    }//GEN-LAST:event_COURSESTABLEKeyPressed
        
    void preperFrame(){
        fillTableOfCourses();
        fillInstructorCombobox();
        fillParentCourseCombobox();
    }
    void fillTableOfCourses(){
        for(int i = 0 ; i < courses.size() ; i++){
            Object[] rowCourseTable = {
                courses.get(i).getCourseID(), courses.get(i).getCourseName(),
                courses.get(i).getInstructor(), courses.get(i).getRoom(),
                courses.get(i).getBranch(), courses.get(i).getPrice(),
                courses.get(i).getParentCourse(), courses.get(i).getStartDate(),
                courses.get(i).getDuration(), courses.get(i).getEndDate() ,
                courses.get(i).isNearToStart(), courses.get(i).isNearToEnd()
            };
            fillTableIn(COURSESTABLE, rowCourseTable);
        }
    }
    void fillInstructorCombobox(){
        for(int i = 0 ; i < instructors.size() ; i++){
            INSTRUCTOR.addItem(instructors.get(i).getUsername());
        }
    }
    void fillParentCourseCombobox(){
        PARENTCOURSE.addItem("none");
        for(int i = 0 ; i < courses.size() ; i++){
            PARENTCOURSE.addItem(courses.get(i).getCourseName());
        }
    }
    void fillListOFHead(){
        headTable.add("courseID");
        headTable.add("courseName");
        headTable.add("instructor");
        headTable.add("room");
        headTable.add("branch");
        headTable.add("price");
        headTable.add("parentCourse");
        headTable.add("startDate");
        headTable.add("duration");
        headTable.add("endDate");
        headTable.add("nearToStart");
        headTable.add("nearToEnd");
    }
    void fillTableIn(JTable table , Object[] row){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(row);
    }
    public void update(JTable COURSESTABLE) {
        try {
            if(COURSESTABLE.getSelectedColumn() != 6 && COURSESTABLE.getSelectedColumn() != 0 && !VALUE.getText().equals("")){
                List list = new ArrayList();
                list.add(COURSESTABLE.getValueAt(COURSESTABLE.getSelectedRow(), 0));
                list.add(headTable.get(COURSESTABLE.getSelectedColumn()));
                list.add(VALUE.getText());
                database.updateValueCourseTable("courses", list);
                if(COURSESTABLE.getSelectedColumn() == 10 || COURSESTABLE.getSelectedColumn() == 11)
                    if(VALUE.getText().equals("1"))
                        model.setValueAt(true, COURSESTABLE.getSelectedRow(), COURSESTABLE.getSelectedColumn());
                    else
                        model.setValueAt(false, COURSESTABLE.getSelectedRow(), COURSESTABLE.getSelectedColumn());
                else
                    model.setValueAt(VALUE.getText(),COURSESTABLE.getSelectedRow(),COURSESTABLE.getSelectedColumn());
                JOptionPane.showMessageDialog(this, "Updated Successfully!!");
                VALUE.setText("");
            }
            else if(COURSESTABLE.getSelectedColumn() == 6){
                new UpdateParentCourse(COURSESTABLE , courses , this).setVisible(true);
                this.disable();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void addCourse(){
        try {
            List list = addValuesToList();
            database.addRow("courses", list);
            addValuesToRow(list);
            clearEntity(list);
        } catch (SQLException ex) {
            Logger.getLogger(CourseModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void addValuesToRow(List list){
        Object row[] = new Object[list.size()];
        for(int i = 0 ; i < list.size() ; i++ ){
            row[i] = list.get(i);
        }
        model.addRow(row);
    }
    public void update(JTable COURSESTABLE , String Value) {
        try {
            List list = new ArrayList();
            list.add(COURSESTABLE.getValueAt(COURSESTABLE.getSelectedRow(), 0));
            list.add(headTable.get(COURSESTABLE.getSelectedColumn()));
            list.add(Value);
            database.updateValueCourseTable("courses", list);
            model.setValueAt(Value,COURSESTABLE.getSelectedRow(),COURSESTABLE.getSelectedColumn());
            JOptionPane.showMessageDialog(this, "Updated Successfully!!");
        } catch (SQLException ex) {
            Logger.getLogger(CourseModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void clearEntity(List list){
        COURSENAME.setText("") ;
        ROOM.setText("") ;
        BRANCH.setText("") ;
        PRICE.setText("") ;
        PARENTCOURSE.addItem(String.valueOf(list.get(1)));
        STARTDATA.setText("") ;
        DURATION.setText("") ;
        ENDDATE.setText("") ;
    }
    List addValuesToList() throws SQLException{
        List list = new ArrayList();
        list.add(database.maxValueCourseID() + 1 );
        list.add(COURSENAME.getText());
        list.add(INSTRUCTOR.getSelectedItem()) ;
        list.add(ROOM.getText()) ;
        list.add(BRANCH.getText()) ;
        list.add(PRICE.getText()) ;
        list.add(PARENTCOURSE.getSelectedItem()) ;
        list.add(STARTDATA.getText()) ;
        list.add(DURATION.getText()) ;
        list.add(ENDDATE.getText()) ;
        list.add(0) ;
        list.add(0) ;
        return list ;
    }
    void deleteCourse(){
        try {
            database.deleteCourse("courses",courses.get(COURSESTABLE.getSelectedRow()).getCourseID());
            database.deleteCourse("student_course",courses.get(COURSESTABLE.getSelectedRow()).getCourseID());
            model.removeRow(COURSESTABLE.getSelectedRow());
        } catch (SQLException ex) {
            Logger.getLogger(CourseModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void keybordValueEntered(KeyEvent event){
        if((event.getKeyChar()+"").equals("\n")){
            try {
                new AllStudentInCourse(courses.get(COURSESTABLE.getSelectedRow()) , username).setVisible(true);
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(CourseModule.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(CourseModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CourseModule("").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CourseModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BRANCH;
    private javax.swing.JTextField COURSENAME;
    private javax.swing.JTable COURSESTABLE;
    private javax.swing.JButton DELETE;
    private javax.swing.JTextField DURATION;
    private javax.swing.JTextField ENDDATE;
    private javax.swing.JComboBox<String> INSTRUCTOR;
    private javax.swing.JComboBox<String> PARENTCOURSE;
    private javax.swing.JTextField PRICE;
    private javax.swing.JTextField ROOM;
    private javax.swing.JTextField STARTDATA;
    private javax.swing.JButton UPDATE;
    private javax.swing.JTextField VALUE;
    private javax.swing.JLabel ee;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel ss;
    private javax.swing.JLabel sww;
    // End of variables declaration//GEN-END:variables
}
