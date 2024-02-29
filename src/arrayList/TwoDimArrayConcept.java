package arrayList;

public class TwoDimArrayConcept {

	public static void main(String[] args) {

		int arr[][] = new int[4][4];
		arr[0][0] = 2;
		arr[0][1] = 3;
		arr[0][2] = 4;

		// {2,3,4,5
		// 3,4,5,6
		// 4,5,6,7
		// 5,6,7,8}
		System.out.println(arr.length);// Length= Number of row
		System.out.println("---------------------");
		// Array literals

		int num[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 7, 8, 9, 10 }, { 11, 12, 13, 14 }

		};
		System.out.println(num.length);

		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num.length; col++) {
				System.out.print(num[row][col] + ",");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		// Dynamic Array
		Object a[][] = { { "Rajesh", 25, 'm', true }, { "mahe", 27, 'f', true }, { "suresh", 22, 'm', true } };

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				System.out.print(a[row][col] + ",");
			}
			System.out.println();
			
	}
	
	}
}
