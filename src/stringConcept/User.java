package stringConcept;

public class User {

	public static void main(String[] args) {
		
		//String: is a class
		
		//1. using literals:
		String s2 = "Selenium"; //1
		
		//2. using new keyword
		String s1 = new String("Hello"); // Two object will be created one is in heap area and other is in String constant pool area.
		
		String s3 = "Hello"; // Single object will be created
		String s4 = new String("Hello"); // Single object will be created that to in heap area. SCP can not have duplicate value.
		
		System.out.println(s1==s3); // (==) Compared with Object reference variable. // False
		System.out.println(s1.equals(s3)); // (.equals) method compared variable value. // True
		System.out.println(s1==s4); // false
		System.out.println(s1.equals(s4)); // true
		
		String s5 = "Hello"; // Zero object will be created.
		System.out.println(s3==s5); // As SCP can not have duplicate value so s3 value is give to s5
		
		String s6 = "hello"; // 1 object
		
		String s7 = new String("Yogesh"); // 2 object
		String s8 =s7.intern();
		System.out.println(s7==s8);
		
		String str = "Java";
		System.out.println(str);
		System.out.println(str+" With selenium");
		System.out.println(str);
		
		System.out.println(str+ 100);
		System.out.println(str+ 200);
		System.out.println(str);
		
		StringBuilder sb= new StringBuilder("Testing");
		System.out.println(sb.append(" Automation"));
		System.out.println(sb);

	}

}
