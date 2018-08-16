public class ques3{
	
	 public static boolean isPrime(long n) {
			if (n <= 1) {
	             return false;
	         }
	         if (n == 2) {
	             return true;
	         }
	         if (n % 2 == 0) {
	             return false;
	         }
	         for (int i = 3; i <= Math.sqrt(n) + 1; i = i + 2) {
	             if (n % i == 0) {
	                 return false;
	             }
	         }
	         return true;
	     }
	
	public static void main (String[]args) {
		long n=600851475143L;
		long a = 0;
		
		
		 while(n>1)
			{
			if(n%n == 0)
			{
			
				if(isPrime(n))
				{
					a=n;
					break;	
				}
				
			}
				n=n-1;
			}
		System.out.println(a);
	}
}