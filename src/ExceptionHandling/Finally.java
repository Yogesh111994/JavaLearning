package ExceptionHandling;

public class Finally {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			int i =9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
		}
		finally {
			System.out.println("Finally Block");
		}
	}
	//use cases of finally block:
	//DB connection with JAVA:

	//make the connection with DB -- PASS
	//hit the SQL query -- PASS

	//try {
	//fetch the data from a table -- Exception
	//	}
	//	catch() {}


	//close the connection with DB -- finally block

}
