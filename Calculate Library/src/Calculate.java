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
	}
}
