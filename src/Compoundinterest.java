/* This program is to find compound interest.
 * Author: Reeta Ale Magar
 * Date: 8/2/18
 */

class Compoundinterest {
	public static void main(String args[]){
		double rate = 0.01;
		double principle = 10000;
		double amount;
		
		for(int day=1; day <= 30; day++){
			amount=principle*Math.pow(1 + rate, day);
			System.out.println(day + " The compound interet is " + amount);
			
	}
}
}
