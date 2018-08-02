
public class Ice {
	
	 private String shape;
	 private String color;
	 private String flavor;
	 private String filltype;
	 


 Ice(){
	/*this.shape = "cube";
	  this.color = "white";
	  this.filltype = "water";*/
 }
 	Ice (String shape,String color, String flavor,String filltype){
 		this.shape = shape;
 		this.color = color;
 		this.flavor = flavor;
 		this.filltype = filltype;
 		
 	}
	Ice (String shape){
		this.shape = shape;
	}
	
	Ice  (String color,String flavor,String filltype){
		this.color = color;
		this.flavor = flavor;
		this.filltype = filltype;
		
	}
 
	public String toString (){
		return ("color: " + this.color + "\n" + "shape: " + this.shape + "\n" + "flavor: " + this.flavor + "\n" +"filltype: " + this.filltype + "\n" );
	}
	
	public static void main(String[] args){
		Ice first= new Ice();
		Ice second = new Ice("Star", "Red","Sweet");
		Ice third = new Ice ("Diamond");
		Ice fourth = new Ice ("black","cola","cola");
		Ice fifth = new Ice ("black","cola","cola");
		/*System.out.println(first.toString ());
		 */
		System.out.println(fourth);		
	}
}

