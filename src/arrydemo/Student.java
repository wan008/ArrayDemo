/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrydemo;

/**
 *
 * @author bada5
 */
public class Student {
    private String sName;
    private String sId;

    public void setAddress(String address) {
        this.address = address;
    }
    private String address;

    public Student(String sName, String sId, String address) {
        this.sName = sName;
        this.sId = sId;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    
    public Student(String sName, String sId) {
        this.sName = sName;
        this.sId = sId;
    }
    
    

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }
    
    
    
}
