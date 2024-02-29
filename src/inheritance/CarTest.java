package inheritance;

public class CarTest extends BMW {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start(); // Override
		b.stop(); // inheritance
		b.refuel(); // inheritance
		b.engine(); // Override
		b.autoParking(); // inheritance
		
		System.out.println("-------------------------");
		
		CarTest c = new CarTest();
		c.start();
		c.stop();
		c.refuel();
		c.engine();

	}

}
