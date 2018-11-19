public class WeekCChallenge {

	public static void main(String[] args) {
		
		//1. create a new instance of the Calculator class
		Calculator myCalculator = new Calculator();

		//2. call each of Calculator's instance methods: add, subtract, multiply, and divide
		// with arguments of your choice, assigning the result to the variables below
		
		// Test arguments
		double addArg0 = 10.0;
		double addArg1 = -5.6;
		double subtractArg0 = 190.0;
		double subtractArg1 = 54.0;
		double multiplyArg0 = 35.5;
		double multiplyArg1 = 2.5;
		double divideArg0 = 31.0;
		double divideArg1 = -6.0;
		
		double additionResult = myCalculator.add(addArg0, addArg1);
		double subtractionResult = myCalculator.subtract(subtractArg0, subtractArg1);
		double multiplicationResult = myCalculator.multiply(multiplyArg0, multiplyArg1);
		double divisionResult = myCalculator.divide(divideArg0, divideArg1);

		//3. print the value of each of these variables to the console with a descriptive message
		
		// Initial statement
		System.out.println("\n==========Calculator Test==========\n");
		
		// Test start
		System.out.println("the result of adding " + addArg0 + " and " + addArg1 + " is " + additionResult);
		System.out.println("the result of subtracting " + subtractArg1 + " from " + subtractArg0 + " is " + subtractionResult);
		System.out.println("the result of multiplying " + multiplyArg0 + " and " + multiplyArg1 + " is " + multiplicationResult);
		System.out.println("the result of dividing " + divideArg0 + " by " + divideArg1 + " is " + divisionResult);
		
		// Test end

		//4. implement the static fizzBuzz method in this class and call it from the main method
		
		// Test arguments
		int fzStart = -50;
		int fzEnd = 150;
		int[] fzNums = new int[]{3, 5, 6, 7, 10, 12};
		String[] fzTerms = new String[]{"d3", "d5", "d6", "d7", "d10", "d12"};
		
		// Test start
		WeekCChallenge.fizzBuzz(fzStart, fzEnd, fzNums, fzTerms);
		
		// Test end
		
	}

	public static void fizzBuzz(int m, int n, int[] numbers, String[] terms) {
		
		// Initial statement
		System.out.println("\n==========Fizzbuzz Test==========");
		System.out.println("\nshowing Fizzbuzz result(s) from number " + m + " to " + n + " with the following inputs:");
		System.out.print("numbers: ");
		for (int i = 0; i < numbers.length; ++i) {
			System.out.print(numbers[i] + " ");
		}
		System.out.print("\nterms: ");
		for (int i = 0; i < terms.length; ++i) {
			System.out.print(terms[i] + " ");
		}
		System.out.println("\n");
		
		// Verify range
		if (m > n) {
			System.out.println("nothing to print (abort)");
			return;
		}
		
		// Verify array lengths
		if (numbers.length != terms.length) {
			System.out.println("array lengths do not match (abort)");
			return;
		}
		
		// Check for zeros in the numbers array
		for (int i = 0; i < numbers.length; ++i) {
			if (numbers[i] == 0) {
				System.out.println("zero division error (abort)");
				return;
			}
		}
		
		// Outer Loop
		for (int i = m; i <= n; ++i) {
			
			// Result variables
			int numResult = i;
			String strResult = "";
			
			// Inner loop
			for (int j = 0; j < numbers.length; ++j) {
				if (i % numbers[j] == 0) {
					strResult += terms[j];
				}
			}
			
			// Just output 0 for zero instead of all terms
			if (i == 0) {
				strResult = "";
			}
			
			// Output result
			if (strResult != "") {
				// Also show the original number after the terms
				System.out.println(strResult + " (" + numResult + ")");
			}
			else {
				System.out.println(numResult);
			}
		}
		
	}
	
}
