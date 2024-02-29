package OOPSAbstraction;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("Login Page const...");
	}
	
	public LoginPage(int a ) {
		//super(a);
		System.out.println("Login Page const..."+ a);
	}

	@Override
	public void title() {
		System.out.println("Login page title");

	}

	@Override
	public void url() {
		System.out.println("Login page url");

	}

	@Override
	public void pageLoadTime() {
		System.out.println("Page load time out = 2 secs");
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("logged in user with: " + un + " " + pwd);
	}
}
