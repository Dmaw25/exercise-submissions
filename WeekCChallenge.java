public class WeekCChallenge {

	public static void main(String[] args){
		
		//1. create a new instance of the Calculator class
		Calculator operationObject = new Calculator();

		//2. call each of Calculator's instance methods: add, subtract, multiply, and divide
		// with arguments of your choice, assigning the result to the variables below
		
		double additionResult = operationObject.add(9, 3);
		double subtractionResult = operationObject.subtract(9, 3);
		double multiplicationResult = operationObject.multiply(9, 3);
		double divisionResult = operationObject.divide(9, 3);

		//3. print the value of each of these variables to the console with a descriptive message
		System.out.println("Addition Result:\t:"+additionResult);

		System.out.println("SubStraction Result\t:"+subtractionResult);

		System.out.println("Multiplication Result\t:"+multiplicationResult);

		System.out.println("Division Result\t\t:"+divisionResult);

		//4. implement the static fizzBuzz method in this class and call it from the main method
	}
	

	public static void fizzBuzz(int m, int n, int[] numbers, String[] terms){

	}
}
