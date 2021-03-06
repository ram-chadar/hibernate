package com;



/**
 * Employee generated by MyEclipse - Hibernate Tools
 */

public class Employee  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private String salary;


    // Constructors

    /** default constructor */
    public Employee() {
    }

	/** minimal constructor */
    public Employee(Integer id) {
        this.id = id;
    }
    
    /** full constructor */
    public Employee(Integer id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return this.salary;
    }
    
    public void setSalary(String salary) {
        this.salary = salary;
    }
   








}