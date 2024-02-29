package besicJavaAssinment;

public class Switch {

	public static void main(String[] args) {

		// 1. WAP to check given alphabet character is Vowel or Consonant using Switch -
		// Case
		char ch = 'O';
		switch (ch) {
		case 'a': {
			System.out.println(ch + " is Vowel");
		}
		break;
		case 'e': {
			System.out.println(ch + " is Vowel");
		}
		break;
		case 'i': {
			System.out.println(ch + " is Vowel");
		}
		break;
		case 'o': {
			System.out.println(ch + " is Vowel");
		}
		break;
		case 'u': {
			System.out.println(ch + " is Vowel");
		}
		break;
		case 'A': {
			System.out.println(ch + " is Vowel");
		}
		break;
		case 'E': {
			System.out.println(ch + " is Vowel");
		}
		break;
		case 'I': {
			System.out.println(ch + " is Vowel");
		}
		break;
		case 'O': {
			System.out.println(ch + " is Vowel");
		}
		break;
		case 'U': {
			System.out.println(ch + " is Vowel");
		}
		break;
		default: {
			System.out.println(ch + " is Consonant");
		}
		}

		// 2. WAP to run your test cases in a specific environment like: QA, Stage, Dev,
		// UAT, Prod using using Switch - Case
		System.out.println("---------------------------");
		String env = "Prod";
		switch (env) {
		case "qa": {
			System.out.println("Run the test case on qa enviournment");
		}
		break;
		case "Stage": {
			System.out.println("Run the test case on staging enviournment");
		}
		break;
		case "Dev": {
			System.out.println("Run the test case on dev enviournment");
		}
		break;
		case "UAT": {
			System.out.println("Run the test case on UAT enviournment");
		}
		break;
		case "Prod": {
			System.out.println("Run the test case on prod enviournment");
		}
		break;
		default: {
			System.out.println("Run the test case on local enviournment");
		}
		}
		System.out.println("---------------------------");
		// 3. WAP to book the specific type of car from the Uber app using Switch -Case
		// Car Type: Mini, Sedan, SUV, Premium

		String car = "SUV";
		switch (car) {
		case "mini": {
			System.out.println("Book a " + car + " car");
		}
		break;
		case "Sedan": {
			System.out.println("Book a " + car + " car");
		}
		break;
		case "SUV": {
			System.out.println("Book a " + car + " car");
		}
		break;
		case "Premium": {
			System.out.println("Book a " + car + " car");
		}
		break;
		default: {
			System.out.println("please select the right car type");
		}

		}
		System.out.println("---------------------------");

		// 3. WAP to define the interest rate on the basis of Loan type using Switch Case
		// 3a.Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
		// 3a.i For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan

		String loanType = "Personal Loan";
		int salary = 40000;
		double interestRate;

		switch (loanType) {
		case "Housing loan": {
			if (salary < 35000) {
				System.out.println("Not applicable for housing loan");
			} else {
				interestRate = 7.8;
				System.out.println("interest rate for housing loan is " + interestRate+ " %");
			}
		}
		break;
		case "Car Loan": {
			interestRate = 6.8;
			System.out.println("interest rate for Car loan is " + interestRate+ " %");
		}
		break;
		case "Personal Loan": {
			interestRate = 10.5;
			System.out.println("interest rate for personal loan is " + interestRate+ " %");
		}
		break;
		case "Education Loan": {
			interestRate = 6.2;
			System.out.println("interest rate for Education loan is " + interestRate + " %");
		}
		break;
		}
	}
}
