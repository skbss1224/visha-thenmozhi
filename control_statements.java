package visha_theanmozhi;

import java.util.Scanner;

public class control_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hello=new Scanner(System.in);
		System.out.println("enter your nationality:");
		String nationality=hello.nextLine();
		if(nationality.equals("indian")) {
			System.out.println("you are selected indian");
			System.out.println("enter your age:");
			int age=hello.nextInt();
			if(age>=18) {
				System.out.println("you applied for voter id");
			}
			else {
				System.out.println(" you are not elligible for voter id");
			}
			
		}
		else {
			System.out.println("you are not a indian");
		}
		
	}

}
