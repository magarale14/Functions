/* This program is to use parameters with multiple classes.
 * Author: Reeta Ale Magar
 * Date: 8/2/18
  */
import java.util.Scanner;

public class Orange {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		Banana you = new Banana();
		System.out.println("What is your name? ");
		
		String name = input.nextLine();
		
		
		you.yellow(name);
		
	}
}
