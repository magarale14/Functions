
public class EmployeeOld {
	
	private String name;
	private int employeeId;
	private double salary;
	private String payRate;
	private String joinDate;
	private String typeOfEmployee;
	private int hours;
	
	Employee(String name,double salary,String payRate, String joinDate,String typeOfEmployee){
	 this.name = name;
	 this.salary = salary;
	 this.payRate = payRate;
	 this.joinDate = joinDate;
	 this.typeOfEmployee  = typeOfEmployee;
	 
	}
	Employee( String name,int employeeId,double salary,String payRate, String joinDate,String typeOfEmployee,int hours){
		this.name = name;
		this.employeeId = employeeId;
		 this.salary = salary;
		 this.payRate = payRate;
		 this.joinDate = joinDate;
		 this.typeOfEmployee  = typeOfEmployee;
		 this.hours = hours;
		
	}
	 
	public String toString(){
		return ("name: " + this.name + "\n" + "employeeID: " +this.employeeId + "\n" + "salary: " + this.salary + "\n" + "payRate: " + this.payRate + "\n" + "joinDate: " + this.joinDate + "\n" + "typeOfEmployee:" + this.typeOfEmployee + "\n" + "hours: "+ this.hours + "\n");
	}


	public static void main(String args[]){
		Employee reeta = new Employee("reeta",5,25,"HOURLY","9-01-2017","FULL TIME",40);
		System.out.println(reeta);
		
		}
	}
	
	 
	 