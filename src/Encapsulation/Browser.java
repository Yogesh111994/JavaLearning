package Encapsulation;

public class Browser {
	
	public void browserLaunch() {
		System.out.println("Launching browser");
		checkRam();
		checkCPUUtilization();
		checkBrowserVersion();
		checkBrowserUpgrade();
		System.out.println("Browser launch");
	}
	
	private void checkRam() {
		System.out.println("Check ram method");
	}
	private void checkCPUUtilization() {
		System.out.println("Check the cpu utilization method");
	}
	private void checkBrowserVersion() {
		System.out.println("Check browser version method");
	}
	private void checkBrowserUpgrade() {
		System.out.println("Check browser upgrade method");
	}
	
	public static void main(String[] args) {
		

	}

}
