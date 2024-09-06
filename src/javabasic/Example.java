package javabasic;

public class Example {
	static int count = 0;
	
	
	public  Example() {
		count++;
	}

	public static void main(String[] args) {
		Example obj1 = new Example();
		Example obj2 = new Example();
		Example obj3 = new Example();
		System.out.println(count);

		
		// TODO Auto-generated method stub

	}

}
