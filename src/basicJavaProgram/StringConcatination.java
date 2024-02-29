package basicJavaProgram;

public class StringConcatination {

	public static void main(String[] args) {
		
		String s ="Hi my name is yogesh";
		String s1 = "100";
		
		String x = "Hello";
		String y = "Selenium";
		
		int a = 100;
		int b = 200;
		
		double c = 12.33;
		double d = 22.22;
		
		
		System.out.println(x+y);
		// HelloSelenium
		
		System.out.println(s+s1);
		// Hi my name is yogesh100
		
		System.out.println(a+x+b);
		// 100Hello200
		
		System.out.println(x+y+a+b);
		// HelloSelenium100200
		
		System.out.println(x+y+(a+b));
		// HelloSelenium300
		
		System.out.println(a+b+x+y+a+b);
		// 300HelloSelenium100200
		
		System.out.println(c+d+x+y);
		// 34.55HelloSelenium
		
		System.out.println(a+b+c+d+x+y);
		// 334.54999999999995HelloSelenium
		
		System.out.println("the value of a : "+ a);
		// the value of a : 100
		System.out.println("the value of b : "+ b);
		// the value of b : 200
		System.out.println("the sum of : "+ (a+b));
		// the sum of : 300
		
		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1);
		// a
		System.out.println((byte)c1);
		// 97
		System.out.println(c1+c2);
		// 195
		System.out.println(c1+1);
		// 98
		System.out.println(c1+"1");
		// a1
		System.out.println(c1+c1+x+y);
		// 195HelloSelenium
		System.out.println(c1+""+c2);
		// ab
		System.out.println("c1"+"c2");
		// c1c2
		
		
		
		
		
		
		
		

	}

}
