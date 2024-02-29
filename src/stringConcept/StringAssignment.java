package stringConcept;

public class StringAssignment {

	// 3. Write a program that will  print out the last character and first
	// character of a word.
	public static void flword(String word) {

		System.out.println(word.charAt(0));
		System.out.println(word.charAt(word.length() - 1));
	}

	// 4. Write a program to verify a word or a character contained in the sentence.
	public static void match(String sentence) {

		String srr[] = sentence.split(" ");

		for (String mt : srr) {

			if (mt.equals("am")) {
				System.out.println("Word match");
			}
		}
	}

	// 5.Write a function/ method to reverse your own name.

	public static void reverseword(String name) {

		int l = name.length();
		String rev = "";
		for (int i = l - 1; i >= 0; i--) {

			char rword = name.charAt(i);
			rev = rev + rword;
		}
		System.out.println(rev);

	}

	// 6. Write a program that gives you the last half of the string.

	public static void halfWord(String word) {

		System.out.println(word.substring(3));
	}

	// 7.Write a program to get the 3rd  “ e “ of the string .

	public static void thirde(String sentence) {
		// System.out.println(sentence.indexOf("i")+1);
		// System.out.println(sentence.indexOf(sentence.indexOf("i")+1));
		System.out.println(sentence.indexOf("e", sentence.indexOf("e", sentence.indexOf("e") + 1) + 1));
	}

	// 8. Write a method which gives an index of (-1) if string is not available. .
	// it should return integer. if String is present, then it should return the
	// specific index.
	public static int returnIndex(String ch, String index) {

		int i = index.indexOf(ch);
		return i;
	}

	// reverse the each word the string = " my name is yogesh biradar ";
	public static void reverseString(String reverse) {

		 String word[] = reverse.split(" ");
	
		String revWord = "";

		for (String s : word) {

			int l = s.length() - 1;
			String rword = "";
			for (int i = l; i >= 0; i--) {
				char ch = s.charAt(i);
				rword = rword + ch;
			}
			revWord = revWord + rword+" ";

		}

		System.out.println(revWord);
	}
	
	// 10. Assume that a string consists of 3 words, print out the middle one.
	
	public static void middleWord(String word) {
		
		String w =word.trim();
		String sp[]=w.split(" ");
		System.out.println(sp[1]);
	
	}
	
	public static void main(String[] args) {

		String s = "         hello        yogesh         ";
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));
		System.out.println(s.replace(" ", ""));
		StringAssignment.flword("yogesh");
		StringAssignment.match("i am yogesh biradar");
		StringAssignment.reverseword("yogesh");
		StringAssignment.halfWord("yogesh");
		StringAssignment.thirde("Welcome to Naveen Automation Labs ! ");
		int l = StringAssignment.returnIndex("h", "yogesh");
		System.out.println(l);
		StringAssignment.reverseString(" my name is yogesh biradar");
		StringAssignment.middleWord("     my name is yogesh");
		
		// 11. get only numeric part from this String
		String str = "your transaction id is: 12345 and reference id is 34567";
		String sh= str.substring(str.indexOf("is:")+4, str.indexOf("and ")-1);
		System.out.println(sh);
		String sh1= str.substring(str.indexOf("is",str.indexOf("is")+6));
		System.out.println(sh1);
		
	
		

	}

}
