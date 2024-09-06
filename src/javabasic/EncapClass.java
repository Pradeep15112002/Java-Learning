package javabasic;
import java.util.Scanner;

//import java.util.*;

public class EncapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EncapsulMarket ap =new EncapsulMarket();

Scanner sc = new Scanner(System.in);

System.out.println("enter veg0 name ");
String veg0Name = sc.nextLine();
ap.setVegetable0(veg0Name);


System.out.println("enter veg0 price ");
int veg0Price = sc.nextInt();
ap.setVegetable0Price(veg0Price);

System.out.println("...................");
System.out.println("enter veg2 name ");
String veg2name = sc.nextLine();
ap.setVegetables1(veg2name);

System.out.println("enter veg2 price ");
int veg2Price = sc.nextInt();
ap.setVegetable2Price(veg2Price);

System.out.println(ap.getVegetable0());

System.out.println(ap.getVegetable1());




System.out.println(ap.getTotal());
	}

}
