/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.Database;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.Student_Course;
/**
 *
 * @author khale
 */
public class MakeAsurvey extends javax.swing.JFrame {
    ButtonGroup bg1 = new ButtonGroup();
    ButtonGroup bg2 = new ButtonGroup();
    ButtonGroup bg3 = new ButtonGroup();
    Student_Course student_course ;
    Database database = new Database();
    
    public MakeAsurvey(Student_Course student_course) {
        initComponents();
        this.student_course = student_course ;
        if(student_course.getSurvyID() != 0){
            PANEL.setVisible(false);
        }
        addRadioButtonsToItsGroup();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PANELLL = new javax.swing.JPanel();
        LABTXT = new javax.swing.JLabel();
        PANEL = new javax.swing.JPanel();
        d = new javax.swing.JRadioButton();
        e = new javax.swing.JRadioButton();
        z = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        m = new javax.swing.JRadioButton();
        n = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        g = new javax.swing.JRadioButton();
        b = new javax.swing.JRadioButton();
        c = new javax.swing.JRadioButton();
        a = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        SUBMIT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Ravie", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Make Survey");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        LABTXT.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        LABTXT.setForeground(new java.awt.Color(153, 0, 0));
        LABTXT.setText("You already Submited");

        PANEL.setForeground(new java.awt.Color(102, 102, 102));

        d.setFont(new java.awt.Font("Ravie", 0, 11)); // NOI18N
        d.setText("Strongly Agree");

        e.setFont(new java.awt.Font("Ravie", 0, 11)); // NOI18N
        e.setText("Agree");

        z.setFont(new java.awt.Font("Ravie", 0, 11)); // NOI18N
        z.setText("Neutral");

        jLabel5.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel5.setText("The instructor was organized and prepared for every class.");

        m.setFont(new java.awt.Font("Ravie", 0, 11)); // NOI18N
        m.setText("Agree");

        n.setFont(new java.awt.Font("Ravie", 0, 11)); // NOI18N
        n.setText("Neutral");

        jLabel6.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel6.setText("The instructor challenged students to do their best work.");

        g.setFont(new java.awt.Font("Ravie", 0, 11)); // NOI18N
        g.setText("Strongly Agree");

        b.setFont(new java.awt.Font("Ravie", 0, 11)); // NOI18N
        b.setText("Agree");

        c.setFont(new java.awt.Font("Ravie", 0, 11)); // NOI18N
        c.setText("Neutral");

        a.setFont(new java.awt.Font("Ravie", 0, 11)); // NOI18N
        a.setText("Strongly Agree");

        jLabel2.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jLabel2.setText("The instructor managed classroom time and pace well.");

        javax.swing.GroupLayout PANELLayout = new javax.swing.GroupLayout(PANEL);
        PANEL.setLayout(PANELLayout);
        PANELLayout.setHorizontalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANELLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(630, Short.MAX_VALUE)))
        );
        PANELLayout.setVerticalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANELLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGap(115, 115, 115)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(132, 132, 132))
            .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANELLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(a)
                    .addGap(18, 18, 18)
                    .addComponent(b)
                    .addGap(18, 18, 18)
                    .addComponent(c)
                    .addGap(47, 47, 47)
                    .addComponent(d)
                    .addGap(18, 18, 18)
                    .addComponent(e)
                    .addGap(18, 18, 18)
                    .addComponent(z)
                    .addGap(47, 47, 47)
                    .addComponent(g)
                    .addGap(18, 18, 18)
                    .addComponent(m)
                    .addGap(18, 18, 18)
                    .addComponent(n)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jButton2.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        SUBMIT.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        SUBMIT.setText("Submit");
        SUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBMITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANELLLLayout = new javax.swing.GroupLayout(PANELLL);
        PANELLL.setLayout(PANELLLLayout);
        PANELLLLayout.setHorizontalGroup(
            PANELLLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELLLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PANELLLLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(LABTXT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANELLLLayout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(SUBMIT, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(277, 277, 277))
        );
        PANELLLLayout.setVerticalGroup(
            PANELLLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANELLLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LABTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PANELLLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SUBMIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PANELLL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PANELLL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBMITActionPerformed
        addSurvy();
    }//GEN-LAST:event_SUBMITActionPerformed
    void addRadioButtonsToItsGroup(){
        bg1.add(a);
        bg1.add(b);
        bg1.add(c);
        bg2.add(d);
        bg2.add(e);
        bg2.add(z);
        bg3.add(g);
        bg3.add(m);
        bg3.add(n);
    }
    void addSurvy(){
        try {
            int survyID = database.maxValueSurvyID()+1 ;
            database.addRow("survy", addSurvyInformationToList(survyID));
            database.updateSurvyID(addSurvyInformationToListForStudent_course(survyID));
            PANEL.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(MakeAsurvey.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    List addSurvyInformationToList(int survyID) throws SQLException{
        List list = new ArrayList();
        list.add(survyID);
        list.add(getAnswersOfSurvy()[0]);
        list.add(getAnswersOfSurvy()[1]);
        list.add(getAnswersOfSurvy()[2]);
        list.add(student_course.getStudent_courseID());
        return list ;
    }
    List addSurvyInformationToListForStudent_course(int survyID) throws SQLException{
        List list = new ArrayList();
        list.add(survyID);
        list.add(student_course.getStudent_courseID());
        return list ;
    }
    String [] getAnswersOfSurvy(){
        String allAnswers[] = new String [3] ;
        if(a.isSelected())
            allAnswers[0] = "Strongly Agree";
        else if(b.isSelected())
            allAnswers[0] = "Agree";
        else if(c.isSelected())
            allAnswers[0] = "Neutral";

        if(d.isSelected())
            allAnswers[1] = "Strongly Agree";
        else if(e.isSelected())
            allAnswers[1] = "Agree";
        else if(z.isSelected())
            allAnswers[1] = "Neutral";

        if(g.isSelected())
            allAnswers[2] = "Strongly Agree";
        else if(m.isSelected())
            allAnswers[2] = "Agree";
        else if(n.isSelected())
            allAnswers[2] = "Neutral";
        
        return allAnswers;
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MakeAsurvey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakeAsurvey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakeAsurvey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakeAsurvey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakeAsurvey(new Student_Course()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LABTXT;
    private javax.swing.JPanel PANEL;
    private javax.swing.JPanel PANELLL;
    private javax.swing.JButton SUBMIT;
    private javax.swing.JRadioButton a;
    private javax.swing.JRadioButton b;
    private javax.swing.JRadioButton c;
    private javax.swing.JRadioButton d;
    private javax.swing.JRadioButton e;
    private javax.swing.JRadioButton g;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton m;
    private javax.swing.JRadioButton n;
    private javax.swing.JRadioButton z;
    // End of variables declaration//GEN-END:variables
}
