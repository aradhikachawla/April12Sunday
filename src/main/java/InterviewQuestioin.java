
public class InterviewQuestioin {
	
	public static void main(String [] args) {
	
		int a[] = {0,1,2,3,4,9,10,34,89,345,890,9008,45678,56789};
		int b[] = {0,2,5,6,10,34,78,100,890,900};
		
		int c[] = new int [a.length + b.length];
		int temp[] = new int[a.length + b.length];

		int i= 0,j=0,k=0;
		while (i<a.length && j<b.length) {
			
			if (a[i] < b[j]){
				
				c[k]= a[i];i++;k++;
			}
			else {
				c[k]= b[j];j++;k++;
			}
			
		}	
			
		while(i<a.length) {
			c[k]= a[i];i++;k++;
		}
		while(j<b.length) {
			c[k]= b[j];j++;k++;
		}
	
		
		for (k=0;k<c.length;k++) {
			System.out.println(c[k]);
		
		}

		
		
		int g=0;
		for (k=0;k<c.length-1;k++) {
			if (c[k]!=c[k+1]) {
				temp[g]=c[k];
		//		System.out.println(temp[g]);
				g++;
			}
	
		}
	temp[g] = c[c.length-1];
	int len = g++;

	System.out.println();

	for (g=0;g<len ;g++)
		
		System.out.print(" "+ temp[g]);

	}
}
	
//int a[] = {0,2,3,4,9,10,34,89};
//int b[] = {1,2,5,6,10,34,78};
	

