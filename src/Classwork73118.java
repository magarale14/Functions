
import java.util.Scanner;

public class Classwork73118 {
	
	//This is where the JVM enters
	public static void main(String args[]) {
		
		System.out.println("Learning functions!");
		/*Delegating a task to a function called sayHello to say hello to the user. 
		 * That function then delegates the task to getAge() to get the user's age, getAge() returns user's age to sayHello()
		 * I would like sayHello() to return the user's name
		 * back so that I can store the user's name for future.
		 */
		
		//Want to capture it and store it in a variable called name
		String name = sayHello();
		System.out.println(name);
		
		System.out.println(getAge() + 10);
		
		
	}
	
	//To take user's name as input, print hello user's Name, return the name to main function
	static String sayHello() {
		/* First task : create scanner object and take user's name as input*/
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		/* First task : done*/
		
		/*Second task : print hello user's name*/
		System.out.println("Hello " + name);
		/*Second task : done*/
		
		/*Third task: delegate getting age to getAge() function
		 * 
		 */
		System.out.println("Your age is " + getAge());
		
		/*Fourth task: return name to main function*/
		return name;
	}
	
	static int getAge() {
		/*get user's age and return it*/
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		return age;
	}
	

}
