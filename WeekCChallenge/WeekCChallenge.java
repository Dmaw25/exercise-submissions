import java.util.Scanner;

public class WeekCChallenge extends Calculator {

	public static void main(String[] args){
		
      double x = 0;
      double y = 0;
      
		//1. create a new instance of the Calculator class
      
      Calculator calc = new Calculator(); 
      
      double[] array = getInputValues(x, y);
      

		//2. call each of Calculator's instance methods: add, subtract, multiply, and divide
		// with arguments of your choice, assigning the result to the variables below
		
      
      
		double additionResult = new add(x,y);
		double subtractionResult;
		double multiplicationResult;
		double divisionResult;

		//3. print the value of each of these variables to the console with a descriptive message
		

		//4. implement the static fizzBuzz method in this class and call it from the main method
	}
	
   public static double[] getInputValues(double x, double  y){
      
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Value (1): ");
      x = sc.nextDouble();
      System.out.print("Enter Value (2): ");
      y = sc.nextDouble();
      
      double[] array = {x,y};  
        
      return array;
   }

	public static void fizzBuzz(int m, int n, int[] numbers, String[] terms){
      
	}
}