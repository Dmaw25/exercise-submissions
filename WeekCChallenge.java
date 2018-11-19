public class WeekCChallenge extends Calculator {

	private double additionResult;
	private double subtractionResult;
	private double multiplicationResult;
	private double divisionResult;
	private double sum;
	private double diff;
	private double numm;
	private double jump;
	private String[] terms;
	private String[] numbers;

	public static void main(String[] args){
		

		Calculator joeCalc = new Calculator();


		fizzbuzz(3, 4, numbers[8], terms[9]);

		}


		public double getAdd(double sum){
		  joe.Calc.add(sum);
		  return this.additionResult;
		}

		public double getSub(double diff){
		  joeCalc.subtract(diff);
		  return this.subtractionResult;
		}

		public double getProd(double numm){
		  joeCalc.multiply(numm);
		  return this.multiplicationResult;
		}

		public double getQuot(double jump){
		  joeCalc.divide(jump);  
		  return this.divisionResult;
		}



		 System.out.println("%f This is a sum from the add method in Calculator.", additionResult);
		 System.out.println("%f This is a differnce from the Calculator method subtract.", subtractionResult);
		 System.out.println("%f This is product of the Calculator multiply method.", multiplicationResult);
		 System.out.println("%f This is the quotient from the divide method in Calculator.", divisionResult);



	public static void fizzBuzz( m, n, numbers, terms){
		int i=100;

		for(int m = 0; m <= n; i++)
		{
		  for(int i = 0; i <= numbers.length; i++) 
		  {
		    if(i % 15 == 0)
		    {
		      System.out.println("FizzBuzz"+"");
		    }
		    else
		      if(i % 5 == 0)
		      {
		        System.out.println("Buzz"+"");
		      }
		      else{
		        if(i % 3 == 0)
			{
		          System.out.println("Fizz"+"");
			}
		      }
		  }
		}

	     }
}
