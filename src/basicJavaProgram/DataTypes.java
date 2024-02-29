package basicJavaProgram;

public class DataTypes {

	public static void main(String args[]) {
		
		// Data type: Types of data
		// Primitive data types: you don't any object/reference
		// Non- Primitive data types: Need object/ reference
		// array, class, interface, object and string
		
		// Primitive
		// 1.Boolean type: true/false
		// 2.Numeric type:
		   // 2.a Character: char
		   // 2.b Integral type: 
		         // integer: byte,short,int,long
		         // Floating: Float,double

		
		//1. byte:
		//size 1byte= 8bit
		//Range of byte= -128 to 127	
		byte a = 10;
		a = 20;
		a = 30;
		byte b = 40;
		System.out.println(a);
		System.out.println(b);
		
		// 2.short:
		// Size 2 byte= 16 bit
		// Range= -32768 to 32767 2^15 to 2^15-1
		short aa= 1000;
		short c= 12122;
		System.out.println(aa);
		System.out.println(c);
		
		// 3. int :
		// size 4 byte= 32 bit
		// Range of int= -2147483648 to 2147483647 2^31 to 2^31-1
		int d= 343657;
		int e= 673465324;
		System.out.println(d);
		System.out.println(e);
		
		// 4. long:
		// size 8 byte= 64 bit
		// Range= 2^63 to 2^63-1
		long f= 3624547643456l;
		long g= 435634658353563734l;
		System.out.println(f);
		System.out.println(g);
		
		// 5. float:
		// size 4 byte= 32 bit
		// Range= 2^31 to 2^31-1
		float h=356f;
		float i= 53245.3453376f;
		float j= (float)46646.5656;
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		
		// 6. double:
		// size 8 byte= 64 bit
		// Range= 2^63 to 2^63-1
		double k= 4353653554366.5483564865478969;
		double l= 3214326546325547.743853578353863583453757d;
		System.out.println(k);
		System.out.println(l);
		
		// 7. Char:
		// size 2 byte= 16 bit
		// Unicode: special+language char+ ASCII
		char m='a'; //a-z=97-122
		char n='A'; //A-Z= 65-90
		char o='0'; //0-9= 48-57
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		// Boolean: True/false: literals
		// size: ~1 bit
		// range: true/false
		boolean flag= true;
		System.out.println(flag);
		
		
		
 

	}
}
