package BuilderPattern;

public class ShoppingTest {

	public static void main(String[] args) {

		Ecommerce u1  = new Ecommerce();
		u1.login("admin", "admin123")
		    .search("laptop")
		        .search("Macbook", "Silver")
		            .addToCart("mackbook")
		                  .doPayment("1234 1234 12341234 ", 123)
		                      .generaterOrderId()
		                          .logout();
		System.out.println("---------------------------------");
		Ecommerce u2  = new Ecommerce();
		u2.login()
		    .login("yogesh@gmail.com","yogesh123")
		        .search("Motorola edge 40")
		             .search("Motorola edge 40", "Black")
		                  .addToCart("Motorola edge 4")
		                     .generaterOrderId()
		                         .logout();
		System.out.println("------------------------------------");
		u2.login("Mangesh@gmail.com", "123344")
		     .logout();
		          System.out.println("--------------------------------");       
		          
		Ecommerce u3  = new Ecommerce();
		u3.login()
		   .search("shoes")
		       .search("Shoes", "Red")
		            .addToCart("Shoes")
		                   .doPayment("131231323333323", 665)
		                         .generaterOrderId()
		                               .logout();
		System.out.println("-------------------------------------");
		
		                                
		





	}

}
