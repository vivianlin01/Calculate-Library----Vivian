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
	public static double toDegrees(double angle) {
		double sum = angle*180;
		return sum/3.1415926;
	} //converts angle measure in degrees into radians
	public static double toRadians(double angle) {
		double sum = angle*3.1415926;
		return sum/180;
	} //provides coefficients of quadratic equation in standard form
	public static double discriminant(double num1, double num2, double num3) {
		double sum = (num2*num2) - (4*num1*num3);
		return sum;
	} //converts mixed number into an improper fraction
	public static String toImproperFrac(int num1, int num2, int num3) {
		return (num1*num3+num2)+"/"+num3;
	} //converts improper fraction into a mixed number
	public static String toMixedNum(int num1, int num2) {
		return num1/num2+" "+ (num1%num2)+"/"+num2;
	} //converts binomial multiplication into quadratic equation
	public static String foil(int num1, int num2, int num3, int num4) {
		return num1*num3+"n^2+"+(num1*num4+num2*num3)+"n+"+(num2*num4);
	} //determines whether or not one int is evenly divisible by another
	public static boolean isDivisibleBy(int num1, int num2) {
		int remainder = num1 % num2;
		if (remainder==0) {
			return true;
		}else {
			return false;
		}
	} //returns absolute value of the number passed
	public static double absValue(double num1) {
		if (num1<0) {
			return -num1;
		}else {
			return num1;
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
		if (value*1000%10<5) {
			return (((value*1000)-(value*1000%10))/1000);
		}else {
			return (((value*1000)+(10-value*1000%10))/1000);
		}
	} //raises a value to a positive int power
	public static double exponent(double num1, int power) {
		double answer;
		for (int i=1; i<=power; i++) {
			answer= 
		}
	}
}
 