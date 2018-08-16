public class ques1 {
 
	public static boolean check(int n) {
		if(n%3 == 0 || n%5 == 0)
		{
			return true;
		}
		else
			return false;
		
		
	}
	
	public static void main(String[] args) {
	
		int sum = 0;
		
		for (int i = 1; i<1000; i++) {
			
			if(check(i)) 
			{
				
			sum = sum + i;
				
			}
		}
		
		System.out.println(sum);
		
	}

}
