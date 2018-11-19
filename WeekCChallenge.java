public class WeekCChallenge {

	public static void main(String[] args){
		
		//1. create a new instance of the Calculator class
		Calculator calc = new Calculator();

		//2. call each of Calculator's instance methods: add, subtract, multiply, and divide
		// with arguments of your choice, assigning the result to the variables below
		
		double additionResult = calc.add(6,9);
		double subtractionResult = calc.subtract(15,6);
		double multiplicationResult = calc.multiply(3,6);
		double divisionResult = calc.divide(27,9);

		//3. print the value of each of these variables to the console with a descriptive message
		System.out.println(additionResult);
		System.out.println(subtractionResult);
		System.out.println(multiplicationResult);
		System.out.println(divisionResult);

		//4. implement the static fizzBuzz method in this class and call it from the main method
		int m = 1;
		int n = 200;
		int[] numbers = {3,5,7};
		String[] terms = {"fizz","buzz","stuff"};
		fizzBuzz(m,n,numbers,terms);
		}
	
		
	public static void fizzBuzz(int m,int n,int[] numbers,String[] terms){
		String output = "";
		for(int i = m; i <= n; ++i){
			for(int j = 0; j < numbers.length; ++j){
				if((i % numbers[j]) == 0){
					output += terms[j];
				}
			}
			if(!output.isEmpty()){
				System.out.println(output);
			}
			else{
				System.out.println(i);
			}
			output = "";
		}
	}
}

/*function fizzBuzz3(m,n,numbers,terms){    
    if(isNaN(Number(m)) || isNaN(Number(n)) || m > n){
        console.log("Invalid Input");
        return;
    }
    let output = "";
    for( i = m; i <= n; ++i){
        for( let j in numbers){
            if(i % numbers[j] === 0){
                output += terms[j];
            }
        }
        if(output){
            console.log(output);
        }
        else{
            console.log(i);
        }
    output = "";
    }
}
*/