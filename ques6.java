public class ques6{
	public static void main (String[]args) {
		
		int n = 1, sum1 = 0, sum2 = 0;
		
		while(n < 101)
		
		{
			sum1 = sum1 + (n*n);
			sum2 = sum2 +n;
			n++;
		}
		
		sum2= sum2*sum2;
		System.out.println(sum2-sum1);
	}
	
}