package javabasic;

class Fruits{
	static void name() {
		System.out.println("apple");
	}

	public Number  add() {	
		return 1;
	}
	
}
class Mixed extends Fruits{
	static void name() {
		name();
		System.out.println(6);
	}
	
	public Double add() {
		return 1.0;
	}
	
}
//different  class
//same method
//same parameter
//final datatype not supported

public class OverridindMethod extends Mixed {

	public static void main(String[] args) {
		//Fruits obj = new Fruits();
		Mixed obj1 = new Mixed();
	//	obj.name();
		obj1.name();

	}

}
