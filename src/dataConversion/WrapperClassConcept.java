package dataConversion;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20);

		// String to Int : Integer
		int y = Integer.parseInt(x);
		System.out.println(y + 20);

		// String to double : Double
		String aa = "12.44";
		double bb = Double.parseDouble(aa);
		System.out.println(bb + 20);

		// String to boolean : Boolean
		String remoteExcution = "true";
		Boolean flag = Boolean.parseBoolean(remoteExcution);

		if (flag) {
			System.out.println("run my test cases on cloud");
		} else {
			System.out.println("run on my local machine");
		}

		// int to string: String
		int age = 30;
		String ageVal = String.valueOf(age);
		System.out.println(ageVal + 20);

		// Double to string : String.valueOf()
		double sal = 33.33;
		String salary = String.valueOf(sal);
		System.out.println(salary.length());

		// Character string format can not be converted into integer
		//
		//		  String a = "100 test"; 
		//		  int ab=Integer.parseInt(a);
		//		  System.out.println(ab+20);  //NumberFormatException

		// Byte
		System.out.println("-------------------------------");
		System.out.println("Byte max: "+Byte.MAX_VALUE);
		System.out.println("Byte Min: "+Byte.MIN_VALUE);
		// Short
		System.out.println("-------------------------------");
		System.out.println("Short max: "+Short.MAX_VALUE);
		System.out.println("Short min: "+Short.MIN_VALUE);
		// int
		System.out.println("-------------------------------");
		System.out.println("int max: "+Integer.MAX_VALUE);
		System.out.println("int min: "+Integer.MIN_VALUE);
		// long
		System.out.println("-------------------------------");
		System.out.println("long max: "+Long.MAX_VALUE);
		System.out.println("long min: "+ Long.MIN_VALUE);
		// float
		System.out.println("-------------------------------");
		System.out.println("float max: "+Float.MAX_VALUE);
		System.out.println("Float min: "+Float.MIN_VALUE);
		// Double
		System.out.println("-------------------------------");
		System.out.println("double max: "+Double.MAX_VALUE);
		System.out.println("double min: "+Double.MIN_VALUE);
		// Char
		System.out.println("-------------------------------");
		System.out.println(" char max: "+Character.MIN_VALUE);
		System.out.println("char min: "+Character.MAX_VALUE);
	}

}
