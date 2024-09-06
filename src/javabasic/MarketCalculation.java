package javabasic;

public class MarketCalculation {
static int a=5;
	
	
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MarketCalculation mc = new MarketCalculation();
		
		String vegetablName1 = "tomato";
		String vegetableName2 = "brinjal";
		String vegetableName3="lady finger";

    System.out.println(a);
		int tomatoPrice=90;
		int brinjalPrice=60;
		int ladyFingerPrice=70;
		int total=tomatoPrice+brinjalPrice+ladyFingerPrice;
		double discount = 10;
		double discountPrice = ( discount /100)*total;
		double sellingPrice = total - discountPrice;
System.out.println(vegetablName1  +" = "+ tomatoPrice);
System.out.println(vegetableName2 +" = "+  brinjalPrice);
System.out.println(vegetableName3 +" = "+  ladyFingerPrice);
System.out.println("total = "+total );
System.out.println("sellingPrice = " +sellingPrice);

	}

}