package javabasic;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = {1,2,3,4,5};
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}

		
		
for (Integer print : array) {
			System.out.println(print);
		}
		
		
	}
}

