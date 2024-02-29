package arrayList;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//Dynamic Array: size is not fixed
		//ArrayList -- default class
		//methods
		//internal implemenation of AL
		//VC, load factor - LF
		//index based
		
		ArrayList  arr = new ArrayList();
		// size() method
		System.out.println(arr.size()); // 0
		System.out.println(arr); //[]
		// add() method
		arr.add(100);
		arr.add(200);
		System.out.println(arr); //2
		arr.add(300);
		arr.add(400);
		System.out.println(arr.size());//4
		arr.add(12.33);
		arr.add(true);
		arr.add("selenium");
		System.out.println(arr.size());//7
		System.out.println(arr);
		// get() method
		System.out.println(arr.get(0));// 100
		System.out.println(arr.get(6));
		
		ArrayList ar = new ArrayList(20); //pc=0,vc=20
		ArrayList ar3 = new ArrayList(7);//pc=0,vc=7
		
		//numbers in the list:
	    //generics
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(200);
		numList.add(125);
		ArrayList<Double> db = new ArrayList<Double>();
		db.add(34.55);
		db.add(120d);
		ArrayList<Float> fl = new ArrayList<Float>();
		fl.add(54.56f);
		fl.add(466.67f);
		ArrayList<String> s = new ArrayList<String>();
		s.add("hi");
		s.add("hello");
		ArrayList<Character> ch = new ArrayList<Character>();// VC=10,PC=0
		ch.add('a');
		ch.add('b');
		// VC=8, PC=2
		
		ArrayList<Object> obj = new ArrayList<Object>(5);
		obj.add(150);
		obj.add(12.35);
		obj.add("yogesh");
		obj.add('c');
		obj.add(1994);
		//PC=5,VC=5
		// Virtual capacity= 5
		// Physical capacity= 5

	}

}
