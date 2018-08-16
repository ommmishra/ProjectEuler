public class grtr{
	
	 public static boolean isPrime(long n) {
	        
	        if (n < 2) 
	            return false;
	        
	        else if (n == 2) 
	            return true;
	        
	        for (int i = 2; i < Math.sqrt(n) + 1; i++)
	            if (n % i == 0)
	                return false;
	        
	        return true;
	    }

	 public static void main (String[]args) {
 
		 int n=0;
 
		 int i= 1;

		 while(n<10001)
		 {
			 i++;
			 if(isPrime(i))
				 n++;
			
		
		}
		
	
 System.out.println(i);
}
}