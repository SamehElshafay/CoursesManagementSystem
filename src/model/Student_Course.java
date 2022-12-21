/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sameh
 */
public class Student_Course {
    private String student_courseID ;
    private int studentID ;
    private int courseID ;
    private int studentGrade ;
    private boolean accepted ;
    private int survyID ;

    public String getStudent_courseID() {
        return student_courseID;
    }

    public void setStudent_courseID(String student_courseID) {
        this.student_courseID = student_courseID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public int getSurvyID() {
        return survyID;
    }

    public void setSurvyID(int survyID) {
        this.survyID = survyID;
    }
    
    
}
