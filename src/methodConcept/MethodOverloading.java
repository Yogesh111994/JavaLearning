package methodConcept;

public class MethodOverloading {
	// Method Overloading: OOP: Poly(many) +Morphism (forms): CompileTime(Static,
	// early binding)
	// When in the same class, we have different methods:
	// 1. with the same name
	// 2. with different number of parameters
	// 3. with different type of parameters
	// 4. return type does not matter
	// 5. sequence of the parameter should be different
	
	public void test() {// no parameter
		System.out.println();
	}
	
	public void test(int a) {
		System.out.println("test method : "+ a);
	}
	
	public void test(int a, int b) {
		System.out.println("test method : "+ a+b);
	}
	
	public void test(int a, String b) {
		System.out.println("test method : "+a+b);
	}
	
	public void test(int a, float c) {
		System.out.println("test method : "+a+c);
	}

	// Ecom
	
	public void login(String un, String pass) {
		
	}
	
	public void login(String un, String pass, int otp) {
		
	}
	
	public void login(String un, String pass, String phone) {
		
	}
	
	// Search
	
	public void search() {
		
	}
	
	public void search(String productName) {
		
	}
	
	public void search(String productName, int price) {
		
	}
	
	public void search(String productName, String brand) {
		
	}
	
	public static void main(String[] args) {

	}

}
