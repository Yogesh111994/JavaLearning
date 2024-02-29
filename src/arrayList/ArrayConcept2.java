package arrayList;

import java.util.Arrays;

public class ArrayConcept2 {

	public static void main(String[] args) {

		// Byte Array
		byte b[] = new byte[3]; // Range: 0-3
		System.out.println(Arrays.toString(b));
		System.out.println("---------------------");
		// Short Array
		short s[] = new short[5]; // Range: 0-4
		System.out.println(Arrays.toString(s));
		System.out.println("---------------------");
		// Double Array
		double d[] = new double[7];
		d[0] = 3535.99;
		d[1] = 3467.632;
		d[2] = 466;
		System.out.println(Arrays.toString(d));
		System.out.println("---------------------");
		// Floating Array
		float f[] = new float[4];
		f[0] = 4234;
		f[1] = 3535;
		f[2] = 454.8f;
		f[3] = 56.64f;
		System.out.println(Arrays.toString(f));
		System.out.println("---------------------");
		// Character Array
		char ch[] = new char[5];
		ch[0] = 'a';
		ch[1] = 'A';
		ch[2] = '0';
		ch[3] = 'z';
		ch[4] = 'Z';
		System.out.println(Arrays.toString(ch));
		System.out.println("---------------------");
		// String Array
		String empName[] = new String[3];
		empName[0] = "mahesh";
		empName[1] = "rajesh";
		empName[2] = "suresh";
		System.out.println(Arrays.toString(empName));
		System.out.println("---------------------");
		for (int i = 0; i < empName.length; i++) {
			System.out.println(empName[i]);
			if (empName[i].equals("rajesh")) {
				System.out.println("Pramote to SDET 2");
				// break;
			}
		}
		System.out.println("---------------------");
		// For each loop: Enhanced loop
		for (String e : empName) {
			System.out.println(e);
			if (e.equals("suresh")) {
				System.out.println("Pramote to SDET 2");
			}
		}
		System.out.println("---------------------");
		int i[] = new int[3];
		i[0] = 40;
		i[1] = 50;
		i[2] = 60;
		for (int a : i) {
			System.out.println(a);
		}
		System.out.println("---------------------");
		float numbers[] = new float[3]; // 0-2
		numbers[0] = 12.33f;
		numbers[1] = 23.44f;
		numbers[2] = 100.22f;

		for (float fl : numbers) {
			System.out.println(fl);
		}
		System.out.println("---------------------");

		char c[] = new char[4];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		c[3] = 'd';
		System.out.println(Arrays.toString(c));
		for (char ch1 : c) {
			System.out.println(ch1);
		}

		// Emp info: name(string), age(int), salary(double), dob(String),
		// isActive(boolean), gender(char)
		// Object Array:

		Object empInfo[] = new Object[6];
		empInfo[0] = "Yogesh";
		empInfo[1] = 28;
		empInfo[2] = 10000.55f;
		empInfo[3] = 30;
		empInfo[4] = true;
		empInfo[5] = 'm';
		System.out.println(empInfo);
		System.out.println("---------------------");
		for (Object o : empInfo) {
			System.out.println(o);
		}
		System.out.println("---------------------");
		for (int e = 0; e < empInfo.length; e++) {
			System.out.println(e + " = " + empInfo[e]);
		}

		// for each:
		int count = 0;
		for (Object e : empInfo) {
			System.out.println(count + " = " + e);
			count++;
		}

	}

}
