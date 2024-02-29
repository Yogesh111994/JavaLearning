package constuctor;

public class Person {
	
	 String name;
	 int age;
	 char gender;
	 double height;

	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public static void main(String[] args) {
	
		Person p = new Person("Yogesh",18,'M',5.75);
		Person p2 = new Person("Mangesh",28,'F',5.5);
		System.out.println(p);
		System.out.println(p2);
		
		
		
	}

}
