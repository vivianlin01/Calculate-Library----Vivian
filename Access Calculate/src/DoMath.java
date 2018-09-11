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
		}
}
