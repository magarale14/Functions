import java.util.Scanner;

public class Hr {
	public static void main(String args[]){
		
		//both of them have all other attributes 
		//joey-
		//rachel
		
		Employee1 someEmployee = new Employee1("Joey", 100,44.9,"HOURLY","09-01-2016", "PART-TIME",28);
		//this is where getters and setters would come in picture
		System.out.println(someEmployee.getSsn());
		if(someEmployee.getSsn() == null){
			Scanner sc = new Scanner(System.in);
			System.out.println("What is " + someEmployee.getName() + "'s SSN");
			someEmployee.setSsn(sc.nextLine());
		}
		System.out.println(someEmployee.getSsn());
	}
}
