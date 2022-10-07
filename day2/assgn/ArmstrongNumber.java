package week1.day2.assgn;

public class ArmstrongNumber {

	public static void main(String[] args) {
	 int i = 153;	
	 int n=i;
	 int temp = 0;
	 int temp1 = 0;
     ArmstrongNumber obj=new ArmstrongNumber();
	 while(i>0) {	 
	 temp = i%10;
	 temp1 = obj.cube(temp) + temp1;
	 i = i/10;
	 }
	 if (n==temp1)
	 System.out.println("The given number "+n+" is armstrong number" );
	 else
	 System.out.println("The given number "+n+" is not armstrong number" );
	}
	
	public int cube(int no)
	{
		return no*no*no;
	}
}
