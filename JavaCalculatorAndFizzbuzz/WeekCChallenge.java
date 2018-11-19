import java.util.*;
public class WeekCChallenge {
	public static void main(String[] args){
		
		//1. create a new instance of the Calculator class


		//2. call each of Calculator's instance methods: add, subtract, multiply, and divide
		// with arguments of your choice, assigning the result to the variables below
		

		double additionResult;
		double subtractionResult;
		double multiplicationResult;
		double divisionResult;
		
		Calculator calculation = new Calculator();

		additionResult=calculation.add(10,5);
		System.out.println("The Result of adding 10 to 5 is: "+ additionResult);
		subtractionResult=calculation.subtract(200,56.8);
		System.out.println("The Result of subtracting 56.8 from 200 is: "+ subtractionResult);
		multiplicationResult=calculation.multiply(15,3.4);
		System.out.println("The Result of multiplying 15 by 3.4 is: "+multiplicationResult);
		divisionResult=calculation.divide(600,15);
		System.out.println("The Result of dividing 600 by 15 is: "+divisionResult);
		
		int[] numberArray = new int[]{ 4,5,6 };
		String[] wordArray = new String[]{ "fizz","buzz","pop" };
		fizzBuzz(1,150,numberArray,wordArray);

		//3. print the value of each of these variables to the console with a descriptive message
		

		//4. implement the static fizzBuzz method in this class and call it from the main method
	}
	

	public static void fizzBuzz(int m, int n, int[] numbers, String[] terms){
		 List<String> finalResult= new ArrayList<String>();
                 boolean numberResult=true;

		
		if(m>n)
		{
		System.out.println("m is greater than n, this will not work");
		}
		
		else if(numbers.length!=terms.length)
		{
		System.out.println("your numbers list and terms list aren't equal in length, this will not work");
		}
		
		
		else

		{
			for (int currentNumber=m;currentNumber<(n+1);currentNumber++)
				{
				for(int currentDivider=0;currentDivider<(numbers.length);currentDivider++)
					{
						if(currentNumber%numbers[currentDivider]==0)
						{
						finalResult.add(terms[currentDivider]);
						numberResult=false;
						}
					}
					if(numberResult==true)
						{
						System.out.println(currentNumber);
						}
					else
						{
						System.out.println(finalResult);
						}
					numberResult=true;
					finalResult.clear();
				}
		}
	}
}
