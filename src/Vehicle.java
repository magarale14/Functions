/*Create a vehicle class - you can google for it's attributes and behaviors
2. Create at least 2 instance methods
3. Create main function inside the same class
4. Create 5 vehicle objects 
5. Create at least 4 constructors including a default constructor that doesn't do anything(meaning, the default constructor sets everything to JVM's default values)
*/


public class Vehicle {

	private int year;
	private String make;
	private String model;
	private int speed;
	private String color;
	
	Vehicle(){
	}
	Vehicle (int year, String make, String model,int speed,String color){
		this.year = year;
		this.make = make;
		this.model = model;
		this.speed = speed;
		this.color = color;
	}
	
	Vehicle(int year,String make,String model,int speed ){
		this.year = year;
		this.make = make;
		this.model = model; 
		this.speed = speed;
		
	}
	
	Vehicle (int year, String make,String model){
		this.year = year;
		this.make = make;
		this.model = model;
			}
	
	Vehicle (int year,String make){
		this.year = year;
		this.make = make;
	
	}
	
		public void compareyear (Vehicle vehicleyear){
		if (this.year > vehicleyear.year){
			System.out.println(this.make + " is older than " + vehicleyear.make);
					
		}
		
		
			}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	public static void main(String args[]){
		Vehicle five = new Vehicle();
		Vehicle one = new Vehicle(2010,"Nissan","Sentra",123,"red");
		Vehicle two = new Vehicle(2011,"Toyota","Sentra",122);
		Vehicle three = new Vehicle (2012,"Honda", "Sentra");
		Vehicle four = new Vehicle (2013,"Subaru", "Sentra");
		
		four.compareyear(two);
		
		
	
	}
}

	
	
		