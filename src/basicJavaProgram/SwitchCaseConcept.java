package basicJavaProgram;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		String browser = "chrome";
		int version = 116;
		
		switch (browser.toLowerCase().trim()) {
		case "chrome": {
			if(version == 116) {
				System.out.println("Give the permission");
			}
			else {
				System.out.println("Don't give the permission");
			}
			System.out.println("Launch chrome");
			}
		break;
		
		case "firefox":{
			System.out.println("Launch firefox");
		}
		break;
		
		case "edge" :{
			System.out.println("launch Edge");
		}
		break;
		
		case "Safari" :{
			System.out.println("launch Safari");
		}
		break;
		
		default :{
			System.out.println("Plese pass the right brower :" + browser);
		}
		break;
		case "Opera" :{
			System.out.println("launch Opera");
		}
		
		}
		
		// Cross browser logic : chrome,safari,edge,firefox,opera
		// Cross platform logic : windows, mac, linux, Android, ioS
		// Cross environment logic : qa,dev,staging,uat,prod
		// Payment option logic : credit card, debit card, upi, internet, NEFT, IMPS
		// Language case : English, hindi, french
		// User access based permission : RBAC : Admin, Seller, Vendor, distributor, customer



	}

}
