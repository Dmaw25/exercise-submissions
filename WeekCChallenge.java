public class WeekCChallenge {

	public static void main(String[] args){
		
		//1. create a new instance of the Calculator class
		
			Calculator myCalc = new Calculator();

		//2. call each of Calculator's instance methods: add, subtract, multiply, and divide
		// with arguments of your choice, assigning the result to the variables below

		double additionResult= myCalc.add(4,5);
		double subtractionResult= myCalc.subtract(4,6);
		double multiplicationResult= myCalc.multiply(4,5);
		double divisionResult= myCalc.divide(4,5);

		//3. print the value of each of these variables to the console with a descriptive message

			System.out.println("Add result"+additionResult);
    
    			System.out.println("Sub Result:"+subtractionResult);
    
			System.out.println("Multi Result:"+multiplicationResult);
    
			System.out.println("Div Resultt:"+divisionResult);

		//4. implement the static fizzBuzz method in this class and call it from the main method
	}
	

	public static void fizzBuzz(int m, int n, int[] numbers, String[] terms){

	}
}
