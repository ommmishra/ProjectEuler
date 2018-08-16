public class grtr{
	
	public static boolean checkPrime(long n)
	 {
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

	
	public static void main (String []args) {
		int sum = 0;
		for(int i= 2; i<2000000; i++)
		{
			if(checkPrime(i))
				sum= sum+i;
			
		
		}
	System.out.println(sum);	
	}
}
		