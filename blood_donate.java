package visha_theanmozhi;

import java.util.Scanner;

public class blood_donate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("you age will be "+age);
			System.out.println("enter you weight:");
			int weight=sc.nextInt();
			if(weight>=50) {
				System.out.println("you are donate blood");
			}
			else {
				System.out.println("you weight is below you couldn't donate blood");
			}
			
		}
		else {
			System.out.println("the person is not elligible for donate blood");
		}
		}
	}


