package basicJavaProgram;

public class StaticVariable {
	String name;
	int price;
	String chasisNumber;
	static final int wheels=4;

	public static void main(String[] args) {
		
		StaticVariable sv = new StaticVariable();
		 sv.name = "BMW";
		 sv.price = 35;
		 sv.chasisNumber = "2452365216";
		 
		 StaticVariable sv1 = new StaticVariable();
		 sv1.name = "audi";
		 sv1.price = 40;
		 sv1.chasisNumber = "474848";
		 
		 StaticVariable sv2 = new StaticVariable();
		sv2.name = "Tata";
		sv2.price = 10;
		sv2.chasisNumber ="36542136";
		
		//Car.wheels = 5;

		//how to call static vars:
		//1. use directly: within the same class
		System.out.println(wheels);
		System.out.println("--------------------------");
		
		System.out.println( sv.name+sv.price+sv.chasisNumber+wheels);
		System.out.println("--------------------------");
		
		//2. use it with the class name: from anywhere
		System.out.println(StaticVariable.wheels);
		System.out.println( sv1.name+sv1.price+sv1.chasisNumber+wheels);
		
		//3. can I call static var with object ref name??
		System.out.println(sv2.wheels);//not recommended

		
	}

}
