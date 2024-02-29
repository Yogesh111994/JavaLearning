package besicJavaAssinment;

public class ForLoop {

	public static void main(String[] args) {
		// 1.
		for (int i = 0; i <= 5; i++) {
			System.out.println("I am Batman");
		}
		System.out.println("----------------------");

		// 2.
		for (int i = 1; i < 10; i++) {
			System.out.println("I am Batman " + i);
		}
		System.out.println("----------------------");

		// 3. Write a program in Java to print all the multiplication of 5 from 1 to 100
		// using while /for/do-while loop

		int i = 5;
		for (int a = 1; a <= 100; a++) {
			System.out.println(i + " X " + a + " = " + i * a);
		}

		// 4. Print all odd and even numbers between 1 to 100

		for (int ab = 0; ab <= 100; ab++) {
			if (ab % 2 == 0) {
				System.out.println("Even number : " + ab);
			} else {
				System.out.println("Odd number : " + ab);
			}
		}

		// 5. Print A-Z , a-z, 0-9 with the respective ASCII numbers the console one
		// using while and for loop
		char m = 'A';
		char n = 'a';
		char o = '0';
		char q = 'Z';
		char r = 'z';
		char s = '9';
		System.out.println("ASCII Value of A : " + (int) m);
		System.out.println("ASCII Value of a : " + (int) n);
		System.out.println("ASCII Value of Zero : " + (int) o);

		for (char ch = m; ch <= q; ch++) {
			System.out.println("ASCII value of " + ch + ":" + (int) ch);
		}
		System.out.println("--------------------------------");
		for (char ch = n; ch <= r; ch++) {
			System.out.println("ASCII value of " + ch + ":" + (int) ch);
		}
		System.out.println("--------------------------------");
		for (char ch = o; ch <= s; ch++) {
			System.out.println("ASCII value of " + ch + ":" + (int) ch);
		}
	
		// 9. Print the following series: 
		//1.0 2.0 3.0  ...... 10.0 
		//0 9 18 27 36 …99 
		System.out.println("--------------------------------");
		for(float f=1; f<=10; f++) {
			System.out.print(f+",");
	
		}
		System.out.println();
		System.out.println("--------------------------------");
		
		for(int z=0; z<=100;z++) {
			if(z % 9 == 0) {
				System.out.print(z+",");
			}
		}
		System.out.println();
		System.out.println("--------------------------------");
		
		// Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		
		for(char chh='a';chh<='z';chh++) {
			if(chh == 'a' || chh == 'e' || chh == 'i' || chh =='o' || chh =='u' ) {
				System.out.println("vowels : "+chh );
			}
		}
		System.out.println("--------------------------------");
		
		// Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow"
		for(int aa=1; aa<=10; aa++) {
			System.out.println(aa);
			if(aa % 7 == 0) {
				System.out.println("bye, see you tomorrow");
				break;
			}
			
		}
		// Reverse the array user dynamic for loop
		int aa[] = {1,2,3,4,5};
		int count = aa.length-1;//4
		for(@SuppressWarnings("unused") int ac : aa) {
			ac=count;
			System.out.println(aa[count]);
			count--;
		}
		

	}

}
