package javabasic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExamClass1 {

	public static void main(String[] args) {
		String[] cars = {
				"bmw","homda","ferrir2","toyata","ferari"
					};
	
//	for (String string : cars) {
//		if (("toyata"  != string) && ("ferari"  != string) ) {
//			System.out.println(string);
//		}
//	}
		
		
	Arrays.stream(cars).forEach(car -> System.out.println(car));
		//System.out.println(cars[2]);
		
	}
	
	
	}
