package week1.day2.assgn;

import java.util.Arrays;

public class FindDuplicate {
	public static void main(String[] args) {
		int c=0;
		int[] numbers = {3,1,3,2,4,5,6,5,8,8};
		int size =numbers.length;
		Arrays.sort(numbers);
		int[] temp = new int[size];
		
		for(int a=0;a<size; a++)
		{
			temp[a]=numbers[a];
		}
		for (int b=1;b<size;b++)
		{
			if(numbers[b-1]==temp[b])
				{c= c+1;
				temp[c-1]=temp[b];
				}
		}
		System.out.println("Duplicates are:");
		for(int d=0;d<c;d++)
		System.out.println(temp[d]);
		
	}


}
