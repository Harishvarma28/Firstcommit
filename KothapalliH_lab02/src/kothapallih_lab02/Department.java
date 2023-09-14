/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kothapallih_lab02;

/**
 *
 * @author S555406
 */
public class Department {
    private int departmentId;
    private String departmentName;
    private String hod;
    

public Department(){
departmentId=1;
departmentName="Unknown";
hod="Unknown";


}
public Department(int dId,String dName,String hd){
 departmentId=dId;
 departmentName=dName;
 hod=hd;
}

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getHod() {
        return hod;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setHod(String hod) {
        this.hod = hod;
    }

 public String displayHod(){
    return "The Head of Department of "+departmentName+" is "+hod;
}
}