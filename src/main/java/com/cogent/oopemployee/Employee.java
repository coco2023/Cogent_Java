package com.cogent.oopemployee;

public class Employee {
	
	int empId;
	String empName;
	String empDept;
	float empSalary;
	
	// *** Every Entity or Model class Must have following ***
	// Attributes or Variables
	// getter
	// setter
	// constructors
		// default
		// Parametersized
	// toString	
		
	void addEmployee(int empId, String empName, String empDept, float empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSalary = empSalary;

		System.out.println("Finish add Employee!");
	}
	
	public int getEmpId() {
		return empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empSalary=" + empSalary
				+ "]";
	}

//	public Employee(int empId, String empName, String empDept, float empSalary) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//		this.empDept = empDept;
//		this.empSalary = empSalary;
//	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	void deleteEmployee(int empId) {
		System.out.println("Finish delete Employee!");

	}
	
	void updateEmployee(int empId, float empSalary) {
		this.empSalary = empSalary;
		System.out.println("Finish update Employee!");

	}
	
	void displayEmployee(int empId) {
		System.out.println("Finish display Employee!");
		
		System.out.println("empId: " + this.empId);
		System.out.println("empName: " + this.empName);
		System.out.println("empDept: " + this.empDept);
		System.out.println("empSalary: " + this.empSalary);

	}
	
}


//void Employee (int empId, String empName, String empDept, float empSalary) {
//this.empId = empId;
//this.empName = empName;
//this.empDept = empDept;
//this.empSalary = empSalary;
//
//}

