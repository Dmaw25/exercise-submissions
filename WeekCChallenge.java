public class WeekCChallenge {

	public static void main(String[] args){
		
		//1. create a new instance of the Calculator class

		Calculator Calc = new Calculator();
		//2. call each of Calculator's instance methods: add, subtract, multiply, and  divide
		// with arguments of your choice, assigning the result to the variables below
		
		double arg0 = 2.5; 
		double arg1 = 2.0; 

		double additionResult = Calc.add(arg0,arg1);
		double subtractionResult = Calc.subtract(arg0, arg1);
		double multiplicationResult = Calc.multiply(arg0,arg1);
		double divisionResult = Calc.divide(arg0,arg1);

		//3. print the value of each of these variables to the console with a descriptive message
		
		System.out.println(additionResult); 
		System.out.println(subtractionResult);

		System.out.println(multiplicationResult);
		System.out.println(divisionResult);

		String merry = "Merry"; 
		String christmas = "Christmas";

		String greeting; 

		greeting = merry + " " + christmas; 

		System.out.println(greeting);

		int m = 1; 
		int n = 100; 
		int [] numbers = {3,5};
		String[] terms = {"fizz","buzz"};  


		fizzBuzz(m,n,numbers,terms); 
		//4. implement the static fizzBuzz method in this class and call it from the main method
	}
	

	public static void fizzBuzz(int m, int n, int[] numbers, String[] terms){

		String word;
   
    		if ((m<=n) && (numbers.length==terms.length)){

		for (;m<=n;m++)
            {
                word = " "; 
                for (int k=0;k<(numbers.length);k++) {
                     if (((m%numbers[k])==0)){ 
                             word+=terms[k];
                     } 
                 }

                 if (word ==" ")
                 {
                     System.out.println(m);
                 }

                 else{ System.out.println(word);}
                
              }
       }

     else {
        System.out.println("Woah woah woah, wrong input");
     }


	

  	}
}
