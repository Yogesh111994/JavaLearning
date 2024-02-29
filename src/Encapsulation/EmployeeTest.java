package Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

//		Employee e = new Employee();
//		e.setName("Yogesh");
//		e.setId(104);
//		e.setCity("Latur");
//		e.setIsPerm(true);
//		
//		System.out.println(e.getName());
//		System.out.println(e.getId());
//		System.out.println(e.getCity());
//		System.out.println(e.getIsPerm());

		// CRUD:

		// user registration: setter and const...CREATE: POST API

		Employee e = new Employee("Yogesh", 104, "Latur", true);

		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getCity());
		System.out.println(e.getIsPerm());

		System.out.println("-------------------------------------------------");
		// use wants to update city and name: setter: Update: PUT/Patch API
		e.setName("Naheed Automation");
		e.setCity("Pune");

		// display info on user profile: getter : Retrieve: GET API
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getCity());
		System.out.println(e.getIsPerm());
	}

}
