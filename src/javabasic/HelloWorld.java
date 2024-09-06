package javabasic;
public class HelloWorld {
	
	// datatype varibalename = value;
	int number =1;
	Integer num =1;
	String name ="pradeep";
	Number nm =1;

	//constructor 
	public HelloWorld() {
		
	}
	
	//method 
	// modifi returntype methodname(){}
	public void name() {
		System.out.println("Hello World");
	}
	
	public int name1() {
		System.out.println("Hello World 11");
		return 7;
	}
	
	
	public static void main(String[] args) {
     
		// classname objname = new classname();
		 HelloWorld heloWorld = new HelloWorld();
		
		//objname.method name
		heloWorld.name();
		System.out.println(heloWorld.num);
		System.out.println(	heloWorld.name1());
	
		
		
	}

}
