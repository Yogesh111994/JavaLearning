package callByReferenceConcept;

public class ClassA {

	public static void main(String[] args) {
	System.out.println("A main method------");
	ClassA.main(args); //StackOverflowError

	}

}
