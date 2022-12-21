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

public class Course {
    private int    courseID ;
    private String courseName ;
    private String instructor ;
    private String room ;
    private String branch ;
    private String price ;
    private String parentCourse ;
    private String startDate ;
    private String duration ;
    private String endDate ;
    private boolean nearToStart ;
    private boolean nearToEnd ;

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getParentCourse() {
        return parentCourse;
    }

    public void setParentCourse(String parentCourse) {
        this.parentCourse = parentCourse;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isNearToStart() {
        return nearToStart;
    }

    public void setNearToStart(boolean nearToStart) {
        this.nearToStart = nearToStart;
    }

    public boolean isNearToEnd() {
        return nearToEnd;
    }

    public void setNearToEnd(boolean nearToEnd) {
        this.nearToEnd = nearToEnd;
    }
    
}
