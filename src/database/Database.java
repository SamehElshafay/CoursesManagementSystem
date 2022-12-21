/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Admin;
import model.Course;
import model.Instructor;
import model.Student;
import model.Student_Course;
import model.User;


public class Database {
    private Connection con  ;
    public Database(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_system?serverTimezone=UTC" , "root" , "");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }
        this.con = con;
    }
    public ResultSet retrieveAllInstructor(String tableName) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM "+tableName);
        return resultSet ;
    }
    public User retrieveUser(String tableName , String username) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName +
                " WHERE username = '" + username + "'" );
        
        User user = new User();
        while (resultSet.next()){
            user.setUserID(resultSet.getInt("userID"));
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
            user.setType(resultSet.getString("type"));
            user.setIsActive(resultSet.getBoolean("isActive"));
        }
        return user ;
    }
    public ArrayList<Admin> retrieveAdmin(String tableName) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName +
                " WHERE type = 'admin'" );
        ArrayList<Admin> admins = new ArrayList<>();
        
        while (resultSet.next()){
            Admin admin = new Admin();
            admin.setUserID(resultSet.getInt("userID"));
            admin.setUsername(resultSet.getString("username"));
            admin.setPassword(resultSet.getString("password"));
            admin.setFname(resultSet.getString("firstname"));
            admin.setLname(resultSet.getString("lasttname"));
            admin.setAge(resultSet.getInt("age"));
            admin.setPhone(resultSet.getString("phone"));
            admin.setGender(resultSet.getString("gender"));
            admin.setType(resultSet.getString("type"));
            admin.setIsActive(resultSet.getBoolean("isActive"));
            admins.add(admin);
        }
        return admins ;
    }
    public ArrayList<Course> retrieveCourses(String tableName) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM courses");
        ArrayList<Course> courses = new ArrayList<>();
        
        while (resultSet.next()){
            Course course = new Course();
            course.setCourseID(resultSet.getInt("courseID"));
            course.setCourseName(resultSet.getString("courseName"));
            course.setInstructor(resultSet.getString("instructor"));
            course.setRoom(resultSet.getString("room"));
            course.setBranch(resultSet.getString("branch"));
            course.setPrice(resultSet.getString("price"));
            course.setParentCourse(resultSet.getString("parentCourse"));
            course.setStartDate(resultSet.getString("startDate"));
            course.setDuration(resultSet.getString("duration"));
            course.setEndDate(resultSet.getString("endDate"));
            course.setNearToStart(resultSet.getBoolean("nearToStart"));
            course.setNearToEnd(resultSet.getBoolean("nearToEnd"));
            courses.add(course);
        }
        return courses ;
    }
    public ArrayList<Course> retrieveInstructorCourses(String instructorName) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM courses where instructor = '"+ instructorName +"'");
        ArrayList<Course> courses = new ArrayList<>();
        
        while (resultSet.next()){
            Course course = new Course();
            course.setCourseID(resultSet.getInt("courseID"));
            course.setCourseName(resultSet.getString("courseName"));
            course.setInstructor(resultSet.getString("instructor"));
            course.setRoom(resultSet.getString("room"));
            course.setBranch(resultSet.getString("branch"));
            course.setPrice(resultSet.getString("price"));
            course.setParentCourse(resultSet.getString("parentCourse"));
            course.setStartDate(resultSet.getString("startDate"));
            course.setDuration(resultSet.getString("duration"));
            course.setEndDate(resultSet.getString("endDate"));
            courses.add(course);
        }
        return courses ;
    }
    public ArrayList<Student> retrieveStudents(String tableName) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName +
                " WHERE type = 'Student'" );
        
        ArrayList<Student> students = new ArrayList<>();
        while (resultSet.next()){
            Student student = new Student();
            student.setUserID(resultSet.getInt("userID"));
            student.setUsername(resultSet.getString("username"));
            student.setPassword(resultSet.getString("password"));
            student.setFname(resultSet.getString("firstname"));
            student.setLname(resultSet.getString("lasttname"));
            student.setCourse(resultSet.getString("course"));
            student.setAge(resultSet.getInt("age"));
            student.setPhone(resultSet.getString("phone"));
            student.setGender(resultSet.getString("gender"));
            student.setType(resultSet.getString("type"));
            student.setIsActive(resultSet.getBoolean("isActive"));
            students.add(student);
        }
        return students ;
    }
    public ArrayList<Student_Course> retrieveAllStudent_Course(int studentID) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student_course WHERE studentID = '"+ studentID +"'");
        ArrayList<Student_Course> ALL_student_course = new ArrayList<>();
        while (resultSet.next()){
            Student_Course student_course = new Student_Course();
            student_course.setStudent_courseID(resultSet.getString("student_courseID"));
            student_course.setStudentID(resultSet.getInt("studentID"));
            student_course.setCourseID(resultSet.getInt("courseID"));
            student_course.setStudentGrade(resultSet.getInt("studentGrade"));
            student_course.setAccepted(resultSet.getBoolean("accepted"));
            student_course.setSurvyID(resultSet.getInt("survyID"));
            ALL_student_course.add(student_course);
        }
        return ALL_student_course ;
    }
    public ArrayList<Student_Course> retrieveAllStudent_CourseUsingCoursID(int courseID) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student_course WHERE courseID = '"+ courseID +"'");
        ArrayList<Student_Course> ALL_student_course = new ArrayList<>();
        while (resultSet.next()){
            Student_Course student_course = new Student_Course();
            student_course.setStudent_courseID(resultSet.getString("student_courseID"));
            student_course.setStudentID(resultSet.getInt("studentID"));
            student_course.setCourseID(resultSet.getInt("courseID"));
            student_course.setStudentGrade(resultSet.getInt("studentGrade"));
            student_course.setAccepted(resultSet.getBoolean("accepted"));
            student_course.setSurvyID(resultSet.getInt("survyID"));
            ALL_student_course.add(student_course);
        }
        return ALL_student_course ;
    }
    public Student_Course retrieveStudent_Course(int courseID) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student_course WHERE courseID = '"+ courseID +"'" );
        Student_Course student_course = new Student_Course();
        while (resultSet.next()){    
            student_course.setStudent_courseID(resultSet.getString("student_courseID"));
            student_course.setStudentID(resultSet.getInt("studentID"));
            student_course.setCourseID(resultSet.getInt("courseID"));
            student_course.setStudentGrade(resultSet.getInt("studentGrade"));
            student_course.setAccepted(resultSet.getBoolean("accepted"));
            student_course.setSurvyID(resultSet.getInt("survyID"));
        }
        return student_course ;
    }
    public String retrieveCourseName(int courseID) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT courseName FROM courses where courseID = '"+ courseID +"'" );
        String courseName = "" ;
        while (resultSet.next()){
            courseName = resultSet.getString("courseName");
        }
        return courseName ;
    }
    public int[] retrieveCourseAlert(int courseID) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT nearToStart , nearToEnd FROM courses where courseID = '"+ courseID +"'" );
        int alert[] = {0 , 0} ;
        while (resultSet.next()){
            alert[0] = resultSet.getInt("nearToStart");
            alert[1] = resultSet.getInt("nearToEnd");
        }
        return alert ;
    }
    public Student retrieveStudent(String username) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE username = '"+ username +"'" );
        Student student = new Student();
        
        while (resultSet.next()){
            student.setUserID(resultSet.getInt("userID"));
            student.setUsername(resultSet.getString("username"));
            student.setPassword(resultSet.getString("password"));
            student.setFname(resultSet.getString("firstname"));
            student.setLname(resultSet.getString("lasttname"));
            student.setCourse(resultSet.getString("course"));
            student.setAge(resultSet.getInt("age"));
            student.setPhone(resultSet.getString("phone"));
            student.setGender(resultSet.getString("gender"));
            student.setType(resultSet.getString("type"));
            student.setIsActive(resultSet.getBoolean("isActive"));
        }
        return student ;
    }
    public Student retrieveStudentUsingID(int studentID) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE userID = '"+ studentID +"'" );
        Student student = new Student();
        
        while (resultSet.next()){
            student.setUserID(resultSet.getInt("userID"));
            student.setUsername(resultSet.getString("username"));
            student.setPassword(resultSet.getString("password"));
            student.setFname(resultSet.getString("firstname"));
            student.setLname(resultSet.getString("lasttname"));
            student.setCourse(resultSet.getString("course"));
            student.setAge(resultSet.getInt("age"));
            student.setPhone(resultSet.getString("phone"));
            student.setGender(resultSet.getString("gender"));
            student.setType(resultSet.getString("type"));
            student.setIsActive(resultSet.getBoolean("isActive"));
        }
        return student ;
    }
    public ArrayList<Instructor> retrieveInstructors() throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE type = 'instructor'" );
        
        ArrayList<Instructor> instructors = new ArrayList<>();
        while (resultSet.next()){
            Instructor instructor = new Instructor();
            instructor.setUserID(resultSet.getInt("userID"));
            instructor.setUsername(resultSet.getString("username"));
            instructor.setPassword(resultSet.getString("password"));
            instructor.setFname(resultSet.getString("firstname"));
            instructor.setLname(resultSet.getString("lasttname"));
            instructor.setCourse(resultSet.getString("course"));
            instructor.setAge(resultSet.getInt("age"));
            instructor.setPhone(resultSet.getString("phone"));
            instructor.setGender(resultSet.getString("gender"));
            instructor.setType(resultSet.getString("type"));
            instructor.setIsActive(resultSet.getBoolean("isActive"));
            instructors.add(instructor);
        }
        return instructors ;
    }
    public Instructor retrieveInstructor(String username) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE username = '"+ username +"'" );
        
        Instructor instructor = new Instructor();
        while (resultSet.next()){
            instructor.setUserID(resultSet.getInt("userID"));
            instructor.setUsername(resultSet.getString("username"));
            instructor.setPassword(resultSet.getString("password"));
            instructor.setFname(resultSet.getString("firstname"));
            instructor.setLname(resultSet.getString("lasttname"));
            instructor.setCourse(resultSet.getString("course"));
            instructor.setAge(resultSet.getInt("age"));
            instructor.setPhone(resultSet.getString("phone"));
            instructor.setGender(resultSet.getString("gender"));
            instructor.setType(resultSet.getString("type"));
            instructor.setIsActive(resultSet.getBoolean("isActive"));
        }
        return instructor ;
    }
    public int getRowsCount(String tableName) throws SQLException{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("select count(*) from "+tableName);
        resultSet.next();
        return resultSet.getInt(1) ;
    }
    public int addRow(String tableName , List list ) throws SQLException{
        Statement statement = con.createStatement();
        String sql = "";
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i) instanceof String){
                sql = sql + "'" + list.get(i) + "'";
            }
            else{
                sql = sql + list.get(i) ;
            }
            if(i != list.size()-1){
                sql = sql + "," ;
            }
        }
        System.out.println("INSERT INTO " + tableName + " VALUES (" + sql + ");" );
        return statement.executeUpdate("INSERT INTO " + tableName + " VALUES (" + sql + ");" ) ;
    }
    public int updateValue(String tableName , List list ) throws SQLException{
        Statement statement = con.createStatement();
        String sql = "UPDATE " + tableName   + " SET " + list.get(1) +  " = '" + list.get(2)
                   + "' WHERE userID = " + list.get(0);
        return statement.executeUpdate(sql) ;
    }
    public int updateValueCourseTable(String tableName , List list ) throws SQLException{
        Statement statement = con.createStatement();
        String sql = "UPDATE " + tableName   + " SET " + list.get(1) +  " = '" + list.get(2)
                   + "' WHERE courseID = " + list.get(0);
        return statement.executeUpdate(sql) ;
    }
    public int updateGrade( List list ) throws SQLException{
        Statement statement = con.createStatement();
        String sql = "UPDATE student_course SET studentGrade = '" + list.get(1)
                   + "' WHERE student_courseID = '" + list.get(0) + "'";
        return statement.executeUpdate(sql) ;
    }
    public int updateSurvyID( List list ) throws SQLException{
        Statement statement = con.createStatement();
        String sql = "UPDATE student_course SET survyID = '" + list.get(0)
                   + "' WHERE student_courseID = '" + list.get(1) + "'";
        return statement.executeUpdate(sql) ;
    }
    public int updateAccepted( List list ) throws SQLException{
        Statement statement = con.createStatement();
        String sql = "UPDATE student_course SET accepted = '" + list.get(0)
                   + "' WHERE student_courseID = '" + list.get(1) + "'";
        return statement.executeUpdate(sql) ;
    }
    public void deleteValue(String tableName , List list ) throws SQLException{
        Statement statement = con.createStatement();
        String sql = "DELETE FROM " + tableName + " WHERE " + list.get(0) + " = " + list.get(1) + " ;" ;
        System.out.println(sql);
        statement.executeUpdate(sql) ;
    }
    public void deleteCourse( String tableName , int courseID) throws SQLException{
        Statement statement = con.createStatement();
        String sql = "DELETE FROM "+ tableName +" WHERE courseID  = '" + courseID + "' ;" ;
        statement.executeUpdate(sql) ;
    }
    public int maxValue() throws SQLException{
        int userID = 0 ;
        Statement statement = con.createStatement();
        String sql = "select MAX(userID) FROM user ;" ;
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()) {
            userID = resultSet.getInt(1);
        }
        statement.execute(sql);
        return userID ;
    }
    public int maxValueCourseID() throws SQLException{
        int courseID = 0 ;
        Statement statement = con.createStatement();
        String sql = "select MAX(courseID) FROM courses ;" ;
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()) {
            courseID = resultSet.getInt(1);
        }
        statement.execute(sql);
        return courseID ;
    }
    public int maxValueSurvyID() throws SQLException{
        int survyID = 0 ;
        Statement statement = con.createStatement();
        String sql = "select MAX(survyID) FROM survy ;" ;
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()) {
            survyID = resultSet.getInt(1);
        }
        statement.execute(sql);
        return survyID ;
    }
    
}


