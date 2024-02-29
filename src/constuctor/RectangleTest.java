package constuctor;

public class RectangleTest {

	public static void main(String[] args) {
		
		 Rectangle r = new Rectangle();
		 System.out.println("Length = "+r.length);
		 System.out.println("width = "+r.width);
		 System.out.println("--------------------------------------");
		 Rectangle r1 = new Rectangle(24,12);
		 System.out.println("--------------------------------------");
		 
		 r1.calculateArea();

	}

}
