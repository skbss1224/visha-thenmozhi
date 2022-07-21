package visha_theanmozhi;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//operators
		//arithmetic operator  
		//+ plus operator
		//- minus operator
		//* mul operator
		// / div operator
		// % per operator
		Scanner hello=new Scanner(System.in);
		System.out.println("enter the visha salary:");
		int visha=hello.nextInt();
		System.out.println("enter the thenmozhi salary:");
		int thenmozhi=hello.nextInt();
		int total;
		total=visha+thenmozhi;
		System.out.println("total salary is:");
		System.out.println(total);
		total=visha-thenmozhi;
		System.out.println("minus operator:");
		System.out.println(total);
		total=visha*thenmozhi;
		System.out.println("mul");
		System.out.println(total);
		total=visha/thenmozhi;
		System.out.println("div operator:");
		System.out.println(total);
		total=visha%thenmozhi;
		System.out.println("per operator");
		System.out.println(total);
	
		
	}

}
