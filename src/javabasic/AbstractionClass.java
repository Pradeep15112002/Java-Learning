package javabasic;


 abstract class Test{
	
	 abstract void method4();
	  
	 
	 void test1() {
		System.out.println("hiii");
	}
	
}
//hidding the implementation and showing the user functoin
//abstraction described as partial abstraction.            (no implementation)(abstract method)
 //because abstract class contain  both method              (implementatin)(concrete method)
// cannot create the object from the abstraction class
 // cause : abstract constract default cannot create onject

public  class AbstractionClass extends Test {


	void method4() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	public static void main(String[] args) {
		AbstractionClass obj =new AbstractionClass();
		//Test obj1 =new Test ();
		obj.test1();
		
		
	}
	

	
}
