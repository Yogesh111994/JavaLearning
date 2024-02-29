package methodConcept;



import java.util.ArrayList;
import java.util.Arrays;

public class MethodInJava {

	// can not create a method inside a method
	// can call a method inside a method
	// methods are always independent//parallel to each other
	// methods are class data members
	// method: the behaviour of the object/class
	// duplicate methods are not allowed

	// 1. no input and no return:
	// void: can not return any value
	// return type: void

	public void test() { //
		System.out.println("test method");
	}

	// 2. no input but some return:
	// return type: int
	public int getInfo() {
		int a = 15;
		int b = 20;
		int c = a + b;
		System.out.println(c); // 35
		return c;
	}

	// return type: String
	public String stringName() {
		System.out.println("get name method");
		String name = "yogesh";
		return name;
	}

	// can we return multiple values from the method?
	// ans: NOOOOOOOO
	// return type: ArrayList<String>
	public ArrayList<String> empNames() {
		System.out.println("get employee names");
		String emp = "Vishal";
		String emp2 = "Yash";
		String emp3 = "Yogesh";

		ArrayList<String> empList = new ArrayList<String>();
		empList.add(emp);
		empList.add(emp2);
		empList.add(emp3);
		return empList;
	}
	
	// return type: String[]
	public String[] getEmployed() {
		System.out.println("Get employee method");
		String name[] = new String[3];
		name[0] = "Yogesh";
		name[1] = "Somesh";
		name[2] = "Mangesh";
		return name;
	}

	//3. some input and some return:
	public int sum(int a,int b) {
		System.out.println("Sum method");
		int total = a+b;
		return total;
		}
	
	public int substraction(int a, int b) {
		System.out.println("Substraction method");
		int sub = a-b;
		return sub;
	}
	
	public float getTotalBill (int foodBill, int drinkBill, float tax) {
		System.out.println("get Total bill");
		float total = foodBill+drinkBill+tax;
		return total;	
	}
	
	public int totalMark(int subjectMark,int attendance,int handWriting) {
		System.out.println("Total mark method");
		int totalMark = subjectMark+attendance+handWriting;
		return totalMark;
	}
	
	public static void main(String[] args) {

		MethodInJava obj = new MethodInJava();
		obj.test(); // test method
		System.out.println("--------------------------------");
		
		int s = obj.getInfo();
		System.out.println(s + 10); // 45
		System.out.println(s - 10); // 25
		System.out.println("--------------------------------");
		
		String name = obj.stringName();
		System.out.println(name + "Biradar");
		System.out.println(name + "is from latur district");
		System.out.println("--------------------------------");
		
		ArrayList<String> eNames = obj.empNames();
		System.out.println("Total emp : " + eNames.size());
		System.out.println(eNames);
		System.out.println("--------------------------------");
		
		String empNames[] = obj.getEmployed();
		System.out.println("total employee: "+empNames.length);
		System.out.println(Arrays.toString(empNames));
		System.out.println("--------------------------------");
		
		int t =obj.sum(10, 25);
		System.out.println(t);
		int add = obj.sum(12,24);
		System.out.println(add);
		System.out.println("--------------------------------");
		
		int sub = obj.substraction(26,24);
		System.out.println(sub);
		int sub1 = obj.substraction(50,25);
		System.out.println(sub1);
		System.out.println("--------------------------------");
		
		float foodBill = obj.getTotalBill(115, 100, 12.5F);
		System.out.println(foodBill);
		float resturantBill = obj.getTotalBill(200, 250, 34.55f);
		System.out.println(resturantBill);
		System.out.println("--------------------------------");
		
		int stdMark = obj.totalMark(60, 15, 5);
		System.out.println(stdMark);
		
		
		
		
		
		
		
	}

}
