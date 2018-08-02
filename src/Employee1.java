

import java.util.Scanner;


public class Employee1 {
	/*declaring all the attribute*/
	
	private String name;
	private int employeeId;
	private double salary;
	private String payRate;
	private String joindate;
	private String typeOfEmployee;
    private int hours;
    private String ssn;
	
    /*void setSalary(double newSalary){
    	Scanner sc = new Scanner (System.in);
    	System.out.println("Enter your HR Code to set the salary");
    	int hrCode = sc.nextInt();
    	if(hrCode == 3391){*/
    
/* Constructors*/
	
	Employee1 (String name,double salary,String payRate,String joindate,String typeOfEmployee){
		this.name = name;
		this.salary = salary;
		this.payRate = payRate;
		this.joindate = joindate;
		this.typeOfEmployee = typeOfEmployee;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPayRate() {
		return payRate;
	}

	public void setPayRate(String payRate) {
		this.payRate = payRate;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	public String getTypeOfEmployee() {
		return typeOfEmployee;
	}

	public void setTypeOfEmployee(String typeOfEmployee) {
		this.typeOfEmployee = typeOfEmployee;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	Employee1 (String name,int employeeId,double salary,String payRate,String joindate,String typeOfEmployee, int hours){
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
		this.payRate = payRate;
		this.joindate = joindate;
		this.typeOfEmployee = typeOfEmployee;
		this.hours = hours;
	
	
	}
/* TODO: toString*/
	
	//Methods: compare the salary of the current object with that of the object sent to it.
	
	void compareSalary(Employee1 another){
		if(this.salary > another.salary){
			System.out.println(this.name + " has higher salary than " + another.name);
			
		}
	}
	
	
	public String toString(){
		return ("name: " + this.name + "\n" + "employeeID: " +this.employeeId + "\n" + "salary: " + this.salary + "\n" + "payRate: " + this.payRate + "\n" + "joindate: " + this.joindate + "\n" + "typeOfEmployee:" + this.typeOfEmployee + "\n" + "hours: "+ this.hours + "\n");
	}

		
	}


