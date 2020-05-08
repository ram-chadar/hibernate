package com.ram;

public class Regular_Employee  extends Employee{

	private float salary;  
	private int bonus;
	
	public Regular_Employee() {
		// TODO Auto-generated constructor stub
	}

	public Regular_Employee(float salary, int bonus) {
		super();
		this.salary = salary;
		this.bonus = bonus;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Regular_Employee [salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	
	
}
