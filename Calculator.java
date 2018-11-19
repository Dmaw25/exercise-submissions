public class Calculator {
	public static void main(String[] args)
	{
		System.out.println("Enter num1 and num2");
		int num1,num2;
		num1 = inp.nextInt();
		num2 = inp.nextInt();
		int ans;
		System.out.println("Choose one of the following");
		int choose;
choose = inp.nextInt();
		switch (choose) {
		case 1:
		System.out.println(add( num1,num2));
		break;
		case 2:
		System.out.println(subtract( num1,num2));
		break;
		case 3:
		System.out.println(multiply( num1,num2));
		break;
		case 4:
		System.out.println(divide( num1,num2));
		break;
		default:
		   System.out.println("Error");
		
		}
	}

	public double add(double argx, argy); {
		double result = argx + argy;
		return result;
	}

	public double subtract(double argx, double argy); {
		double result = argx - argy;
		return result;
	}

	public double multiply(double argx, double argy); {
		double result = argx * argy;
		return result;
	}

	public double divide(double argx, double argy); {
		double result = argx/argy;
		return result;
	}


	public static void fizzBuzz(int m, int n, int[] numbers, String[] terms){
		int (int m = 0; m <= n; n++);
		System.Out.println (m)

		int (x=0; x<=n; x++);
		System.Out.println(term[x]);
 	}

}
