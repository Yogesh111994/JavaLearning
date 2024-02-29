package stringConcept;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "Hi this is my java code im so happy";
		System.out.println( str.length());
		System.out.println("Least index: "+0);
		System.out.println("Highest index: "+ str.length());
		System.out.println("--------------------------");
		// indexOff
		System.out.println(str.indexOf("i")); //2  1st occurrence of i
		System.out.println(str.indexOf("H"));
		System.out.println(str.indexOf("i",str.indexOf("i")+1));// 5  second occurrence of i
		System.out.println(str.indexOf("i",str.indexOf("i",str.indexOf("i")+1)+1)); //8
		System.out.println(str.indexOf("i",str.indexOf("i",str.indexOf("i",str.indexOf("i")+1)+1)+1)); // 24
		System.out.println("-------");
		System.out.println(str.indexOf("java")); // 14
		System.out.println("----------");
		System.out.println(str.indexOf("Yogesh")); // 0 If the value is not present in string then it give int default value which is zero.
		System.out.println("--------------------------");
		// charAt()
		System.out.println(str.charAt(0)); //H
		// System.out.println(str.charAt(40)); // String out of bound exception
		//	System.out.println(str.charAt(-1));
		System.out.println("--------------------------");
		String msg = "Welcome Null";
		if(msg.indexOf("admin") !=  -1) {
			System.out.println("Admin is here");
		}
		else {
			System.out.println("fail");
		}
		System.out.println("--------------------------");
		// trim
		String tr = "             hello             yogesh               ";
		System.out.println(tr.trim()); //hello             yogesh
		System.out.println("--------------------------");
		// replace
		String dob = "30-11-1194";
		System.out.println(dob.replace("-", "/"));  //30/11/1994
		String tr2 = "             hello             yogesh               ";
		System.out.println(tr2.replace(" ", "")); //helloyogesh
		System.out.println("--------------------------");
		// toLower and toUpper
		String name = "Yogesh Biradar";
		System.out.println(name.toLowerCase()); // yogesh biradar
		System.out.println(name.toUpperCase()); // YOGESH BIRADAR

		System.out.println("-----------");

		// equalsIgnoreCase()
		String l1 = "Hello Selenium";
		String l2 = "Hello selenium";

		System.out.println(l1==l2); // false
		System.out.println(l1.equalsIgnoreCase(l2)); //  true
		System.out.println("--------------------------");
		// contains()

		String m1 = "This is java language";
		System.out.println(m1.contains("java")); //true
		System.out.println("--------------------------");
		// sub-String

		String loop ="Your order id is 1234";
		System.out.println(loop.substring(7));
		System.out.println(loop.substring(5, 10));
		System.out.println(loop.substring(loop.indexOf("is")+3));
		System.out.println("--------------------------");
		// split()
		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		String a[] = (lang.split("_"));
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println("----------------");
		System.out.println("--------------------------");
		String pop = "xXHelloSeleniumxXXTestingXxXAutomationXXxXJava";
		String ab[]=pop.split("xX");
		System.out.println(ab[0]); // blank-empty - nothing
		System.out.println(ab[1]); // HelloSelenium
		System.out.println(ab[2]);
		System.out.println(ab[3]);
		System.out.println(ab[4]);
		//	System.out.println(ab[5]); // AIOB
		System.out.println("--------------------------");
		String empInfo = "Ravi;Sharma;IBM;Pune;India;QA";
		String emp[]= empInfo.split(";");
		System.out.println(emp[0]);
		System.out.println(emp[1]);
		System.out.println(emp[2]);
		System.out.println(emp[3]);
		System.out.println(emp[4]);
		System.out.println(emp[5]);
		
		System.out.println("--------------------------");
		String domain ="test.automation.python.java";
		String dm[] =domain.split("\\.");
		System.out.println(dm[0]);
		
		System.out.println("--------------------------");
		String data ="test|automation|python|java";
		String dma[] =data.split("\\|");
		System.out.println(dma[2]);
		
		System.out.println("--------------------------");
		String st = "I love java coding";
		System.out.println("i love\" java\" cloding");
		
		System.out.println("--------------------------");
		// xpath method
		String xpathName=xpath("pooja");
		System.out.println(xpathName);

	}
	public static String xpath(String name) {
		
		String xpath = "//input[@name='"+name+"']";
		return xpath;
		
	}

}
