import java.util.Scanner;

/*This class is client code that uses the Quadratic
 * to obtain the description of a quadratic graph 
 * @author Vivian Lin
 * @version October 2, 2018
 */
public class QuadraticClient {
	
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.println("a");
		double a=console.nextDouble();
		System.out.println("b");
		double b=console.nextDouble();
		System.out.println("c");
		double c=console.nextDouble();
		System.out.println(Quadratic.quadrDescriber(a, b, c));
		System.out.println("Do you want to keep going? (Type \"quit\" to end");
		if () {
			
		}
	}
}
