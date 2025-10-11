package pattern_Printing_forLoops;

public class RightTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		*				00
		* *				10 11 
		* * *			20 21 22
	*/
		int num= 4;
		for (int i =0 ; i < num; i++)
		{
			for (int j=0; j<=i; j++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		

	}

}
