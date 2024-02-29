package besicJavaAssinment;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {

		//		   1. Write a Java program to create a new array list, which contains all color names.
		//		   --add some colors (string) 
		//		   ---and print out the colors list using loops.

		ArrayList<String> str = new ArrayList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Blue");
		str.add("Yellow");
		System.out.println("-----------------------");
		System.out.println(str);
		for(int i=0; i<str.size();i++) {
			System.out.println(str.get(i));
		}
		System.out.println("-----------------------");
		for(String str1 : str) {
			System.out.println(str1);
		}
		System.out.println("-----------------------");


		// 2. Write a Java program to retrieve an element at a specified index from a given array list
		ArrayList<String> s = new ArrayList<>();
		s.add("Red");
		s.add("Green");
		s.add("Blue");
		s.add("Yellow");
		System.out.println(s.get(2));// Blue
		System.out.println(s.get(3));// Yellow
		System.out.println("-----------------------");

		// 3. Write a Java program to update specific array element by given element.
		ArrayList<String> s1 = new ArrayList<>();
		s1.add("Red");
		s1.add("Green");
		s1.add("Blue");
		s1.add("Yellow");
		s1.set(0, "Orange");
		s1.set(3, "pink");
		System.out.println(s1);
		System.out.println("-----------------------");

		// 4. Write a Java program to remove the third element from an array list

		ArrayList<String> dl = new ArrayList<>();
		dl.add("Red");
		dl.add("Green");
		dl.add("Blue");
		dl.add("Yellow");
		dl.remove(3);
		System.out.println(dl);// Yellow should be removed from array list

		// 5. Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.

		ArrayList<String> st = new ArrayList<>();
		st.add("Red");
		st.add("Green");
		st.add("Blue");
		st.add("Yellow");

		System.out.println(st);
		for(int i=0; i<st.size();i++) {
			if(st.get(i) == "Blue") {
				System.out.println(st.get(i));
				break;
			}
		}

		//  Reverse this array List:

		ArrayList<String> studentNames = new ArrayList<String>();

		 studentNames.add("Varun");
		 studentNames.add("Reena");
		 studentNames.add("Naveen");
		 studentNames.add("Robin");
		 studentNames.add("Peter");
		 System.out.println("Before reverse");
		 System.out.println(studentNames);
		 System.out.println("after reverse ");
		 System.out.println("----------------------");
		 for(int i=studentNames.size()-1; i>=0;i--) {
			 System.out.println(studentNames.get(i));
		 }
		 System.out.println("----------------------");
		 

		 // 7. Write a Java program to extract a portion of an array list.
		 ArrayList<String> stdNames = new ArrayList<String>();

		 stdNames.add("Varun");
		 stdNames.add("Reena");
		 stdNames.add("Naveen");
		 stdNames.add("Robin");
		 stdNames.add("Peter");
		 // subList()
		 ArrayList<String> portion = new ArrayList<>(stdNames.subList(1, 4));
		 System.out.println(portion); // [Reena, Naveen, Robin]
		 System.out.println("----------------------");
		 
		 ArrayList<String> stdudentNames = new ArrayList<String>();

		 stdudentNames.add("Varun");
		 stdudentNames.add("Reena");
		 stdudentNames.add("Naveen");
		 stdudentNames.add("Robin");
		 stdudentNames.add("Peter");
		 // clear()
		 stdudentNames.clear();
		 System.out.println(stdudentNames);
		 System.out.println("----------------------");
		 
		 ArrayList<String> stdudentName = new ArrayList<String>(10);
		 stdudentName.add("Varun");
		 stdudentName.add("Reena");
		 stdudentName.add("Naveen");
		 stdudentName.add("Robin");
		 stdudentName.add("Peter");
		 
		 System.out.println(stdudentName.size());
		 // trimToSize()
		 studentNames.trimToSize();
		 System.out.println(stdudentName.size());
		 System.out.println("----------------------");
		 



















	}

}
