public class Calculator {

	public double add(double arg0, double arg1) {
		return arg0 + arg1;
	}

	public double subtract(double arg0, double arg1) {
		return arg0 - arg1;
	}

	public double multiply(double arg0, double arg1) {
		return arg0 * arg1;
	}

	public double divide(double arg0, double arg1) {
		if (arg1 == 0) {
			System.out.println("division by zero error");
			return 0.0;
		}
		else {
			return arg0 / arg1;
		}
	}
	
}