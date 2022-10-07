package week1.day2.assgn;

public class IsPrimeNumber {
	public static void main(String[] args) {
		
		int n = 4;
		
		boolean number = true ;
		
		for (int i=2; i<n; i++) {
			if (n%i==0) {
				number = false;
			}
		}
	System.out.println( n + " is prime number " + number );	
			
	}

}
