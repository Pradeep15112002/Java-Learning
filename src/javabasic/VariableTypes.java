package javabasic;

public class VariableTypes {
//instantvariable
	int w=4;
	static int r=9;
	
	 public  void localVariableDeclaration() {
		//localvariable
	 int a=1;
		
		r=7;
		
	}
	                            //modifier datatype methodname
	public int returnValue() {
		int a =12;
		return a;
	}
	
	
	public static void main(String[] args) {	
		VariableTypes vt = new VariableTypes();	
		vt.w=6;
		vt.r=9;
		
		System.out.println(vt.w);
        System.out.println(VariableTypes.r);
        
        
        VariableTypes vt1 = new VariableTypes();	
                                                                   //normal method called
        vt1.w =5;
        vt1.r=10;
        System.out.println(vt1.w);
        System.out.println(vt1.r);
        
        
//        
                                                           //      return method called    
   System.out.println(vt.returnValue());
//        
	}
	
	
	
	

}
