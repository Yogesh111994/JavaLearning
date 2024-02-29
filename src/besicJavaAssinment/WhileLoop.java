package besicJavaAssinment;

public class WhileLoop {

	public static void main(String[] args) {

		// 1. WAP to print 10 to 1 using for, while and do-while loop

		int i = 10;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
		System.out.println("--------------------------------");
		// 2. Write a program in Java to print "Hello World" ten times using while loop
		int a = 10;
		while (a > 0) {
			System.out.println("hello World");
			a--;
		}
		System.out.println("-------------------------");
		// 3. Write a program in Java to print all the multiplication of 5 from 1 to 100
		// using while /for/do-while loop

		int p = 5;
		int b = 1;
		while (b <= 100) {
			System.out.println(p + " X " + b + " = " + p * b);
			b++;
		}
		System.out.println("-------------------------");
		// 5. Print A-Z , a-z, 0-9 with the respective ASCII numbers the console one
		// using while and for loop
		char m = 'A';
		char n = 'a';
		char o = '0';
		char q = 'Z';
		char r = 'z';
		char s = '9';
		
		while(m<=q) {
			System.out.println("ASCII value of " + m + ":" + (int) m);
			m++;
		}
		System.out.println("-------------------------");
		while(n<=r) {
			System.out.println("ASCII value of " + n + ":" + (int) n);
			n++;
		}
		System.out.println("-------------------------");
		while(o<=s) {
			System.out.println("ASCII value of " + o + ":" + (int) o);
			o++;
		}
		System.out.println("-------------------------");

		// Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		char c = 'a';
		char d = 'z';
		while(c<=d) {
			if(c == 'a' || c == 'e' || c == 'i' || c =='o' || c =='u' ) {
				System.out.println("vowels : "+c );
				c++;
			}
		}
	}

}
