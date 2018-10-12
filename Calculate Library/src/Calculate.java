/*This class contains methods that perform various math operations.
 * @author Vivian Lin
 * @version September 6, 2018
 */
public class Calculate {
	//returns the square of the input
	public static int square(int number) {
		return number*number;
	} //returns the cube of the input
	public static int cube(int number) {
		return number*number*number;
	} //returns the average of 2 inputs
	public static double average(double num1, double num2) {
		double sum = num1 + num2;
		return sum/2;
	} //returns the average of 3 inputs
	public static double average(double num1, double num2, double num3) {
		double sum = num1 + num2 + num3;
		return sum/3;
	} //converts angle measure in radians into degrees
	public static double toDegrees(double rad) {
		double sum = rad*180;
		return sum/3.1415926;
	} //converts angle measure in degrees into radians
	public static double toRadians(double deg) {
		double sum = deg*3.1415926;
		return sum/180;
	} //provides coefficients of quadratic equation in standard form
	public static double discriminant(double a, double b, double c) {
		double answer = (b*b)-(4*a*c);
		return answer;
	} //converts mixed number into an improper fraction
	public static String toImproperFrac(int whole, int numer, int denom) {
		return (whole*denom+numer)+"/"+denom;
	} //converts improper fraction into a mixed number
	public static String toMixedNum(int numer, int denom) {
		return numer/denom+"_"+ (numer%denom)+"/"+denom;
	} //converts binomial multiplication into quadratic equation
	public static String foil(int a, int b, int c, int d, String n) {
		return a*c+"n^2 + "+(a*d+b*c)+"n + "+(b*d);
	} //determines whether or not one int is evenly divisible by another
	public static boolean isDivisibleBy(int num, int factor) {
		if (factor==0) throw new IllegalArgumentException("cannot divide by 0");
		int remainder = num % factor;
		if (remainder==0) {
			return true;
		}else {
			return false;
		}
	} //returns absolute value of the number passed
	public static double absValue(double value) {
		if (value<0) {
			return -value;
		}else {
			return value;
		}
	} //returns the larger of 2 values
	public static double max(double num1, double num2) {
		if (num1>=num2) {
			return num1;
		}else {
			return num2;
		}
	} //returns the larger of 3 values
	public static double max(double num1, double num2, double num3) {
		if (num1>=num2 && num1>=num3) {
			return num1;
		}else {
			if (num2>=num3) {
				return num2;
			}else {
				return num3;
			}
		}
	} //returns smaller of 2 values
	public static int min(int num1, int num2) {
		if (num1<=num2) {
			return num1;
		}else {
			return num2;
		}
	} //rounds value to 2 decimal places
	public static double round2(double value) {
		if (value<0) { 
			double posvalue=-value;
			if (posvalue*1000%10<5) {
				return -(((posvalue*1000)-(posvalue*1000%10))/1000);
			}else {
				return -(((posvalue*1000)+(10-posvalue*1000%10))/1000);
			}
		}
		if (value*1000%10<5) {
			return (((value*1000)-(value*1000%10))/1000);
		}else {
			return (((value*1000)+(10-value*1000%10))/1000);
		}
	} //raises a value to a positive int power
	public static double exponent(double base, int power) {
		if (power<0) throw new IllegalArgumentException("cannot take negative exponent");
		double answer = base;
		if(power==0) {
			System.out.println("1.0");
		}else for (int i=1; i<power; i++) {
			answer=answer*base;
		}
		return answer;
	} //returns the factorial of the value passed
	public static int factorial(int value) {
		if(value<0) throw new IllegalArgumentException("cannot take factorial of negative values");
		int product = 1;
		for (int i=2; i<=value; i++) {
			product=product*i;
		}
		return product;
	} //determines whether or not an int is prime
	public static boolean isPrime(int value) {
		boolean answer=true;
		boolean divide;
			for(int i=2; i<value; i++) {
				divide = isDivisibleBy(value, i);
				if(divide == true) {
					answer = false;
				}
			}
		return answer;
	} //finds the greatest common factor of two integers
	public static int gcf(int num1, int num2) {
		int factor=num1;
			for (int i=factor; i>=1; i--) {
				boolean divisible1 = isDivisibleBy(num1, i);
				boolean divisible2 = isDivisibleBy(num2, i);
				if (divisible1==true && divisible2==true) {
					return i;
				}
			}
			return factor;
	} //returns an approximation of the square root of value
	public static double sqrt(double value) {
		if(value<0) throw new IllegalArgumentException("cannot take square root of a negative value");
		if(value==0) {
			return 0;
		}
		double answer=1;
		double root;
		for(int i=1; i<=value; i++) {
			root=answer;
			if (round2(value-(root*root)) != 0) {
				answer = round2(0.5*((value/root)+root));
			}
		} return answer;
	}//uses the coefficients of a quad equation to approximate the real roots using quad formula
	public static String quadForm(int a, int b, int c) {
		double root1;
		double root2;
		if(discriminant(a, b, c)>0) {
			root1= round2((-b+sqrt(b*b-4*a*c))/(2*a));
			root2= round2((-b-sqrt(b*b-4*a*c))/(2*a));
			return root1 + " and " + root2;
		}else if(discriminant(a, b, c)==0){
			root1=round2(-b/(2*a));
			return root1+ "";
		}else {
			return "no real roots";
		}
	}
}
