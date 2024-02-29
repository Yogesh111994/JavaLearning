package besicJavaAssinment;

public class IfElseIf {

	public static void main(String[] args) {
		
		// Find out the greatest number out of four different given numbers:
		int a = 25;
		int b = 78;
		int c = 87;
		int d = 97;
		if(a>b && a>c && a>d) {
			System.out.println("The greatest﻿ : "+a);
		}
		else if(b>c && b>d) {
			System.out.println("The greatest﻿ : "+b);
		}
		else if(c>d) {
			System.out.println("The greatest﻿ : "+c);
		}
		else {
			System.out.println("The greatest﻿ : "+d);
		}
		
		//  Write a Java program to test a number is positive or negative.
		int num = 35;
		int num1 = -11;
		if(num> 0) {
			System.out.println("Positive number: "+num);
		}
		else {
			System.out.println("Negative number: "+num);
		}
		if(num1> 0) {
			System.out.println("Positive number: "+num1);
		}
		else {
			System.out.println("Negative number: "+num1);
		}
		System.out.println("---------------------");
		//WAP to check number is odd or even using If - Else
		
		int n[] = {2,3,4,5,6,7,8,9,10};
		for(int i=0; i<=n.length-1;i++) {
			if(n[i] % 2 == 0) {
				System.out.println("Even number : "+n[i]);
			}
			else {
				System.out.println("Odd number : "+n[i]);
			}
		}


		
		
		
		
		
		
		
		
	}

}
