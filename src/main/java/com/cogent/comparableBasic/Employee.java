package com.cogent.comparableBasic;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	String dept;
	float salary;
	
	@Override
	public int compareTo(Employee e) {
		return Float.compare(this.salary, e.salary);
	}
	
	public Employee(int id, String name, String dept, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
	
	
}