package javabasic;

//the inheritance attributes and methods from one class to another .
/*single,multilevel,hierarchical,multiple,hybrid
 * multiple  not support but used interfaces class
 * mainly used to reduce the repatation of code
 */
 
      
class FourWheeler  {

	String modeName ="Ford";
 String modelName() {
	return modeName;
      }
   }



class InheritanceClass extends FourWheeler{
	
	String modelName1 ="BMW";
 	 String mode() {
		return modelName1;
		
	 }
 	 
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewCar myCar = new NewCar();
		
		myCar.modelName();
		System.out.println(myCar.modelName());
		
		myCar.mode();
		System.out.println(myCar.mode());
		
		myCar.modes();
		System.out.println(myCar.modes());
	}
  }
class NewCar extends InheritanceClass{
	
	String modelName2 ="fortuner";
	 String modes() {
		return modelName2;
		
}
 
	
	

}	



		
	


