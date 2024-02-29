package classConcept;

public class ClassConcept2 {
	// customer class vars:
	String firstName;
	String lastName;
	String email;
	String telephone;
	String password;
	boolean subscribe;

	public static void main(String[] args) {

		ClassConcept2 c1 = new ClassConcept2();
		c1.firstName = "mangesh";
		c1.lastName = "Biradar";
		c1.email = "abc@gmail.com";
		c1.telephone = "1234567891";
		c1.password = "454545";
		c1.subscribe = true;

		ClassConcept2 c2 = new ClassConcept2();
		c2.firstName = "Somesh";
		c2.subscribe = false;

		ClassConcept2 c3 = new ClassConcept2();
		c3.firstName = "Rajesh";
		c3.lastName = "sharna";

		ClassConcept2 c4 = new ClassConcept2();
		c4.firstName = "Shiwanee";
		c4.lastName = "Pandey";
		c4.email = "bcd@gmail.com";
		c4.telephone = "65658578587";
		c4.password = "8989898";
		c4.subscribe = true;

		System.out.println(c1.firstName+" "+c1.lastName+" "+c1.email+" "+c1.telephone+" "+c1.password+" "+c1.subscribe); // Mangesh
		System.out.println(c2.firstName+" "+c2.lastName+" "+c2.email+" "+c2.telephone+" "+c2.password+" "+c2.subscribe); //Somesh
		System.out.println(c3.firstName+" "+c3.lastName+" "+c3.email+" "+c3.telephone+" "+c3.password+" "+c3.subscribe); // Rajesh
		System.out.println(c4.firstName+" "+c4.lastName+" "+c4.email+" "+c4.telephone+" "+c4.password+" "+c4.subscribe); // Shiwanee
		System.out.println("------------------------------------");
		c1 = c2;

		System.out.println(c1.firstName+" "+c1.lastName+" "+c1.email+" "+c1.telephone+" "+c1.password+" "+c1.subscribe); //Somesh
		System.out.println(c2.firstName+" "+c2.lastName+" "+c2.email+" "+c2.telephone+" "+c2.password+" "+c2.subscribe); // Somesh
		System.out.println(c3.firstName+" "+c3.lastName+" "+c3.email+" "+c3.telephone+" "+c3.password+" "+c3.subscribe); // Rajesh
		System.out.println(c4.firstName+" "+c4.lastName+" "+c4.email+" "+c4.telephone+" "+c4.password+" "+c4.subscribe); // Shiwanee
		System.out.println("------------------------------------");
		c2 = c3;

		System.out.println(c1.firstName+" "+c1.lastName+" "+c1.email+" "+c1.telephone+" "+c1.password+" "+c1.subscribe); //somesh
		System.out.println(c2.firstName+" "+c2.lastName+" "+c2.email+" "+c2.telephone+" "+c2.password+" "+c2.subscribe); //Rajesh
		System.out.println(c3.firstName+" "+c3.lastName+" "+c3.email+" "+c3.telephone+" "+c3.password+" "+c3.subscribe); // Rajesh
		System.out.println(c4.firstName+" "+c4.lastName+" "+c4.email+" "+c4.telephone+" "+c4.password+" "+c4.subscribe); //Shiwanee
		System.out.println("------------------------------------");
		c3 = c4;

		System.out.println(c1.firstName+" "+c1.lastName+" "+c1.email+" "+c1.telephone+" "+c1.password+" "+c1.subscribe); //Somesh
		System.out.println(c2.firstName+" "+c2.lastName+" "+c2.email+" "+c2.telephone+" "+c2.password+" "+c2.subscribe); // rajesh
		System.out.println(c3.firstName+" "+c3.lastName+" "+c3.email+" "+c3.telephone+" "+c3.password+" "+c3.subscribe); // Shiwanee
		System.out.println(c4.firstName+" "+c4.lastName+" "+c4.email+" "+c4.telephone+" "+c4.password+" "+c4.subscribe); // Shiwanee
		System.out.println("------------------------------------");
		c4 = c1;

		System.out.println(c1.firstName+" "+c1.lastName+" "+c1.email+" "+c1.telephone+" "+c1.password+" "+c1.subscribe); // Somesh
		System.out.println(c2.firstName+" "+c2.lastName+" "+c2.email+" "+c2.telephone+" "+c2.password+" "+c2.subscribe); // Rajesh
		System.out.println(c3.firstName+" "+c3.lastName+" "+c3.email+" "+c3.telephone+" "+c3.password+" "+c3.subscribe); // Shiwanee
		System.out.println(c4.firstName+" "+c4.lastName+" "+c4.email+" "+c4.telephone+" "+c4.password+" "+c4.subscribe); // Somesh
		System.out.println("------------------------------------");







	}

}
