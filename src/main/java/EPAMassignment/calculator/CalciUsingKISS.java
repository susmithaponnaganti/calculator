package EPAMassignment.calculator;
import java.util.*;
public class CalciUsingKISS {
	public static double calculation(double n1,int c,double n2) {
		double a[]= {n1+n2,n1-n2,n1*n2,n1/n2};
		return a[c-1];
	}
	public static void main(String[] args ) {
		Scanner sc=new Scanner(System.in);
		double n1=sc.nextDouble();
		double n2=sc.nextDouble();
		int c=sc.nextInt();
		System.out.println(calculation(n1,c,n2));
	}
}
