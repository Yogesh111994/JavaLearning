package constuctor;

public class User {

	String name;
	String email;
	int userId;
	String dob;
	String city;
	
	public User(String name) {
		this.name = name;
	}
	public User(String name, String email) {
		this.name = name;
	}
	public User(String name,String email,int userId) {
		this.name = name;
		this.email = name;
		this.userId =userId;
	}
	public User(String name,String email,int userId,String dob) {
		this.name = name;
		this.email = name;
		this.userId =userId;
		this.dob = dob;
	}
	public User(String name,String email,int userId,String dob,String city) {
		this.name = name;
		this.email = name;
		this.userId =userId;
		this.dob = dob;
		this.city = city;
	}
	public String[] getUserOrderDetail(String name) {
		
		if(name.equals("Avinash")) {
			String orderDetail[] = {"Laptop","Mouse","USB cabel"};
			return orderDetail;
		}
		else if(name.equals("Suresh")) {
			String orderDetail[] = {"Laptop","Mouse"};
			return orderDetail;
		}
		else {
			return null;
		}
	}

}
