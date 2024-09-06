package javabasic;

import java.util.Scanner;

public class ConditionStstement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name =new Scanner(System.in);
		System.out.println("enter the age");
		int age = name.nextInt();
		
		if(18<=age) {
			System.out.println(" eligible");
		}
		else {
			System.out.println("not eligible");
		}
		
		
		
		
		
		
	}

}
