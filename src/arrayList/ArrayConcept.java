package arrayList;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		// Array: collection of similar types of data:
		// limitations:
		// 1. size is fixed: static array: to overcome this, we use dynamic array
		// (ArrayList)
		// 2. can store only similar types of data

		// using new key word

		int i[] = new int[4]; // Array range start from zero so range would be 0-3
		i[0] = 2;
		i[1] = 3;
		i[2] = 7;
		i[3] = 5;
		// i[4] = 11; //AIOB
		System.out.println(Arrays.toString(i));
		System.out.println(i[2]);
		System.out.println(i[0] + i[3]);

		// fetch/print all the values of array: use for loop:
		// System.out.println(i);//garbage / memory address of the array
		
		for(int a=0; a<i.length; a++)
		{
			System.out.println(i[a]);
			if(i[a] == 7) {
				break;
			}
		}
		
		int pop[] = new int[3];
		pop [0] = 20;
		pop [1] = 30;
		pop [2] = 40;
		System.out.println(Arrays.toString(pop));
		
		
		 

	}

}
