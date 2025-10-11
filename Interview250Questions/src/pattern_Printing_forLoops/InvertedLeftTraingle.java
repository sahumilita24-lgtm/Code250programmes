package pattern_Printing_forLoops;

public class InvertedLeftTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * * * *
		   * * *
		     * *
		 	   *
		 */
		
		int n =7;
		for (int i=0; i < n; i++)
		{
			for (int k = 0; k < i; k++)
			{
				System.out.print(" ");
			}
			for(int j = i; j< n; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
