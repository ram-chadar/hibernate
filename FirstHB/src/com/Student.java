package com;
public class Student  implements java.io.Serializable {

     private Integer sid;
     private String sname;
     private String sage;

    public Student() {
    }

    public Student(Integer sid, String sname, String sage) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
    }

    public Integer getSid() {
        return this.sid;
    }
    
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return this.sname;
    }
    
    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSage() {
        return this.sage;
    }
    
    public void setSage(String sage) {
        this.sage = sage;
    }

}