package basicJavaProgram;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		
		// Post Increment
		int a = 1;
		int b = a++;
		System.out.println(a); // 2
		System.out.println(b); // 1
		
		int c = 10;
		int d = c++;
		System.out.println(c); // 11
		System.out.println(d); // 10
		
		int d1 = -99;  // 98
		int d2 = d1++; //-99
		System.out.println(d1);
		System.out.println(d2);
		
		// Pre Increment
		int h1 = 1;  // 2
		int h2 = ++h1; //2
		System.out.println(h1);
		System.out.println(h2);
		
		int j1 = -999; // 998
		int j2 = ++j1; // 998
		System.out.println(j1);
		System.out.println(j2);
		
		
		// Post Decrement
		int t1 = 2;  // 1
		int t2 = t1--; // 2
	    System.out.println(t1);
	    System.out.println(t2);
		
	    //Pre decrement
	    int u1 = 2; // 1
	    int u2 = --u1; //1
	    System.out.println(u1);
	    System.out.println(u2);
	    
	    int pop = 1;
	    System.out.println(pop++);
	    System.out.println(pop);
	    
	    
		
		
		
		

		
		
		

	}

}
