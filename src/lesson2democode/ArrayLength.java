package lesson2democode;

import java.util.Arrays;

public class ArrayLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// demo code to find the length of single and multi dimensional arrays
		int nums[] = { 99, -10, 100123, 18, -978,
				5623, 463, -9, 287, 49 };
		System.out.println("Length of the Array : " + nums.length);
		System.out.println("Array Values are : " + Arrays.toString(nums));
		int x[]= new int[8];
		//int y[]=null;
		System.out.println("Length of the Array : " + x.length);
		String[][] teams={
			{"Joe", "Bob", "Frank", "Steve"},
			{"Jon", "Tom","David"},
			{"Tim", "Bev","Susan","Dennis"},
			};
		int len = 0;
		int y = teams.length; // provide number of rows
		System.out.println("Number of Rows : " + y);
		for(int i=0;i<y;i++)
			len = len + teams[i].length;
		System.out.println("Length of team Array : " + len);
	}
}
