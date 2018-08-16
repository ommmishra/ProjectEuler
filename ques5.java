class grtr{
	public static void main (String[]args) {
		int i=2521, j=2;
		inner:
		while(true) {
			outer:
			
				if(i%j == 0) {
			
				 j++;
				if(j== 20)
				  {
					  System.out.println(i);
					  break inner;
				  } 
				
			    break outer;}
			
			
			
			
			else {
				i++;
				j=2;
				
			}  
		
			
			
			   
			}
			
				
				
			}
			
					
		}


	
	

