package Roughi;

import java.util.Scanner;

public class Operation {
	public int sum(int a , int b) 
	{
		int c;
		c=a+b;
		System.out.println("value of c is"+c);
		return c;
	}
	public int sub(int x , int y) 
	{
		int z;
		z=x-y;
		System.out.println("value of z is"+z);
		return z;
	}
	public int sum1(int a2 , int b2) 
	{
		int c2;
		c2=a2+b2;
		System.out.println("value of c is"+c2);
		return c2;
	}
	
	public int mul(int e, int f) 
	{
		int g;
		g=e*f;
		System.out.println("value of g is"+g);
		return g;
	}

	public void div(int a1, int b1) 
	{
		int c1;
		c1=a1/b1; 
		System.out.println("value of c1 is"+c1);

	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of x1");
		int x1=sc.nextInt();
		System.out.println("enter the value of x2");
		int x2=sc.nextInt();
		System.out.println("enter the value of x3");
		int x3= sc.nextInt();
		System.out.println("enter the value of x4");
		int x4= sc.nextInt();
		System.out.println("enter the value of x5");
		int x5 =sc.nextInt();
		System.out.println("enter the value of x6");
		int x6= sc.nextInt();

		Operation op = new Operation();
		int  sumresult=op.sum(x1,x2);
		int subresult=op.sub(sumresult,x3);
		int sum1res=op.sum1(subresult, x4);
		int mulresult=op.mul(sum1res,x5);
		op.div(mulresult,x6);
		
	}
	
}
