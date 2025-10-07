package tasks_Programmes;

public class SecondLargeNuminArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * I want you to find the second maximum number in this array int[] numbers =
		 * {12, 34, 10, 1, 100, 3, 4, 32}; O/P → 34 ,don’t use sorting function.
		 */
		int[] numbers = {12, 34, 10, 99, 10, 3, 4, 9};
		int max = numbers[0];
		int secondmax= 0;
		for (int i = 1; i<=numbers.length-1; i++)
		{
			if (max <= numbers[i])
			{
				secondmax= max;
				max = numbers[i];
			}
			else if (secondmax < numbers[i])
			{
				secondmax= numbers[i];
			}
		}
		

		System.out.println("Second highest number is: " + secondmax);
		

	}

}
