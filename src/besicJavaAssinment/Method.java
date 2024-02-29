package besicJavaAssinment;

public class Method {
	int a = 5;
	int b = 4;
	double d1 = 2.5;
	double d2 = 5.4;

	// 1.Write a program to print the addition/subtraction/division/multiplication
	// of two numbers entered by user by defining your own method
	public void addition() {
		System.out.println(a + b);
	}

	public void subtraction() {
		System.out.println(a - b);
	}

	public void multiplication() {
		System.out.println(a * b);
	}

	public void division() {
		double aa = a / b;
		System.out.println(aa);
		// System.out.println(a/b);
	}

	// 2. Define a method that returns the product of two double numbers entered by
	// user.
	public void doubleMultiplication() {
		System.out.println(d1 / d2);
	}
	// 3.Write a program to print the circumference and area of a circle of radius
	// entered by user by defining your own method.

	public double circumferencer(int r) {

		double area = Math.PI * 2 * r;
		System.out.println("Circumference of circle: " + area);
		return area;
	}

	// 4. Define two methods to print the maximum and the minimum number
	// respectively among three numbers entered by user.

	public void maxNumber(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("max number is a: " + a);
		} else if (b > a && b > c) {
			System.out.println("max number is a: " + b);
		} else {
			System.out.println("max number is c: " + c);
		}
	}

	public void minNumber(int a, int b, int c) {
		if (a < b && a < c) {
			System.out.println("max number is a: " + a);
		} else if (b < a && b < c) {
			System.out.println("max number is a: " + b);
		} else {
			System.out.println("max number is c: " + c);
		}
	}

	// 6. A person is eligible to vote if his/her age is greater than or equal to
	// 18.
	//  Define a method to find out if he/she is eligible to﻿ vote. - return
	// true/false

	public boolean eligibleToVote(int age) {

		boolean flag = true;
		if (age >= 18) {
			System.out.println("Person is eligible to vote");
		} else {
			System.out.println("Person is" + "\" Not\"" + "eligible to vote");
			flag = false;
		}
		return flag;
	}

	/*
	 * 7. Write a program which will ask the user to enter his/her marks (out of
	 * 100). Define a method that will display grades according to the marks entered
	 * as below:
	 */

	public void displayGrade(float marks) {

		if (marks >= 91 && marks <= 100) {
			System.out.println("Your grade is AA: " + marks);
		} else if (marks >= 81 && marks <= 90) {
			System.out.println("Your grade is BB: " + marks);
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("Your grade is CC: " + marks);
		} else if (marks >= 61 && marks <= 70) {
			System.out.println("Your grade is DD: " + marks);
		} else if (marks >= 51 && marks <= 60) {
			System.out.println("Your grade is EE: " + marks);
		} else if (marks >= 41 && marks <= 50) {
			System.out.println("Your grade is FF: " + marks);
		} else if (marks <= 40 && marks >= 0) {
			System.out.println("Your are fail: " + marks);
		} else if (marks > 100) {
			System.out.println("Please enter the right number: " + marks);
		} else {
			System.out.println("Please enter the correct marks: " + marks);
		}
	}

	public void factorialNumber(float n) {
	
		 if (n == 0 || n == 1 || n == 2) {
				System.out.println("factorial of " + n + ": 1");
			}
		 float store = 1;
		 float factorial =0;
			while (n>1) {
				
				 factorial =store* n;
				store = factorial;
				n--;		
		 }	
			System.out.println("factorial of " + n + ": " + factorial);
	}
	

	public static void main(String[] args) {

		Method m = new Method();
		m.addition(); // 9
		m.subtraction(); // 1
		m.multiplication(); // 20
		m.division(); // 1.0
		m.doubleMultiplication(); // 0.4629629629629629
		System.out.println("----------------------------------------");
		m.circumferencer(3);
		System.out.println("----------------------------------------");
		m.maxNumber(12, 34, 25);
		m.minNumber(25, 35, 20);
		System.out.println("----------------------------------------");
		m.eligibleToVote(20);
		System.out.println("----------------------------------------");
		m.displayGrade(91);
		System.out.println("----------------------------------------");
		m.factorialNumber(5F);
	}

}
