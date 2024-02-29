package callByReferenceConcept;

public class CallByReference {

	public static void useLang(CallByReference obj) {
		System.out.println("use language");
		obj.readlang();
	}

	public void readlang() {
		System.out.println("read language");
		
	}

	public static void main(String[] args) {

		CallByReference cbr = new CallByReference();
		cbr.readlang();
		CallByReference.useLang(cbr);

	}

}
