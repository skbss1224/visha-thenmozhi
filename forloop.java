package visha_theanmozhi;

import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=1;
//		while(a<=10) {
//			System.out.println(a);
//			a=a+1;
//		}
//		for(int a=1;a<=10;a=a+1) {
//			System.out.println(a);
//		}
//		for(int a=1;a<=100;a=a+2) {
//			System.out.println("add numbers"+a);
//		}
//		for(int a=0;a<=100;a=a+2) {
//			System.out.println("even numbers"+a);
//		}
//		int n=10;
//		for(int i=1;i<=n;++i) {
//			System.out.println("hi hello world");
//		}
//		
		
		int amt=0;
		Scanner scan=new Scanner(System.in);
		for(int seats=1;seats<=20;) {
			if(seats%2==0 || seats%3==0) {
				System.out.println("booked already");
				seats++;
				break;
			}
			else
			{
				System.out.println("enter the amount:");
				amt=scan.nextInt();
				if(amt>=530)
				{
					System.out.println(seats+"seat booked");
					seats++;
				}
				else {
					System.out.println("insuffiecient amount to book");
				}
			}
		}
		scan.close();
	}

}
