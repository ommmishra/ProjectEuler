class ques4{
	
	public static boolean palindrome (int a)
	{
		int r, sum=0;
		
		int temp=a;
		
		while(a>0) {
			
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
			
		}
		if(sum==temp)
		
		{
			return true;
		}
		
		else
			return false;
		
	}

public static void main(String[] args) {
		int max=0, a;
		
		for(int i=999; i>=100; i--)
		{
			for(int j=999; j>=100; j--)
			{
				
				a=i*j;
				if(palindrome(a))
				
				
				{	if(a>max)
					
				{	
					max=a;
					break;
				}
			
				
				
				}
			}
		}
			
		
	System.out.println(max);
	

	}
}