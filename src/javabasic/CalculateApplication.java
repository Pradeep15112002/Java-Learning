package javabasic;

import java.util.Scanner;

public class CalculateApplication {

	public static void main(String[] args) {
		// calculator
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a value");
		int a =sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		
		
		  
		
		String oparator;
		do {
			System.out.println("enter oparayor name");
			oparator = sc.next();
			
			switch (oparator) {
			case "add":
				System.out.println(a+b);
				break;
			case "sub":
				System.out.println(a-b);
				break;
				
			case "multi":
				System.out.println(a*b);
				break;
				
			case "div":
				System.out.println(a/b);
				break;

			default:
				System.out.println("not available and close app");
				break;
			}
		} while ("close" != oparator);
		
		
		
		
		

//		
	}

}
