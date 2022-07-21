package visha_theanmozhi;

import java.util.Scanner;

public class string_control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hi=new Scanner(System.in);
		System.out.println("enter your nationality:");
		String nationality=hi.nextLine();
		if(nationality.equals("indian")) {
			System.out.println("you are selected "+nationality);
			System.out.println("enter your age:");
			int age=hi.nextInt();
			if(age>=18) {
				System.out.println("your age is "+age);
				System.out.println("enter your amount:");
				int amount=hi.nextInt();
				if(amount>=500) {
					System.out.println("you have apply for indian bank account");
					int bal = amount-500;
					System.out.println("your balance amount is "+bal);
				}
				else {
					System.out.println("you didn't have a open indian bank account");
				}
			}
			else {
				System.out.println("you didn't have age 18");
			}
		}
		else {
			System.out.println("you are not a indian");
		}
	}

}
