package EPAMassignment.calculator;

import java.util.Scanner;

public class CalciUsingSOLID extends operation{
public double add(double a,double b) {
return a+b;
}
public double sub(double a,double b) {
return a-b;
}
public double mul(double a,double b) {
return a*b;
}
public double div(double a,double b) {
return a/b;
}
    public static void main( String[] args )
    {
    operation op = new CalciUsingSOLID();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the values of x and y");
    double a[]=new double[2];
    for(int i=0;i<2;i++) {
    a[i]=sc.nextDouble();
    }
    System.out.println("enter the operation");
    char c = sc.next().charAt(0);
    double q = 0;
    switch(c) {
    case '+': q= op.add(a[0],a[1]);
    break;
    case '-': q= op.sub(a[0],a[1]);
    break;
    case '*': q= op.mul(a[0],a[1]);
    break;
    case '/': q= op.div(a[0],a[1]);
    break;
    default: System.out.println("invalid operator");
    break;
    }
    System.out.println(q+" is the answer");
    }
}

