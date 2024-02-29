package besicJavaAssinment;

public class IncrementDecrementOperator {

	public static void main(String[] args) {

		// 2.
		int a=11, b=22, c;
		// a : 11 : 12 : 13
		// b : 22 : 23 : 24
		// c :

		c = a + b + a++ + b++ + ++a + ++b;
		c = 11 + 22 + 11 + 22 + 13 + 24;

		System.out.println("a="+a); // 13
		System.out.println("b="+b); // 24
		System.out.println("c="+c); // 103

		// 1.
		int j = 11;
		// j : 12 : 13
		j = j++ + ++j;
		j = 11 + 13;

		System.out.println(j); //24

		// 3.
		int i =0;
		// i : 1 : 0 : 1 : 0
		i = i++ - --i + ++i - i--;
		i = 0 - 0 + 1 - 1;
	    System.out.println(i); // 0
	    
	    // 4.  Is the below program written correctly?
//	    boolean bb = true;
//	    bb++;
//	    System.out.println(bb);
	    
	    // 5.
	    int f=1, g=2, h=3;
	    // f : 1 : 0
	    // g : 2 : 1
	    // h : 3 : 2
	    
	    int m = f-- - g-- - h--;
	    m = 1 - 2 -3;
	    System.out.println("i="+f); // 0
	    System.out.println("j="+g); // 1
	    System.out.println("k="+h); // 2
	    System.out.println("m="+m); // -4
	    
	    // 6.
	   	int aa=1, bb=2;
	    // aa : 1 : 2 : 1
	    // bb : 2 : 1 : 2

	    System.out.println(--bb - ++aa + ++bb - --aa);
	    System.out.println(1 - 2 + 2 - 1); // 0
	    
	    // 7.
	    int p=19, q=29, r=0;
	    int s = p-- - q-- - r--;
	    // p : 19 : 18
	    // q : 29 : 28
	    // r : 0 : -1
	    s = 19 - 29 - 0; 
	    System.out.println("i="+p); // 18
	    System.out.println("j="+q); // 28
	    System.out.println("k="+r); // -1
	    System.out.println("s="+s); // -10
	    
	    // 8. What is wrong with the below program? Why it is showing compilation error?
//	    int ii = 11;
//	    int jj = --(ii++); Invalid argument to operation ++/--
	    
	    // 9. 
	    int mm = 0, n = 0;
	    // mm : 0 : -1 : -2
	    // n : 0 : -1 : -2
	    int pp = --mm * --n * n-- * mm--;
	    pp = -1 * -1 * -1 * -1;
	    System.out.println(pp); // 1
	    System.out.println(mm); // -2
	    System.out.println(n); // -2
	    
	    // 10.
	    int ab=1;
	    // ab : 1 : 2 : 3 : 2 : 1
	    ab = ab++ + ++ab * --ab - ab--;
	    ab = 1 + 3 * 2 - 2;
	    System.out.println(ab); // 5
	    
	    // 11.
//	    int v = 11++; Invalid argument to operation ++/--
	    
	    // 12. 
	    int ch = 'A';
	    System.out.println(ch++); // 65
	    
	    // 13.
	    char ch1 = 'A';      
        System.out.println(++ch1); // B
        
        // 14.
        double d = 1.5, D = 2.5;
        // d : 1.5 : 2.5
        // D : 2.5 : 3.5
        System.out.println(d++ + ++D); // 5.0
        System.out.println(1.5 + 3.5); // 5.0
        
        
        

	}

}
