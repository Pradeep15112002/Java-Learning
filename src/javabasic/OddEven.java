package javabasic;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number =new Scanner(System.in);
		System.out.println("enter the number");
		int number1 = number.nextInt();
		if(number1 % 2 == 0) {
			System.out.println("number is even"); 
		}
		else {
			System.out.println("nuber is not even");
		}
		
	}

}
