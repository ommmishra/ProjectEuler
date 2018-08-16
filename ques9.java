public class ques10{
	public static void main (String[]args) {
		int k;
		for(int i = 1; i<1000; i++) {
			
			for(int j= i+1; j<1000; j++) {
				
				k=1000-i-j;
				if(i*i+j*j == k*k)
				
				{
					
					System.out.println("a = " +i+ " b = " +j+  " c = " +k  );
				
				}
			
			}
		}
	}
}