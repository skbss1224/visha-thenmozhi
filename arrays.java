package visha_theanmozhi;

import java.util.ArrayList;
import java.util.List;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set of instructions
		int []student_id= {4,6,7,34,67,89,0,4,8,9};
//		System.out.println(student_id[2]);
//		System.out.println(student_id[4]);
//		System.out.println(student_id[8]);
//		System.out.println(student_id[6]);
//		System.out.println(student_id[5]);
//		System.out.println(student_id[0]);
//		int[]number=new int[5];
//		number[0]=10;
//		number[1]=20;
//		number[2]=30;
//		number[3]=40;
//		number[4]=50;
//		System.out.println(number[3]);
//		System.out.println(number[4]);
		
//		String[]student_id1= {"visha","thenmozhi","kanimozhi"};
//		System.out.println(student_id1[0]);
//		System.out.println(student_id1[1]);
//		System.out.println(student_id1[2]);
		List<String>sasi=new ArrayList<String>();
		sasi.add("");
		System.out.println("empty array list"+sasi);
		sasi.add("mango");
		System.out.println("add one array list"+sasi);
		sasi.add("cherry");
		System.out.println("add two array list"+sasi);
		sasi.add("strawberry");
		System.out.println("add three array list"+sasi);
		sasi.remove("cherry");
		System.out.println("removed cherry array list"+sasi);
		sasi.clear();
		System.out.println("delete all values"+sasi);
		
	}

}
