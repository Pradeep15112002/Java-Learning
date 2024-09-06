 package javabasic;
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
    	Scanner method =new Scanner(System.in);
    	System.out.println("1.addition");
    	System.out.println("2.subtraction");
    	System.out.println("3.multiplication");
    	System.out.println("4.didision");
    	 System.out.print("Enter choice (1/2/3/4): ");
         int choice = method.nextInt();

         System.out.print("Enter first number: ");
         double num1 = method.nextDouble();

         System.out.print("Enter second number: ");
         double num2 = method.nextDouble();
    	String result;
		switch(choice) {
    	case '1':
    		
    		result ="num1+num2";
    		System.out.println(result);
    		break;
    	}
    	
    }
}

