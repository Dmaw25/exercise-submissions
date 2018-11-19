public class WeekCChallenge {

	public static void main(String[] args){
		
		//1. create a new instance of the Calculator class
			Calculator myCalc =  new Calculator();


		//2. call each of Calculator's instance methods: add, subtract, multiply, and divide
		// with arguments of your choice, assigning the result to the variables below
			
		double additionResult;
		double subtractionResult;
		double multiplicationResult;
		double divisionResult;
		additionResult  = myCalc.add(2,2);
		subtractionResult = myCalc.subtract(3,2);
		multiplicationResult = myCalc.multiply(3,3);
		divisionResult = myCalc.divide(16,4);
		System.out.println(" 2 + 2= " + additionResult);
		System.out.println("3-2 = "+ subtractionResult);
		System.out.println("3*3 = " + multiplicationResult);
		System.out.println("16/4 = " + divisionResult);
		System.out.println("That was everything!!!");
		int [] numArr = {3,5};
		String [] termArr = {"triangle", "dolphin"};
		fizzBuzz(3,78, numArr, termArr);
		//3. print the value of each of these variables to the console with a descriptive message
		

		//4. implement the static fizzBuzz method in this class and call it from the main method
	}
	

	public static void fizzBuzz(int m, int n, int[] numbers, String[] terms){
		if(m>n){
				System.out.println("error");
		}
		else if (numbers.length != terms.length){
				System.out.println("error");
		}else{
			for (int i = m; i<n;i++){
				for (int j = 0; j<numbers.length; j++){
					if (i % numbers[j] ==0){
						System.out.println(terms[j]);
					}else {System.out.println(i);}
				}
			}
			
		}

	}
}
