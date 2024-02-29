package constuctor;

public class ConstructorConcept {

	// instance variables
	String name;
	int id;
	double salary;

	// 1. constructor name is same as the class name
	// 2. does not have any return type / no void
	// 3. constructor can not return anything
	// 4. constructor is not made for the buss logic
	// 5. constructor is helping to initialize the class variables
	// 6. constructor is restricting the unnecessary object creating
	// 7. constructor will be called after creating the object

	public ConstructorConcept() {
		System.out.println("Construction Concept");
	}

	public ConstructorConcept(String name) {
		this.name = name; // Global == Local
	}

	public ConstructorConcept(String name, int id) {
		this.name = name;
		this.id = id;

	}

	public ConstructorConcept(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void test() {
		System.out.println("Test Method");
	}

	public static void main(String[] args) {

		ConstructorConcept cc = new ConstructorConcept();
		System.out.println(cc.name + " " + cc.id + " " + cc.salary);// null 0 0.0
		System.out.println("---------------------------------------------");
		ConstructorConcept cc1 = new ConstructorConcept();
		cc1.name = "yogesh";
		cc1.id = 1;
		cc1.salary = 35;
		System.out.println(cc1.name + " " + cc1.id + " " + cc1.salary);
		System.out.println("---------------------------------------------");
		ConstructorConcept cc2 = new ConstructorConcept("Mangesh", 21, 467.58);
		System.out.println(cc2.name + " " + cc2.id + cc2.salary);

	}

}
