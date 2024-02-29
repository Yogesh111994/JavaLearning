package stringConcept;

public class ReverseString {
	
	// WAP to reverse the string
	
	public static String reverse(String str) {
		
		// When string is null
		if(str==null) {
			System.out.println("Can not reverse the null value please pass the right value");
			return null;
		}
		// String is having spaces only
		if(str.isBlank()) {
			System.out.println("String is having blank spaces");
			return str;
		}
		
		int l = str.length()-1;
		// When string has only one charecter
		if (l==1 || l==0) {
			return str;
		}
		
		// reverse the string
		String rev ="";
		
		for(int i=l; i>=0; i--) {
				char ch = str.charAt(i);
			rev = rev+ch;
		}
		return rev;
	}

	public static void main(String[] args) {
		
		String str ="Selenium";
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		System.out.println(ReverseString.reverse(str));
		System.out.println(ReverseString.reverse("123"));
		System.out.println(ReverseString.reverse("Selenium automation"));
		System.out.println(ReverseString.reverse("T"));
		System.out.println(ReverseString.reverse(null));
		System.out.println(ReverseString.reverse(""));

	}

}
