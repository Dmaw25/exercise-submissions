public class WeekCChallenge {

	public static void main(String[] args){
		
		//1. create a new instance of the Calculator class
		Calculator calc = new Calculator();

		//2. call each of Calculator's instance methods: add, subtract, multiply, and divide
		// with arguments of your choice, assigning the result to the variables below
		
		double additionResult;
		double subtractionResult;
		double multiplicationResult;
		double divisionResult;

		//3. print the value of each of these variables to the console with a descriptive message
		additionResult = calc.add(8.5, 4.7);
		subtractionResult = calc.add(7.5, 2.5);
		multiplicationResult = calc.add(4.2, 6.2);
		divisionResult = calc.add(9.9, 3.3);
		System.out.println(additionResult);
		System.out.println(subtractionResult);
		System.out.println(multiplicationResult);
		System.out.println(divisionResult);

		//4. implement the static fizzBuzz method in this class and call it from the main method
		int[] divide={4,10};
		string[] terms= {"fizz","buzz"}
		fizzBuzz(1,100, divide, terms);		
	}
	

	public static void fizzBuzz(int m, int n, int[] numbers, String[] terms){
			if (m > n){
				 System.out.println("that cannot work. sorry");
			} 
			if (numbers.length != terms.length){
				 System.out.println("please make sure the terms and numbers are the same amount");
			}
			else {
			for (int i=m; i<(n+1); i++) {
				int out = 0;
				string num = "";
				for (int j=0; j<(numbers.length); j++) {
					if (i % j == 0)
						num += terms(j);
						out = 1;
				}
				System.out.println(num);
				}
			}
	}
}
