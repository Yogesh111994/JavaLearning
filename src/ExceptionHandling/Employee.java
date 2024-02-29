package ExceptionHandling;

public class Employee {
	String name;

	//error:
	//Error class
	//System(HW/OS) error: memory issue, leakage, stackover error

	public static void main(String[] args) {

		System.out.println("A");

		Employee obj = new Employee();
		obj = null;

		try {
			obj.name = "Tom"; // NPE
			// int i = 9/0;
			System.out.println("Hello");
		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming");
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}

		System.out.println("BYE");

		try {
			Thread.sleep(0);
		}
		catch(Exception e) {
			e.printStackTrace();
		}



	}

}
