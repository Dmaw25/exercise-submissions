public class Calculator {

	public double arg0 = 0;
	public double arg1 = 0;
	public double additionResult = 0;
	public double subtractionResult = 0;
	public double multiplicationResult = 0;
	public double divisionResult = 0;

	public double add(double arg0, double arg1) {
		additionResult = arg0 + arg1;
		System.out.println(arg0+" + "+arg1+" = "+additionResult);
		return 0.0;
	}

	public double subtract(double arg0, double arg1) {
		subtractionResult = arg0 - arg1;
		System.out.println(arg0+" - "+arg1+" = "+subtractionResult);
		return 0.0;
	}

	public double multiply(double arg0, double arg1) {
		multiplicationResult = arg0 * arg1;
		System.out.println(arg0+" * "+arg1+" = "+multiplicationResult);
		return 0.0;
	}

	public double divide(double arg0, double arg1) {
		divisionResult = arg0 / arg1;
		System.out.println(arg0+" / "+arg1+" = "+divisionResult);
		return 0.0;
	}
}
