
public class Payroll {
	
	public static double calculatePay(Employee1 employee){
		
		/*Pay cycle is bi-weekly. This function will be calculating an employee's paycheck for that cycle base on salary and payRate
		*/
		//if the employee has an yearly salary 
		double salary;
		
		//if employee has an yearly salary//
		if(employee.payRate == "Yearly" ){
			salary = (employee.salary/52)*2;
		
		}
		else if (employee.payRate == "HOURLY" ){
			salary = (employee.salary * employee.hours *2);
			
		}
		else {
			salary = 0;
		}
		
		return salary;
	}
			
	public static void main(String[]args){
		
		//Employee1 (String name,int employeeId,double salary,String payRate,String joinDate,String typeOfEmployee, int hours//
		Employee1 tom = new Employee1("Tom Haverford", 100,44.9,"HOURLY","09-01-2016", "PART-TIME",28);
		
		//Employee1 (String name,int employeeId,double salary,String payRate,String joinDate,String typeOfEmployee, int hour){
		Employee1 ron = new Employee1("Ron Don",101,33000, "HOURLY", "09-02-2016", "FULL TIME",40);
		 
		System.out.println((calculatePay(tom)));
		System.out.println((calculatePay(ron)));
		
		
		//calculatePay(tom);//
		
		
	}
}
	
