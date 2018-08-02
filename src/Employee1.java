import java.util.Scanner;


public class Employee1 {
	/*declaring all the attribute*/
	
	private String name;
	private int employeeId;
	public double salary;
	public String payRate;
	private String joindate;
	private String typeOfEmployee;
    public int hours;
	
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
	
	public String toString(){
		return ("name: " + this.name + "\n" + "employeeID: " +this.employeeId + "\n" + "salary: " + this.salary + "\n" + "payRate: " + this.payRate + "\n" + "joindate: " + this.joindate + "\n" + "typeOfEmployee:" + this.typeOfEmployee + "\n" + "hours: "+ this.hours + "\n");
	}

		Payroll.calculatePay(employee);
		
	
		
		
	}


