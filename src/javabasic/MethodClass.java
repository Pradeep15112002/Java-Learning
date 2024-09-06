package javabasic;

import java.lang.reflect.Method;

public class MethodClass {
	
	
	
	
	public void method1() {
		System.out.println("normal method");
	}
	
	public void method1(String name) {
		
		System.out.println("mrthod2" + name);		
		
	}
	
	
	public String orange() {
		return "sam";
		
	}
	
	public String orange(String name) {
		return name;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodClass method1 =new MethodClass();
method1.method1();
method1.method1("apple");
System.out.println(method1.orange());
System.out.println("don");
	}

}
