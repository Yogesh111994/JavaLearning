package classConcept;

public class ClassConcept3 {

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		ClassConcept3 cc = new ClassConcept3();

		cc.name = "yogesh";
		cc.age = 28;
		cc.city = "pune";

		ClassConcept3 cc1 = new ClassConcept3();
		cc1.name = "mangesh";
		cc1.age = 30;
		cc1.city = "pimpri-chinchwad";

		ClassConcept3 cc2 = new ClassConcept3();
		cc2.name = "Somesh";
		cc2.age = 26;
		cc.city = "latur";

		System.out.println(cc.name + "  " + cc.age + "  " + cc.city);
		System.out.println(cc1.name + "  " + cc1.age + "  " + cc1.city);
		System.out.println(cc2.name + "  " + cc2.age + "  " + cc2.city);
		System.out.println("---------------------------------------------");
		cc = cc1;
		
		System.out.println(cc.name + "  " + cc.age + "  " + cc.city); // Mangesh
		System.out.println(cc1.name + "  " + cc1.age + "  " + cc1.city); // Mangesh
		System.out.println(cc2.name + "  " + cc2.age + "  " + cc2.city); // Somesh
		System.out.println("---------------------------------------------");
		cc1 = cc2;
		
		System.out.println(cc.name + "  " + cc.age + "  " + cc.city); // Mangesh
		System.out.println(cc1.name + "  " + cc1.age + "  " + cc1.city); // Somesh
		System.out.println(cc2.name + "  " + cc2.age + "  " + cc2.city); // Somesh
		System.out.println("---------------------------------------------");
		cc2 = cc;
		
		System.out.println(cc.name + "  " + cc.age + "  " + cc.city); // Mangesh
		System.out.println(cc1.name + "  " + cc1.age + "  " + cc1.city); // Somesh
		System.out.println(cc2.name + "  " + cc2.age + "  " + cc2.city); // Mangesh
		System.out.println("---------------------------------------------");
		
	}

}
