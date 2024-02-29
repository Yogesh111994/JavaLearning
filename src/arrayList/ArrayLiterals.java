package arrayList;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		// with new keyword:
		// when you are not sure about the values
		System.out.println("--------------------------------");
		int i[] = new int[10]; // Range: 0-9
		System.out.println(i);
		System.out.println("--------------------------------");
		// array literals: when you are already having the values
		// int array:
		
		int num[] = {2,5,7,9,11,13}; // Range: 0-5
		System.out.println(num[2]); // 7
		System.out.println(num[3]); // 9
		System.out.println(Arrays.toString(num));
		System.out.println("--------------------------------");
		for(int e: num) {
			System.out.println(e);
		}
		System.out.println("--------------------------------");
		String name[] = {"yogesh","somesh","mangesh"};
		for(String s: name) {
			System.out.println(s);
		}
		System.out.println("--------------------------------");
		Object empInfo[] = {"yogesh",28,'m',30,};
		for(Object o: empInfo) {
			System.out.println(o);
		}
		System.out.println("--------------------------------");
		int number[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int n=number.length-1;n>=0;n--) {
			System.out.println(number[n]);
		}
		
		

	}

}
