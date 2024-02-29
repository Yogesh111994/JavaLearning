package methodConcept;

public class MethodInJavaConcept {

	// WAF: to launch the browser
	// name: launchBrowser : chrome/ff/safari/edge
	// param: browserName(String)
	// return: boolean

	public boolean launchBrowser(String browserName) {

		System.out.println("browser name is : " + browserName);
		boolean flag = true;
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Launch chrome browser");
			break;
		case "firefox":
			System.out.println("Launch firefox browser");
			break;
		case "safari":
			System.out.println("Launch safari browser");
			break;
		case "mozila":
			System.out.println("Launch mozila browser");
			break;
		default:
			System.out.println("Please enter correct browser name");
			flag = false;

		}
		return flag;

	}

	public boolean browserlaunch(String browserName) {
		System.out.println("Enter the browser name: " + browserName);

		boolean flag = true;
		if (browserName.equalsIgnoreCase("chrome")) {
			System.out.println("Launch Chrome browser");
		} else if (browserName.equals("firefox")) {
			System.out.println("Launch firefox browser");
		} else if (browserName.equals("safari")) {
			System.out.println("Launch safari browser");
		} else if (browserName.equals("mozila")) {
			System.out.println("Launch mozila browser");
		} else {
			System.out.println("Please pass the right browser");
			flag = false;
		}
		return flag;

	}

	// WAF: to return the student marks
	// function name: getStudentMarks(String stName)
	// return: marks(int): 0-100
	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for student: " + studentName);

		int marks = -1;

		if (studentName.equals("sarika")) {
			// return 90;
			marks = 90;
		} else if (studentName.equals("rahul")) {
			// return 95;
			marks = 95;
		} else if (studentName.equals("shubhra")) {
			// return 100;
			marks = 100;
		} else if (studentName.equals("naveen")) {
			// return 0;
			marks = 0;
		} else {
			System.out.println("pls pass the right student name..." + studentName);
			// return -1;
		}

		return marks;

	}

	public static void main(String[] args) {

		MethodInJavaConcept obj = new MethodInJavaConcept();

		boolean ifTrue = obj.launchBrowser("safari");
		if (ifTrue) {
			System.out.println("launch the browser");
		}
		System.out.println("--------------------------------");

		boolean flag = obj.browserlaunch("Chrome");
		if (flag) {
			System.out.println("Launch the browser");
		}
		System.out.println("--------------------------------");
		
		int stMarks = obj.getStudentMarks("rahul");
		System.out.println(stMarks);

		if (stMarks >= 0) {
			System.out.println("print the mark sheet: "+stMarks);
		}

	}

}
