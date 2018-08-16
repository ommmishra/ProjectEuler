public class ascxa{
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
 int n=2;
 int i= 0;
outer:
	while(true)
	{
	inner:
		if(isPrime(n))
		{
			if(i==10001)
			{
				System.out.println(n);
				
				break outer;
				
			}
			else {
				i++;
				n++;
				break inner;
			}
		
		
		}
		else
		{
			 n++;
			 break inner;
		}
		
		}
		
	
 System.out.println(n);
}
}