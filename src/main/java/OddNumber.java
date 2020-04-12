
public class OddNumber {

	public static void main(String[] args) {

		int a[] = {1, 2, 3, 4, 5, 4, 3, 2, 6, 7, 8, 3, 1, 4, 7,8,3,4,5};
		int sum =0;
		for (int i=0;i<a.length;i++) {
			sum = sum ^ a[i];
		}
		
		System.out.println("The number " + sum + " is comimg odd times");
		
	}

}
