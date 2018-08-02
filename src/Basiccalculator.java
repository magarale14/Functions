import java.util.Scanner;

public class Basiccalculator {
	public static void main(String args[]){
		Scanner reeta = new Scanner(System.in);
		double fnum,snum,answer;
		System.out.println("Enter first number: ");
		fnum = reeta.nextDouble();
		System.out.println("Enter second number: ");
		snum = reeta.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
		
	}
}
