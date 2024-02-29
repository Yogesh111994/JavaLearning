package ExceptionHandling;

public class Student {
	
	
	public int getMark(String StudentName) {
		
		System.out.println("Getting mark for sudent"+ StudentName);
		
		if(StudentName.equals("Ravi")) {
			
			try {
				int i = 9/3;
				return i;
			}
			catch(Exception e) {
				e.printStackTrace();
				return 50;
			}
			finally {
				System.out.println("Faillllllll");
				return 75;
			}
		}
		
		else if(StudentName.equals("Ram") ) {
			return 90;
		}
		else if(StudentName.equals("Kiran")) {
			return 85;
		}
		else {
			System.out.println("Please enter right student name");
			throw new AppException("Wrong name Entered");
		}
		
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		int mark=s.getMark("Ravi");
		System.out.println(mark);

	}

}
