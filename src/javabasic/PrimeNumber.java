package javabasic;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =20;
		boolean  isPrime;
		for(int i = 1;i<=number;i++) {
			isPrime =true;
			for(int j =2; j <=i/2;j++) {
				if (i%j == 0) {
					isPrime =false;
				}
			}
			if (isPrime) {
				
				System.out.println(i);
			}else {
				System.out.println("not prime" + i);

			}
		}
		
	}

}
