package javabasic;

import java.util.concurrent.CopyOnWriteArrayList;

public class Constructor {
	
	//default constructor
	//the constructor that can be called with no arguments
	 Constructor() {
		System.out.println("consr 1");
	}
	
	//paramters constructor
	//the constructor that can be called with one or more arguments
	public Constructor(String name) {
		System.out.println("consr 2");
	}
	
	public Constructor(String name, int age) {
		System.out.println("consr 3");
	}

	public static void main(String[] args) {

		Constructor constructor1 =new Constructor();
		Constructor constructor2 =new Constructor("apple");
		Constructor constructor3 =new Constructor("orange",5);
		
		
		
		
	}

}
