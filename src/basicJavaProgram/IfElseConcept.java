package basicJavaProgram;

public class IfElseConcept {

	public static void main(String[] args) {

		int mark = 100;

		if(mark > 100) {
			System.out.println("incorrect mark");
		}
		else {
			if(mark >= 90) {
				System.out.println("Grade A");
				if(mark == 100)
				{
					System.out.println("eligible for scholarship");
				}
			}
			else {
				System.out.println("less that 90 mark");
				if(mark >= 80){
					System.out.println("Grade B");
				}
				else {
					System.out.println("less than 80 mark");
					if(mark >= 70) {
						System.out.println("grade C");
					}
				}
			}
		}

	}

}
