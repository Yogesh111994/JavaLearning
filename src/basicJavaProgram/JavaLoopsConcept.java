package basicJavaProgram;

public class JavaLoopsConcept {

	public static void main(String[] args) {

		// 1. while loop
		// print 1 to 10

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
			// ++i
			// i = i+1;
		}
		System.out.println("-------------------");

		int j = 1;
		while (j <= 50) {
			System.out.println(j);
			if ((j % 5) == 0) {
				System.out.println("hi");
				break;
			}
			j++;
		}

		// When to use while loop: use cases
		// When number iteration is not fixed
		// Waiting for web element on the page
		// Waiting for page loading
		// linkedin/faebook/swiggy/zomato infinie scrilling
		// Payment: Waiting for confirmation alert
		// paginatin
		// Calender

		System.out.println("-----------------------------------------------");

		// 2. for loop
		// print 1 to 10

		int a;
		for (a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		System.out.println("-----------------------------------------------");

		// Print odd number till 10

		for (a = 1; a <= 10;) {
			System.out.println(a);
			a = a + 2;
		}
		System.out.println("-----------------------------------------------");

		// byte number
		for (byte b = 1; b <= 5; b++) {
			System.out.println(b);
		}
		System.out.println("-----------------------------------------------");

		// floating number
		for (float c = 1.1f; c <= 5.5; c++) {
			System.out.println(c); // 1.1 2.1 ...... 5.1
		}
		System.out.println("-----------------------------------------------");

		//

		// a-z:97-122
		// a = 97
		// b = 98
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + " = " + (byte) ch);
		}
		System.out.println("-----------------------------------------------");

		for (;;) {
			System.out.println("welcome to Hotel Taj");
			break;
		}
		System.out.println("-----------------------------------------------");

		// for loop use cases:
		// when number of iterations are already fixed:
		// Arrays
		// drop down: month: 12 -->
		// menu items:
		// read excel sheet: 10 rows: for loop

		// How to give inverted comma("") in printing statement

		System.out.println("I love \"java\" coding");

		// For...break

		for (int n = 1; n <= 50; n++) {
			System.out.println(n);
			if (n % 5 == 0) {
				System.out.println("bye");
			}

		}
		for (int n = 1; n <= 50; n++) {
			if (n % 2 == 0) {
				System.out.println("Even No. : " + n);
			} else {
				System.out.println("Odd N0. :" + n);
			}
		}

		// Do while

		int s = 1;
		do {
			System.out.println(s);
			s++;
		} while (s <= 10);

		// use cases:
		// when number of iterations are not fixed
		// web Page: link: 10 secs to be loaded -->
		// 1st: 0 sec: link is available: no need to go the loop part - click on it
		// 2nd: 2 4 6 8
		
		System.out.println("---------------");
		
		int l = 10;
		while(l >= 1) {
			System.out.println(l);
			l--;
		}
		
		boolean flag = false;
		while(flag) {
			System.out.println("Hi Yogesh Biradar");
		}
		do {
			System.out.println("Hi Yogesh Biradar");
		}
		while(flag);
	}

}
