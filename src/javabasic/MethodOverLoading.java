package javabasic;
class Calculator{
final int add(int a,int b) {
		return a+b;
	}
//overloading static method possible
//final posible

final int add(int a,int b, int c){
		return a+b+c;
	}	
}
//one class //same method// different parameters



public class MethodOverLoading {

	public static void main(String[] args) {
	Calculator	 cal= new Calculator();
		
		System.out.println(cal.add(5,5));
		System.out.println(cal.add(5, 50, 5));
	}

}
	


