package constuctor;

import java.util.Arrays;

public class UserTest {

	public static void main(String[] args) {
		
		User  p = new User("Avinash");
		String avinashDetail[] = p.getUserOrderDetail("Avinash");
		System.out.println(Arrays.toString(avinashDetail));
		
		User u = new User("Suresh");
		String sureshDetail[] = u.getUserOrderDetail("Suresh");
		System.out.println(Arrays.toString(sureshDetail));
	}

}
