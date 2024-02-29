package basicJavaProgram;

public class MathematiclOperator {

	public static void main(String[] args) {
		
		System.out.println(10/2);    // 5
		System.out.println(9/2);     // 4
		System.out.println(9/2.0);   // 4.5
		System.out.println(9.0/2);   // 4.5
		System.out.println(9.0/2.0); // 4.5
		
		System.out.println(0/9); //0
//		System.out.println(9/0); // JavaArithmeticException
		
		System.out.println(9.0/0); // Infinity
//		System.out.println(0/0);   java.lang.ArithmeticException
		System.out.println(9/0.0); // Infinity
		System.out.println(0/0.0); // NaN
		System.out.println(0.0/0); // NaN
		
		System.out.println(10.3/0); // Infinity
		System.out.println(10/0.0); // Infinity
		
		System.out.println('a'/2); // 48
//		System.out.println('a'/0); // JavaArithmeticException
		
		System.out.println('a'/2+100); //148
		System.out.println(10 % 2); // 0
		System.out.println(9 % 2);  // 1
		System.out.println(100 % 3); // 1
		System.out.println(10 % 3); // 1
		

	}

}
