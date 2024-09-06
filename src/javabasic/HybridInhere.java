package javabasic;

class GrandPa{
	String name ="kuppu";
	public void mathsd() {
		System.out.println(name);

	}
	
}

class Son extends GrandPa{
	String name ="hi";
	public void mathsd() {
		System.out.println(name);

	}
}

class you  extends GrandPa{
	String name ="halo";
	public void mathsd() {
		System.out.println(name);

	}
}
public class HybridInhere  extends GrandPa{
	String name ="hey";
	public void mathsd() {
		System.out.println(name);
		mathsd();

	}
	public static void main(String[] args) {
		
		GrandPa obja = new  HybridInhere();
		
		System.out.println(obja.name);
        obja.mathsd();
	}

}
