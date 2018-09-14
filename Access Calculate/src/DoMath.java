/*This class is client code that uses the Calculate Library
 * to perform various mathematical tasks.
 * @author Vivian Lin
 * @version September 6, 2018
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(55));
		System.out.println(Calculate.cube(55));
		System.out.println(Calculate.average(10.0, 5.0));
		System.out.println(Calculate.average(10.0, 5.0, 3.0));
		System.out.println(Calculate.toDegrees(0.5));
		System.out.println(Calculate.toRadians(30));
		System.out.println(Calculate.discriminant(3.0,2.0,4.0));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2,3,6,-7));
		System.out.println(Calculate.isDivisibleBy(8, 2));
		System.out.println(Calculate.absValue(-4.0));
		System.out.println(Calculate.max(2.0, 3.0));
		System.out.println(Calculate.max(2.0, 4.0, 3.0));
		System.out.println(Calculate.min(5,2));
	}
}
