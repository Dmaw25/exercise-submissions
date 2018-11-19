public class WeekCChallenge {
		public static void main(String[] args){

			//1. create a new instance of the Calculator class
			Calculator WeekCChallengeCalculator = new Calculator();

			//2. call each of Calculator's instance methods: add, subtract, multiply, and divide
			// with arguments of your choice, assigning the result to the variables below
			double additionResult;
			double subtractionResult;
			double multiplicationResult;
			double divisionResult;
			additionResult = this.add(20.8,10.5);
			subtractionResult = this.subtract(20.8, 10.5);
			multiplicationResult = this.multiply(20.8, 10.5);
			divisionResult = this.divide(20.8, 10.5);

			//3. print the value of each of these variables to the console with a descriptive message
			System.out.println("The result of 20.8 + 10.5 = " + additionResult);
			System.out.println("The result of 20.8 - 10.5 = " + subtractionResult);
			System.out.println("The result of 20.8 * 10.5 = " + multiplicationResult);
			System.out.println("The result of 20.8 / 10.5 = " + divisionResult);
		}
	}

			//4. implement the static fizzBuzz method in this class and call it from the main method
			
