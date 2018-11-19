public class Calculator {

    private double arg0;
    private double arg1;

    public Calculator() {        
        System.out.println("called noargs constructor");
    }

    public Calculator(double arg0, double arg1) {
        this.arg0 = arg0;
        this.arg1 = arg1;
    } 

	public double add(double arg0, double arg1) {
        double result = arg0 + arg1;
        return result;
	}

	public double subtract(double arg0, double arg1) {
        double result = arg0 - arg1;
        return result;
	}

	public double multiply(double arg0, double arg1) {
        double result = arg0 * arg1;
        return result;
	}

	public double divide(double arg0, double arg1) {
        double result = arg0 / arg1;
        return result;
    }

    public double getArg0() {
        return this.arg0;
    }

    public double getArg1() {
        return this.arg1;
    }

    public void setArg0(double arg0) {
        this.arg0 = arg0;
    }

    public void setMake(double arg1) {
        this.arg1 = arg1;
    }
}