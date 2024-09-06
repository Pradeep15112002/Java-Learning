package javabasic;


class ClassA{
	
	String a ="kuppu";
	public void mthoda() {
		System.out.println(a);

	}
	
}

class ClassB extends ClassA{
	
	String a ="AZHAKU";
	public void mthoda() {
		System.out.println(a);

	}
	
}



public class SingleInhere extends ClassB{
	String a = "pradeep";
	public void mthoda() {
		System.out.println(a);

	}

	public static void main(String[] args) {
		ClassB obj = new SingleInhere();
		
		
		System.out.println(obj.a);
		obj.mthoda();
 
	}

}
