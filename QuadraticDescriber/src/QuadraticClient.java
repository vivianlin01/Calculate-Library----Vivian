import java.util.Scanner;

/*This class is client code that uses the Quadratic
 * to obtain the description of a quadratic graph 
 * @author Vivian Lin
 * @version October 2, 2018
 */
public class QuadraticClient {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in);
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		int hp=userInput.nextInt(); //replace hp
		System.out.println(Quadratic.quadrDescriber(a, b, c));
	}
}
