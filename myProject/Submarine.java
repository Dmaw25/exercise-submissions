//This class extends from vehicle, 
public class Submarine extends Vehicle {
	public Submarine (){
		System.out.println("Called no argument constructor");
	}
		public Submarine(int yearManufactured, int speed, String make, String model){
			//this refers to the submarine being created
			this.yearManufactured = yearManufactured;
			this.speed = speed;
			this.make = make;
			this.model = model;
	}


		//instance variables are fields
		private int yearManufactured;
		private int speed;
		private String make;
		private String model;


		//getter and asccessors
		public int getyearManufactured(){
			return this.yearManufactured;
	}
		public int getspeed() {
			return this.speed;
	}
		public String getmake() {
			return this.make;
	}
		public String getmodel() {
			return this.model;
	}
		public void setSpeed(int speed){
			this.speed = speed;	
	}
		public void setyearManufactured(int yearManufactured){
			this.yearManufactured = yearManufactured;
	}
		public void setMake( String make) {
			this.make = make;
	}
		public void setModel(String model) {
			this.model = model;
	}
		
		//override move method
		@Override 
		public void move() {
		System.out.println("Car is not moving");
	}
		public void surface() {
		System.out.println("Submarine is surfacing");
	}
		
}
