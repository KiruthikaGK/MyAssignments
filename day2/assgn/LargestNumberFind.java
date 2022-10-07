package week1.day2.assgn;

import java.util.Arrays;

public class LargestNumberFind {

public static void main(String[] args) {
	
int[] numbers = {5,8,7,4,2,9,7,1}; //initialize the value
int position = 2; // find the 2nd largest number
int size = numbers.length; 
Arrays.sort(numbers);  //sort the numbers
System.out.println( position +"nd Largest number is: "+ numbers[size-position]); // print the value

}  

}
