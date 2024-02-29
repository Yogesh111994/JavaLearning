package Encapsulation;

public class Employee {
	
	//POJO: Plain Old Java Object
	
	private String name;
	private int id;
	private String city;
	private boolean isPerm;
	
	public  Employee(String name, int id, String city, boolean isPerm) {
		
		this.name = name;
		this.id = id;
		this.city = city;
		this.isPerm = isPerm;
	}
	
	public void  setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public void setIsPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}
	public boolean getIsPerm() {
		return isPerm; 
	}
	
	

}
