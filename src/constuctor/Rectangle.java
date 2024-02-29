package constuctor;

public class Rectangle {
	
	double length;
	double width;
	public Rectangle() {
		
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		System.out.println(length);
		System.out.println(width);
	}
	
	public void calculateArea() {
//		System.out.println(length);
//		System.out.println(width);
		double area = length*width;
		System.out.println(area);
	}

}
