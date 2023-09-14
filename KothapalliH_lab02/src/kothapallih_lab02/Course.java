/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kothapallih_lab02;

/**
 *
 * @author S555406
 */
public class Course {
    private int courseId, credits;
    private String courseName, department,instructor;
    
public Course(){
courseId=1;
courseName="Unknown";
department="Unknown";
instructor="Unknown";
credits=0;
}
public Course(int cId, String cNmae, String dep, String ins,int cred){
courseId=cId;
courseName=cNmae;
department=dep;
instructor=ins;
credits=cred;
}

    public int getCourseId() {
        return courseId;
    }

    public int getCredits() {
        return credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDepartment() {
        return department;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
public String numOfCredits(){
return "This course is offered by "+department+" and awarded with "+credits+" credits.";

}
  
}
