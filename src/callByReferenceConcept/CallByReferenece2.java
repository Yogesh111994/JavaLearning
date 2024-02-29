package callByReferenceConcept;

public class CallByReferenece2 {
	
	public static void sentMail(CallByReferenece2 obj) {
		System.out.println("Sent mail");
		obj.readMail();
	}
	public void readMail() {
		System.out.println("read mail");
	}

	public static void main(String[] args) {
		CallByReferenece2 cbr2 = new CallByReferenece2();
		cbr2.readMail();
		CallByReferenece2.sentMail(cbr2);
	}

}
