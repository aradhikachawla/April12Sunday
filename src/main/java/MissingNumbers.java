
public class MissingNumbers {

	public static void main(String[] args) {

		int a[]= {1,2,3,5,6,7,8,9,10};
		int sum = 0;
		int sumreal = 0;
		for (int i=0;i<a.length;i++) {
			sum = sum +a[i];

		}
		
		sumreal = 10*11/2 ;
		
	//	System.out.println(sum + " " + sumreal + " Missiiioioing number is  " + (sumreal-sum) );
		//another method
		int c = 0;
		for (int i=0;i<a.length;i++) {
		c=0;
		c = a[i] ^ (i+1);
		System.out.println( " a[i]  " + a[i] );
		System.out.println( " i+1   " + (i+1) );


		System.out.println( " c  " + c );

		if (c > 0) {
			System.out.println( " Missiiioioing number is  " + (i+1) );break;
			}

			}
		
		
		
		

		}
		
		
		
	}


//if ((a[i] ^ (i +1) )!=0) {
//	System.out.println("Missing number is " + i+1);
