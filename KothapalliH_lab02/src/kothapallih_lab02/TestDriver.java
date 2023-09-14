/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kothapallih_lab02;

/**
 *
 * @author S555406
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Student s1= new Student();
        //Question 1: Student Class
        Student s2= new Student(662663,"Lily","IS",3.4);
        //System.out.println("default student details "+s1.getStudentName());
        System.out.println("Question 1:Student Class Output");
        System.out.println("                                                  ");
        System.out.println("Student ID: "+s2.getStudentId());
        System.out.println("Student Name: "+s2.getStudentName());
        System.out.println("Major in "+s2.getMajor());
        System.out.println("GPA Secured: "+s2.getGpa());
        System.out.println("The percentage secured by the student is: "+s2.calcPercentage());
        
        //Question 2: Faculty Class
        System.out.println("                                                  ");
        System.out.println("Question 2:Faculty Class Output");
        System.out.println("                                                  ");
        Faculty f1= new Faculty(17098,"Antony Thomson","IS",8000.0);
        System.out.println("Faculty ID: "+f1.getFacultyId());
        System.out.println("Faculty Name: "+f1.getFacultyName());
        System.out.println("Department: "+f1.getDepartment());
        System.out.println("Salary per month in dollors: $"+f1.getSalaryPerMonth());
        System.out.println("The annual salary of Antony Thomson is $"+f1.annualsalary());
        
        //Question 3: Department Class
        System.out.println("                                                  ");
        System.out.println("Question 3:Department Class Output");
        System.out.println("                                                  ");
        Department d1=new Department(9947,"Chemistry","Prof. Benjamin");
        System.out.println("Department Id: "+d1.getDepartmentId());
        System.out.println("Department Name: "+d1.getDepartmentName());
        System.out.println("HOD of the department: "+d1.getHod());
        System.out.println(d1.displayHod());
        
        //Question 4: Course Class
        System.out.println("                                                  ");
        System.out.println("Question 4:Course Class Output");
        System.out.println("                                                  ");
        Course c1 = new Course(44641,"Object Oriented Systems","Information Systems","james Gosling",3);
        System.out.println("Course Id: "+c1.getCourseId());
        System.out.println("Course Name: "+c1.getCourseName());
        System.out.println("Department offering the Course: "+c1.getDepartment());
        System.out.println("Credits: "+c1.getCredits());
        System.out.println("Instructor: "+c1.getInstructor());
        System.out.println(c1.numOfCredits());
    }
    
}
