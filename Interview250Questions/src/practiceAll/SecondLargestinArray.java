package practiceAll;

import java.util.Arrays;

public class SecondLargestinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 10, 5, 20, 8, 15, 19 };
		// Second Largest = 19 I have to find
		int secondlargest = secondLargest(array);
		System.out.println(secondlargest);
		bysorting(array);

	}

	public static int secondLargest(int[] array) {
		int max = array[0];
		int secondmax =  Integer.MIN_VALUE;
		for (int temp : array) {
			if (temp > max) {
				secondmax = max;
				max = temp;
			}
			else if (temp > secondmax && temp < max) {
				secondmax = temp;
			}}
		return secondmax;}
	
	public static void bysorting(int[] array)
	{
		Arrays.sort(array);
		System.out.println(array[array.length-2]);
	}
	
	

}
