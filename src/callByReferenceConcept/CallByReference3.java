package callByReferenceConcept;

public class CallByReference3 {

	public static void readFile(CallByReference3 obj) {
		System.out.println("use language");
		obj.writeFile();
	}

	public void writeFile() {
		System.out.println("read language");
		
	}

	public static void main(String[] args) {

		CallByReference3 cbr3 = new CallByReference3();
		cbr3.writeFile();
		CallByReference3.readFile(cbr3);;

	}

}
