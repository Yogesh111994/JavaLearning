package besicJavaAssinment;

import java.lang.reflect.Array;

public class Arrays {

	public static void main(String[] args) {

		/* Q1:  WAP to delete a specific number from the given array.
		        int p[] = {1,4,5,2,3,22,31, 2}; 
		        --Need to remove 22 from the p[] array.
		        --output should be: [1, 4, 5, 2, 3, 31, 2] */

		int p[] = {1,4,5,2,3,22,31,2};
		int l = p.length;
		for(int i=0; i<l;i++)
		{
			if(p[i] != 22) {
				System.out.print(p[i]+",");
			}

		}
		System.out.println();
		System.out.println("-------------------------");
		// 3. The code creates a new integer array a with length one less than the length of p.
		for(int i=0; i<l-1;i++)
		{
			if(p[i] != 22) {
				System.out.print(p[i]+",");
			}

		}
		System.out.println();

		//		 Q2: Write a program to create a static Array, having following cricket data:
		////			        --name, age, team name, DOB, gender, Strike Rate
		////			        --Try to create multiple Object Arrays for different players 
		////			        --Try to print all the values of each player on the console

		Object arr[] = new Object[6];
		arr[0] = "rohit";
		arr[1] = 38;
		arr[2] = 1982;
		arr[3] = 'm';
		arr[4] = 140;
		arr[5] ="India";
		
		for(Object a : arr) {
			System.out.println(a);
		}
		System.out.println("-------------------------");
		
		Object ar[] = new Object[6];
		ar[0] = "virat";
		ar[1] = 36;
		ar[2] = 1984;
		ar[3] = 'm';
		ar[4] = 150;
		ar[5] ="India";		
		for(Object a : ar) {
			System.out.println(a);
		}
		System.out.println("-------------------------");


	}




}
