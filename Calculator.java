import java.util.*;
import java.util.Scanner;  //during my reserch over the weekend I learned that I can call on the Scanner package
						   //, the Scanner utility can be used to take inputs from a user.
						   //I didn't know if I needed both the util.* and util.Scanner
						   //some reserch thatI did people used both or one of ether, 
						   //so I figured both wouldnt hurt  -/\('_')/\-

public class Calculator {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		//this should allow me to imput 2 seperate values 
		System.out.println("Enter value for \\arg0");
		arg0 = in.nextDouble();
		Stytem.out.println("Enter value for \\arg1");
		arg1 = in.nextdouble();
		//and then to choose what opperation to use 
		System.out.print("operation " +
				"\n1.Addition"+
				"\n2.Subtration"+
				"\n3.Multiplication"+
				"\n4.Division");
				
		double value = in.nextDouble;  //the input value 

		//the operations to be input on the terminal 
		double addition = n1;
		double subtraction = n2;
		double multiplication = n3;
		double divisionResult = n4;
		
		 // in theary it should look like  "arg0" "operation number" "arg1" and spits out a number

		 
		 //I dont know what to do with these, I understand that they are here to make what I added above
		 //happen in the command line but im unsure of what to do. 
	public double add(double arg0, double arg1) {
		return 0.0;
	}

	public double subtract(double arg0, double arg1) {
		return 0.0;
	}

	public double multiply(double arg0, double arg1) {
		return 0.0;
	}

	public double divide(double arg0, double arg1) {
		return 0.0;
	}
	
	
	
	}
}