public class grtr{
	
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
		long i;
		long a = 0;
		
		
		
			for(i = 2; i < n; i++){
			if(n%i == 0)
			{
				if(isPrime( n/i ))
				{
					a = n/i;
					break;
				}
					if(isPrime(i))
				{	
					
						a=i;
					
				}
				}
			}
		
			
			
		System.out.println(a);
	}
}