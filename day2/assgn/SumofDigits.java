package week1.day2.assgn;

public class SumofDigits {

	public static void main(String[] args) {
	 int i = 154;	
	 int temp = 0;
	 int temp1 = 0;
    
	 while(i>0) {	 
	 temp = i%10;
	 temp1 = temp + temp1;
	 i = i/10;
	 }
	 
	 System.out.println("Sum of Digit for given number is "+temp1 );
	
	}
	
}
