package visha_theanmozhi;

import java.util.Scanner;

public class relational_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//relational operator
		//< -lessthan
		//> -greaterthan 
		//<=-lessthan equal
		//>= -greather than equal
		//== - assignment operator
		Scanner hello=new Scanner(System.in);
		System.out.println("enter the visha salary:");
		int salary1=hello.nextInt();
		System.out.println("thenmozhi salary:");
		int salary2=hello.nextInt();
		
		boolean compare;
		compare=salary1<salary2;
		System.out.println("lessthan operator "+compare);
		compare=salary1>salary2;
		System.out.println("gretherthan operator "+compare);
		compare=salary1<=salary2;
		System.out.println("lessthan equal "+compare);
		compare=salary1>=salary2;
		System.out.println("greaterthan equal operator "+compare);
		compare=salary1==salary2;
		System.out.println("lessthan operator "+compare);
	}

}
