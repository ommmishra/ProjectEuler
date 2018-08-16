public class grtr{

	public static void main (String[]args) {
		int f1 = 1;
		int f2 = 1;
		int f = 0;
		int sum = 0;
 
		while (f < 4000000) {
			if ((f % 2) == 0) {
				sum = sum + f;
			}
 
			f = f1 + f2;
			f2 = f1;
			f1 = f;
}
		System.out.println(sum);
	}
}