package javabasic;

import java.util.Scanner;

public class ConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		//class objectname=new class ()input stream
		Scanner name =new Scanner(System.in);
		System.out.println("enter the age");
		int age = name.nextInt();
		if(age<18) {
			System.out.println("not eligible");
		}
		else if(age>=18 && age<=40){
			System.out.println("eligible");
		}
		else {
			System.out.println("not eligible");
		}

	} 

}
