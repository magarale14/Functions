
public class PostIt{
	

private String color;
private String message;
private int  someNumber;

	PostIt (){
		
	}

	PostIt (String color, int s) { // this is constructor//
	this.color = color;
	this.someNumber = s;
}

	void StickIT(){
		System.out.println("I am sticking" + color);
		
	}


	public static void main(String args[]){
		
		PostIt p1 = new PostIt();
		
			p1.color = "Yellow";
			System.out.println(p1.color);
			p1.someNumber = 10;
			
		/*	
		PostIt p2 = new PostIt("Yellow", 10);
			System.out.println(p2.color);
			System.out.println(p2.someNumber);
			*/
		;
	}
	

}

		
	
	
