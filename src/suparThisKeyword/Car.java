package suparThisKeyword;

public class Car {

	int speed = 100;
	
	public Car(){
		
		System.out.println("Car constructor");
	}
	
	public Car(int a) {
		this(20,20);
		//this();//error - Constructor call must be the first statement in a constructor
		System.out.println("Car Constructor"+a);
	}
	
	public Car (int a,int b) {
		this();
		System.out.println("car const..."+(a+b));
	}
	
	public void displayInfo() {
		
		System.out.println("Car info");
	}

}
