public class WeekCChallenge {

	public static void main(String[] args){
		//1. create a new instance of the Calculator class
		Calculator calc = new Calculator();

		//2. call each of Calculator's instance methods: add, subtract, multiply, and divide
		// with arguments of your choice, assigning the result to the variables below
		double m = 2.0;
		double n = 32.0;
		double additionResult;
		additionResult = calc.add(m,n);
		double subtractionResult;
		subtractionResult = calc.subtract(m,n);
		double multiplicationResult;
		multiplicationResult = calc.multiply(m,n);
		double divisionResult;
		divisionResult = calc.divide(m,n);

		//3. print the value of each of these variables to the console with a descriptive message
		System.out.println(additionResult);
		System.out.println(subtractionResult);
		System.out.println(multiplicationResult);
		System.out.println(divisionResult);
		double[] nums = new double[]{3,5,8};
		String[] words = new String[]{"third","fifth","eigth"};
		//4. implement the static fizzBuzz method in this class and call it from the main method
		fizzBuzz(m,n,nums,words);
}
	public static void fizzBuzz(double m, double n, double[] numbers, String[] terms){
	if (m <= n) {
            if (numbers.length == terms.length) {
                for (int i = 0; i < numbers.length; i++) {
                    for (m = m; m < n + 1; m++) {
                        if (m % numbers[i] == 0) {
                            System.out.println(terms[i]);
                        continue;
			}
                        else {
                            System.out.println(m);
                        }
                    }
                }
            }
            else {
                System.out.println("Numbers array length is shorter than terms array length");
            }
        }
        else {
	System.out.println("First number is greater than the second");
	}
}
}
