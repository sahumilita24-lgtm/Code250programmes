package assesments;

public class makemefeeldumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find second max number
		int[] input = { 10, 45, 22, 89, 67 };
		int max = input[0];
		int secondmax =  Integer.MIN_VALUE;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max) {
				secondmax = max;
				max = input[i];

			} else if (input[i] > secondmax && input[i] < max) {
				secondmax = input[i];
			}
		}
		System.out.println(secondmax);

	}

}
