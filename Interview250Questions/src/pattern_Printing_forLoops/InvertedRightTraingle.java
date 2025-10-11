package pattern_Printing_forLoops;

public class InvertedRightTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * * *		00 01 02
		 * *		10 11 12
		 *			20 21 22
		 */

		int n = 5;
		for (int i =n-1; i>= 0; i--)
		{
			for (int j =0; j <=i;j++ )
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
