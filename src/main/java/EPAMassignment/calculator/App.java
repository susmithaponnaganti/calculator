package EPAMassignment.calculator;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
	public static double add(double a,double b) {
		return a+b;
	}
	public static double sub(double a,double b) {
		return a-b;
	}
	public static double mul(double a,double b) {
		return a*b;
	}
	public static double div(double a,double b) {
		return a/b;
	}
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the values of x and y");
    	double x=sc.nextDouble();
    	double y=sc.nextDouble();
    	System.out.println("enter the operation");
    	char c = sc.next().charAt(0);
    	double q = 0;
    	switch(c) {
    	case '+': q= add(x,y);
    				break;
    	case '-': q= sub(x,y);
					break;
    	case '*': q= mul(x,y);
					break;
    	case '/': q= div(x,y);
					break;
		default: System.out.println("invalid operator");
			break;
    	}
    	System.out.println(q+" is the answer");
    }
}
