public class WeekCChallenge {

	public static void main(String[] args){
		
		//1. create a new instance of the Calculator class
        Calculator myCalculator = new Calculator(10.0, 4.0);

		//2. call each of Calculator's instance methods: add, subtract, multiply, and divide
		// with arguments of your choice, assigning the result to the variables below
        
		double additionResult = myCalculator.add(myCalculator.getArg0(), myCalculator.getArg1());;
		double subtractionResult = myCalculator.subtract(myCalculator.getArg0(), myCalculator.getArg1());
		double multiplicationResult = myCalculator.multiply(myCalculator.getArg0(), myCalculator.getArg1());
		double divisionResult = myCalculator.divide(myCalculator.getArg0(), myCalculator.getArg1());

		//3. print the value of each of these variables to the console with a descriptive message
        System.out.println(additionResult);
        System.out.println(subtractionResult);
        System.out.println(multiplicationResult);
        System.out.println(divisionResult);

        //4. implement the static fizzBuzz method in this class and call it from the main method
        int m;
        int n;
        int numbers[] = {3, 5};
        String terms[] = {"fizz", "buzz"};
        fizzBuzz(1, 100, numbers, terms);
	}
	

	public static void fizzBuzz(int m, int n, int[] numbers, String[] terms){

        if (m < n) {
            if (numbers.length == terms.length) {
                String word;
                for(; m < n; m++) {
                    word = "";
                    for (int i = 0; i < numbers.length; i++) {
                        if (m % numbers[i] == 0) {
                            word += terms[i];
                        }
                    }
                    if (word != "") {
                        System.out.println(word);
                    }
                    else {
                        System.out.println(m);
                    }
                }
            }
            else{
                System.out.println("The array's index amounts do not match");
            }
        }
        else {
            System.out.println("The first value is not less than the second");
        }
	}
}