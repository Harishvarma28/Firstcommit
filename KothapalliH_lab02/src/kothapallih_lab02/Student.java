/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kothapallih_lab02;

/**
 *
 * @author S555406
 */
public class Student {
    private int studentId;
    private String studentName;
    private String major;
    private double gpa;
       

public Student()
{
studentId=1;
studentName= "Unknown";
major="Unknown";
gpa=0.0;

}
public Student(int sId, String sname, String majorIn, double gpaIn ){
    
studentId=sId;
studentName= sname;
major=majorIn;
gpa=gpaIn;
}

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double calcPercentage(){
    return (gpa/4)*100;
    }



}