package practiceAll;

public class SwapNumberswithouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=30;
		int j=20;
		//after swap j=10 and i=2o;
		SwapNumberswithouttemp.usingtemp(i, j);
		SwapNumberswithouttemp.arithmatic(i, j);
		waste(i,j);
		System.out.println(i + " " + j );
	}
	public static void usingtemp(int i,int j)
	{
		System.out.println("Before: " + "i: " + i + " j: " + j);
		int temp=i;
		i=j;
		j=temp;
		System.out.println( "After:" + "i: " + i + " j: " + j);
	}
	
	public static void arithmatic(int i, int j)
	{
		System.out.println("Before: " + "i: " + i + " j: " + j);
		i = i + j;
		j = i - j;
		i = i -j;
		System.out.println("After: " + "i: " + i + " j: " + j);
	}
	
	public static void waste(int i, int j)
	{
		i =200;
		j =300;
		
	}

}
