package OOPSAbstraction;

public class PageTest {

	public static void main(String[] args) {
	
		LoginPage lp = new LoginPage(10);
		
		lp.title(); // Overridden
		lp.url(); // Overridden
		lp.pageLoadTime(); // Overridden
		lp.logo(); // Inheritance
		lp.doLogin("admin","admin123"); // Individual
		
		System.out.println("-----------------------------------");
		//top casting: child class object can be referred by parent abs.. class ref variable
		
	  	Page p = new LoginPage();
	  	p.title();
	  	p.url();
	  	p.pageLoadTime();
	  	p.logo();
	  	
	  	System.out.println("-----------------------------------");
		
	}

}
