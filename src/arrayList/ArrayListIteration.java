package arrayList;

import java.util.ArrayList;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(200);//0
		numList.add(300);//1
		numList.add(400);//2
		numList.add(500);//3
		numList.add(600);//4
		System.out.println(numList.get(0)+numList.get(4));
		System.out.println(numList);

		for(int a=0;a<numList.size();a++) {
			System.out.println(numList.get(a));
		}
		System.out.println("--------------------------");
		
		for(int a:numList) {
			System.out.println(a);
		}
		
		
		ArrayList<String> empList = new ArrayList<String>(); 
		empList.add("Tom");
		empList.add("John");
		empList.add("rocky");
		empList.add("Shon");
		empList.add("kiran");
		empList.add(null);
		System.out.println(empList);
		
		for(String e:empList) {
			System.out.println(e);
		}
		
		ArrayList<String> studentList = new ArrayList<String>(3);//vc=3,pc=0
		studentList.add("Rahul");//0
		studentList.add("Aman"); //1
		studentList.add("Pooja");//2
		System.out.println(studentList);
		System.out.println("-----------------");
		studentList.add(0,"yogesh");
		System.out.println(studentList);
		System.out.println("-----------------");
		
		// remove() method
	    studentList.remove(1);
	    System.out.println(studentList);
	    System.out.println("-----------------");
	    
	    // set()
	    studentList.set(2, "somesh");
	    studentList.set(1, "Mangesh");
	    System.out.println(studentList);
	}
	

}
