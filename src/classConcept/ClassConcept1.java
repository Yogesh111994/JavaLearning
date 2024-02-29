package classConcept;

public class ClassConcept1 {
	String name;
	int empId;
	String dept;
	boolean perm;
	double salary;
	public static void main(String[] args) {

		int i = 10; // local var --> 4 bytes --> primitive
		System.out.println(i);
		System.out.println("-----------------------------------");
		// class: is a blueprint/template/category of the objects
		// Object/Instance: is a physical entity created from class template/category

		// new keyword
		ClassConcept1 e1 = new ClassConcept1();
		// Employee : class/ type of e1
		// e1: object reference variable
		// new : keyword
		// new Employee(): Object

		e1.name = "yogesh";
		e1.empId = 1070;
		e1.dept = "qa";
		e1.perm = true;
		e1.salary = 4556.56;

		System.out.println(e1.name);
		System.out.println(e1.empId);
		System.out.println(e1.dept);
		System.out.println(e1.perm);
		System.out.println(e1.salary);

		System.out.println("-----------------------------------");
		ClassConcept1 e2 = new ClassConcept1();
		e2.name = "Mahesh";
		e2.dept = "dev";
		e2.salary = 5453.56;
		System.out.println(e2.name);
		System.out.println(e2.empId);
		System.out.println(e2.dept);
		System.out.println(e2.perm);
		System.out.println(e2.salary);

		//No ref object:
		new ClassConcept1().name = "Ravi";
		new ClassConcept1().empId = 3;

		//null ref object
		//ClassConcept1 e3 = new ClassConcept1();
		//e3 = null;
		//e3.name = "Naveen"; // NullPointerException 
		//null. ---> NPE
		//System.out.println(e3.name);

		System.gc(); // no guranteee that GC will go to heap memory






	}

}
