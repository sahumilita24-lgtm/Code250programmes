package pattern_Printing_forLoops;

public class LeftTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 		*		00 01 02 03
		 	*	*		10 11 12 13
		* 	*	*		20 21 22 23
	*	*	*	*		30 31 32 33
		 */
		int n=4;
		for (int i =0; i<n; i++)
		{
			for (int j =1; j< n-i; j++)
			{
				System.out.print("-");
			}
			/*
			 * for (int k= n-i; k <= n; k++) { System.out.print("*"); }
			 */
			
			for (int k =0 ; k <=i; k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		

	}

}
