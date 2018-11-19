//first POJO!

public class Car extends Vehicle {
	
	//constructor with no fields (a "no-args" constructor)
	public Car(){
		System.out.println("called no arg constructor");
	}	
	// constuctor with all fields
		public Car(int yearManufactured, String model, String make){
			//THIS REFERS TO THE CAR OBJECT BEING CREATED, NOT THE ARGUMENT
			this.yearManufactured = yearManufactured;
			this.model = model; 
			this.make = make;
	}	

	//private instance variables. accessible only within the class
	private int yearManufactured;
	private String model;
	private String make;

	//getters and setter (accessors and mutators)
	public int getYearManufactured(){
		return this.yearManufactured;
	}
	public String getModel(){
	return this.model;
	}
	public String getMake(){
	return this.make;
	}
	public void setYearManufactured(int year){
		this.yearManufactured = year;
	}
	
	public void setModel(String model){
		this.model = model;
	}
	public void setMake(String make){
		this.make = make;
	}
	//override inherited move() method 
	@Override		//doesnt do anything, but will fail to compilte if no mathcing superclass method
	public void move(){
		System.out.println("Car is moving");
	}
}
