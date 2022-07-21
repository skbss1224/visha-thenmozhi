package visha_theanmozhi;

import java.util.Scanner;

public class scanner_with_datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner datatype
		Scanner hello=new Scanner(System.in);
		System.out.println("enter int value:");
		int a=hello.nextInt();
		System.out.println("int "+a);
		System.out.println("enter byte value:");
		byte b=hello.nextByte();
		System.out.println("byte "+b);
		System.out.println("enter short value:");
		short c=hello.nextShort();
		System.out.println("short "+c);
		System.out.println("enter long value:");
		long d=hello.nextLong();
		System.out.println("long "+d);
		System.out.println("enter float value:");
		float e=hello.nextFloat();
		System.out.println("float "+e);
		System.out.println("enter double value:");
		double f=hello.nextDouble();
		System.out.println("double "+f);
		System.out.println("enter boolean value:");
		boolean g=hello.nextBoolean();
		System.out.println("boolean "+g);
		
	}

}
