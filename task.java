package visha_theanmozhi;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loan amount
		Scanner sc=new Scanner(System.in);
		float loanamt,tax,percentage=5,pay,var;
		System.out.println("enter your desire loan amount: ");
	    loanamt=sc.nextFloat();
	    //monthly
	    tax=loanamt*percentage/100;
	    pay=loanamt+tax;
	    System.out.println("your tax amount after one month willbe "+tax);
	    System.out.println("if you wish to pay whole amount in one month, the amount woulbe be "+pay);
	  //quarterly
	    var=3*loanamt;
	    tax=var*percentage/100;
	    pay=loanamt+tax;
	    System.out.println("your tax amount after 3 month willbe "+tax);
	    System.out.println("if you wish to pay whole amount in 3 month, the amount woulbe be "+pay);
	    //half-month
	    var=6*loanamt;
	    tax=var*percentage/100;
	    pay=loanamt+tax;
	    System.out.println("your tax amount after 6 month willbe "+tax);
	    System.out.println("if you wish to pay whole amount in 6 month, the amount woulbe be "+pay);
	    //yearly
	    var=12*loanamt;
	    tax=var*percentage/100;
	    pay=loanamt+tax;
	    System.out.println("your tax amount after 12 month willbe "+tax);
	    System.out.println("if you wish to pay whole amount in 12 month, the amount woulbe be "+pay);
	}

}
