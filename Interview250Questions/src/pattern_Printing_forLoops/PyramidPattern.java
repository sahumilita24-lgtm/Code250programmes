package pattern_Printing_forLoops;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 		*
		 	 *	  *
		   *   *	*
		*    *   *	  *
		
		 */
		int n = 7;
		
		for (int i =0; i < n; i++)
		{
			for (int space=i; space< n-1; space++) //Front space
			{
				System.out.print(" ");
			}
			for(int stars=0; stars<= i;stars++)
			{
				System.out.print("* ");
				//System.out.print(" ");
			}
			
			//Trailing spaces not needed to removed the code written for that
			
			System.out.println();
		}

	}

}
