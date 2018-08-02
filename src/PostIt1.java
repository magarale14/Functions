
public class PostIt1{
	

private String color;
private String message;
private int  someNumber;

PostIt1 (String color, int s) { // this is a constructor//
this.color = color;
this.someNumber = s;
}

	void StickIT(){
		System.out.println("I am sticking" + color);
		
	}

	
	public static void main(String args[]){
		
	PostIt1 p3 = new PostIt1 ("green",99);	// this is going to be matched to a constructor and assign String and int//
	// this refers to the current object//
	System.out.println(p3.message);
	
	}
	
	

}

		
	
	
