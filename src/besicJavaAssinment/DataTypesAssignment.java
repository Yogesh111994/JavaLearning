package besicJavaAssinment;

public class DataTypesAssignment {

	public static void main(String[] args) {

		// 1.  Write a Java program to add two strings:

		String a = "Hello";
		String b = "Yogesh Biradar";
		System.out.println(a+" "+b); // Hello Yogesh Biradar

		// 2.  Write a Java program to print the sum of two numbers.
		byte a1 = 74;
		byte b1 = 36;
		System.out.println("The sum of: "+(a1+b1)); // The sum of: 110

		// 3.  Write a Java program to print the division of two numbers.
		byte c= 50;
		byte d= 3;
		System.out.println(c/d); // 16

		// 4.
		float m = 25.5f;
		float n = 3.5f;
		float o = 40.5f;
		float p = 4.5f;
		double z = ((m*n-n*n)/(o-p));
		System.out.println(z); // 2.1388888359069824

		// 5.  Try to concat "Hello Selenium" with a character 't'.
		String s = "Hello Selenium";
		char ch = 't';
		System.out.println(s+ch); // Hello Seleniumt
		
		// 6.  Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String
		int s1 = 100;
		int s2 = 200;
		int s3 = 3400;
		String str = "Your Total  amount is.";
		String add = str+(s1+s2+s3)+"." ;
		System.out.println(add); // Your Total  amount is.3700.
		
		// 7.
		char ch1 = 'h';
		System.out.println((byte)ch1); // 104
		
		// 8.
		byte bb = 3;
		char ch2 = 'd';
		char addition = (char)(bb+ch2);
		System.out.println(addition); //g
		
		// 9. Write a program to find the square of the number 3.9.
		float f = 3.9f;
		System.out.println(f*f); // 15.210001









	}

}
