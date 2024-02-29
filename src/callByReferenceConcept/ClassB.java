package callByReferenceConcept;

public class ClassB {

	public static void main(String[] args) {
		
		System.out.println("B main method");

		ClassA.main(args); // StackOverflowError
	}

}
