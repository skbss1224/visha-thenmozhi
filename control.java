package visha_theanmozhi;

import java.util.Scanner;

public class control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hello=new Scanner(System.in);
		System.out.println("enter your tamil mark:");
		int tamil=hello.nextInt();
		System.out.println("enter your english mark:");
		int english=hello.nextInt();
		System.out.println("enter your maths mark:");
		int maths=hello.nextInt();
		System.out.println("enter your science mark:");
		int science=hello.nextInt();
		System.out.println("enter your social mark:");
		int social=hello.nextInt();
		if(tamil<english) {
			System.out.println("english mark is big");
		}
		else if(english <maths) {
			System.out.println("maths mark is big");
		}
		else if(maths<science) {
			System.out.println("science mark is big");
		}
		else if(science<social) {
			System.out.println("social mark is big");
		}
		else {
			System.out.println("none of these");
		}
		
	}

}
