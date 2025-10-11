package pattern_Printing_forLoops;

public class ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * * * *
		  * * *
		   * *
		    * 
		 */
		int n =7;
		for (int i=0; i< n; i++)
		{
			for (int space =0; space < i; space++)
			{
				System.out.print(" ");
			}
			
			for (int starcount = i;starcount < n;starcount++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
