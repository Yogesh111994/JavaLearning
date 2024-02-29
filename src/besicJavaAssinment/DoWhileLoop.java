package besicJavaAssinment;

public class DoWhileLoop {

	public static void main(String[] args) {

		// 1.  WAP to print 10 to 1 using for, while and do-while loop

		int i = 10;
		do {
			System.out.println(i);
			--i;
		}
		while(i>0);
		
		// 2. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
		
		int p = 5;
		int b = 1;
		
		do {
			System.out.println(p+" X "+b+" = "+p*b);
			b++;
		}
		while(b<=100);
	}

}
