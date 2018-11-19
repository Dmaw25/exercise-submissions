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
		
		additionResult = calc.add(6,9);
		subtractionResult = calc.subtract(10, 18);
		multiplicationResult = calc.multiply(4, 10);
		divisionResult = calc.divide(20, 4);

		//3. print the value of each of these variables to the console with a descriptive message
		System.out.println("The result for addition is: " + additionResult);
		System.out.println("The result for subtraction is: " + subtractionResult);
		System.out.println("The result for multiplication is: " + multiplicationResult);
		System.out.println("The result for division is: " + divisionResult);

		//4. implement the static fizzBuzz method in this class and call it from the main method
		int[] nums = {2,5};
		String[] words = {"Hello","World"};
		fizzBuzz(1,10,nums,words);
	}
	

	public static void fizzBuzz(int m, int n, int[] numbers, String[] terms){
		String word;
		if (m<=n && numbers.length == terms.length)
		{
			for (m=m; m<=n; m++)
			{
				word = "";
				for (int k=0; k<numbers.length; k++)
				{
					if (m%numbers[k] == 0)
					{
						word += terms[k];
					}
				}
				if (word == "")
				{
					System.out.println(m);
				}
				else 
				{
					System.out.println(word);
				}
			}
		}
	}
}