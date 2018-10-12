/*This class contains a method that provides the user 
 * with the description of a quadratic graph.
 * @author Vivian Lin
 * @version October 2, 2018
 */
public class Quadratic {
	//writes the equation of the graph
	public static String equation(double a, double b, double c) {
		String equation = "y = " +a+ " x^2 + " +b+ "x + " +c;
		return equation;
	}
	//describes whether graph opens up or down
	public static String opens(double a) {
		String open = "Opens: ";
		if (a>0) {
			open = "Opens: Up";
		}else {
			open = "Opens: Down";
		}return open;
	}
	//evaluates axis of symmetry
	public static String axis(double a, double b) {
		String vertex = "Axis of Symmetry: "+ round2(-b/(2*a));
		return vertex;
	}
	//evaluates vertex
	public static String vertex(double a, double b, double c) {
		double xcoord= round2(-b/(2*a));
		double ycoord= round2(a*xcoord*xcoord + b*xcoord + c);
		String vertex= "Vertex: (" + xcoord + "," + ycoord + ")";
		return vertex;
	}
	//x-intercept: determinant method
	public static double discriminant(double a, double b, double c) {
		double answer = (b*b)-(4*a*c);
		return answer;
	}
	//x-intercept: round2 method
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
	} 
	//x-intercept: sqrt method
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
	}
	//evaluates x-intercepts
	public static String xintercept(double a, double b, double c) {
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
	//evaluates y-intercept
	public static String yintercept(double c) {
		String yintercept= ""+c;
		return yintercept;
	}
	//description of the graph
	public static String quadrDescriber(double a, double b, double c) {
		String equation= equation(a,b,c);
		String opens= opens(a);
		String axis= axis(a,b);
		String vertex= vertex(a,b,c);
		String xint= "x-intercept(s): " + xintercept(a,b,c);
		String yint= "y-intercept: " + yintercept(c);
		String describer= equation+"\n"+"\n"+opens+"\n"+axis+"\n"+vertex+"\n"+xint+"\n"+yint+"\n";
		return describer;
	}	
}
