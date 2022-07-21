package visha_theanmozhi;

import java.util.Scanner;

public class salary_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float salary,tax,mbal,qbal,hbal,ybal;
		float gst=(float) 7.5;
		System.out.println("enter your first month salary:");
		salary=sc.nextFloat();
		//monthly
		tax=salary*gst/100;
		mbal=salary-tax;
		System.out.println("your 1st month salary will be"+mbal);
		System.out.println("you monthly ntax will be"+ tax);
		//quarterly
		salary*=3;
		tax=salary*gst/100;
		qbal=salary-tax;
		System.out.println("your quarterly month salary will be"+qbal);
		System.out.println("you monthly ntax will be"+ tax);
		//half-yearly
		salary*=2;
		tax=salary*gst/100;
		hbal=salary-tax;
		System.out.println("your half-year month salary will be"+hbal);
		System.out.println("you monthly ntax will be"+ tax);
		
		//yearly
		salary*=2;
		tax=salary*gst/100;
		ybal=salary-tax;
		System.out.println("your yearly month salary will be"+ybal);
		System.out.println("you monthly ntax will be"+ tax);
		
	}

}
