public class Driver {
	public static void main(String[] args) {
		System.out.println("this is the point of entry into my program");
		//make a car object with no set fields
		//declare the variable carOne and assign a new Car to it
		Car carOne = new Car();
		//toString is a method inherited from object
		System.out.println("carOne: "+carOne.toString());

		//make a car object with instance variables set in the constructor
		//declare the variable CarTwo and assign a new Car to it
		Car carTwo = new Car(1972, "DeLorean", "DMC");
		//check out the toString result
		System.out.println("carTwo: "+carTwo.toString());

		//Reset the model of carTwo
		carTwo.setModel("NotDeLorean");
		System.out.println("Model of carTwo;" +carTwo.getModel());

		//Test out carTwo's inherited move() method


		//Test out Submarines method
		Submarine spaceForce = new Submarine(18,60,"Lambo","diablo");		
		System.out.println(spaceForce.getyearManufactured()+" "+spaceForce.getspeed()+" "+spaceForce.getmake()+" "+spaceForce.getmodel());
		spaceForce.surface();	
}


}
