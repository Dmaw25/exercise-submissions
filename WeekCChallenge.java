public class WeekCChallenge {

	public static void main(String[] args){

		//1. create a new instance of the Calculator class
		Calculator calculate = new Calculator();

		//2. call each of Calculator's instance methods: add, subtract, multiply, and divide
		// with arguments of your choice, assigning the result to the variables below

		double additionResult;
		double subtractionResult;
		double multiplicationResult;
		double divisionResult;

		//3. print the value of each of these variables to the console with a descriptive message

		calculate.add(1,5);
		calculate.subtract(9,6);
		calculate.multiply(3,4);
		calculate.divide(8,2);

		//4. implement the static fizzBuzz method in this class and call it from the main method

	}


	public static void fizzBuzz(int m, int n, int[] numbers, String[] terms){

		for (int i = 0; m >= n; i++) {
			if (numbers[0] % 3 == 0) {
				i.toString = terms[0];
			}
			System.out.println(i);
		}
	}
}
