
public class Calculator {
	double x;
	public double add(double arg0, double arg1) {
		x = arg0 + arg1;
		return x;
	}

	public double subtract(double arg0, double arg1) {
		x = arg0 - arg1;
		return x;
	}

	public double multiply(double arg0, double arg1) {
		x = arg0 * arg1;
		return x;
	}

	public double divide(double arg0, double arg1) {
		x = arg0 / arg1;
		return x;
	}
}