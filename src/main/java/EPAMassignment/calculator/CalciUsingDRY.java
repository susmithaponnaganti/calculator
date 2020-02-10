package EPAMassignment.calculator;
import java.util.*;
public class CalciUsingDRY {
		static Double add(double a,double b) {
			return a+b;
		}
		static Double sub(double a,double b) {
			return a-b;
		}
		static Double mul(double a,double b) {
			double s=0;
			for(int i=0;i<b;i++)
			s=add(s,a);
			return s;
		}
		static Double div(double b,double a) {
			double s=a;
			while(a>=b) {
			s++;
			add(s,-a);
			}
			return s;
		}
public static void main( String[] args )
		{
		   //System.out.println( "Hello World!" );

		Scanner sc=new Scanner(System.in);
		char c=sc.next(".").charAt(0);
		switch(c) {
		case '+':System.out.println(add(3,4));
				break;
		case '-':System.out.println(sub(3,2));
				break;
		case '*':System.out.println(mul(3,4));
				break;
		case '/':System.out.println(div(32,4));
				break;
		default:
				break;

		}
	}
}
