
public class ques2 {

	public static boolean check(int n) {
	  
		if(n%4 == 0 || n%2 == 0) 
		{
		  return true;
	    }
	  else
		  return false;
	  
  }
	public static void main(String[]args) {
		int fn = 0, fn1 = 0, fn2 = 1;
		long i, sum = 0; 
		for(i = 1; i< 4_000_000; i++ ) {
			fn= fn1 + fn2;
			fn1=fn2;
			fn2=fn;
			if(check(fn)) {
				sum= sum + fn;
				
				}
			}
		System.out.println(sum);
		
	  }	
	
}


