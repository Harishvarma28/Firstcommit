/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kothapallih_lab02;

/**
 *
 * @author S555406
 */
public class Faculty {
    private int facultyId;
    private String facultyName;
    private String department;
    private double salaryPerMonth;
    
    public Faculty(){
    facultyId = 1;
    facultyName = "Unknown";
    department = "Unknown";
    salaryPerMonth = 0.0;
    
}
    public Faculty(int fid,String fname,String dep,double spm){
        facultyId = fid;
    facultyName = fname;
    department = dep;
    salaryPerMonth = spm;
        
    }

    public int getFacultyId() {
        return facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }
    public double annualsalary(){
    double as=salaryPerMonth*12;
    return as;
    }
}
