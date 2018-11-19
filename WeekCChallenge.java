public class WeekCChallenge {

	public static void main(String[] args){
		
		//1. create a new instance of the Calculator class

		Calculator c = new Calculator();

		

		//2. call each of Calculator's instance methods: add, subtract, multiply, and divide
		// with arguments of your choice, assigning the result to the variables below

		double additionResult;
		double subtractionResult;
		double multiplicationResult;
		double divisionResult;

		additionResult = c.add(5, 7);
		subtractionResult = c.subtract(92, 57);
		multiplicationResult = c.multiply(3, 72);
		divisionResult = c.divide(81, 3);


		//3. print the value of each of these variables to the console with a descriptive message

		System.out.println("Five plus seven is: " + additionResult);
		System.out.println("Ninety-two minus fifty-seven is: " + subtractionResult);
		System.out.println("Three times seventy-two is: " + multiplicationResult);
		System.out.println("Eighty-one divided by three is: " + divisionResult);


		//4. implement the static fizzBuzz method in this class and call it from the main method

		fizzBuzz(3, 5, [3, 5, 15], ["fizz", "buzz", "fizzbuzz"]);
	}


	public static void fizzBuzz(int m, int n, int[] numbers, String[] terms){
		m = 0;
		n = 25;
		numbers[0] = 3;
		numbers[1] = 5;
		numbers[2] = numbers[0] * numbers[1];
		terms[0] = "fizz";
		terms[1] = "buzz";
		terms[2] = terms[0] + terms[1];
		for (m=0; m<n; m++){
			for (int i = 2; i >=0; i--){
				if (m == numbers[i]){
					System.out.println(terms[i]);
				} else {
					System.out.println(m);
				}
			}
		}
	}
}
