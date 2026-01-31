package practiceAll;

public class MissingNumber_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//given num 1-n with one missing, find missing number
		// input= {1,2,3,5} output = 4
		
		int[] input = {1,2,3,5};
		int j =0;
		for(int temp: input)
		{
			if(1+j == temp)
			{
				j = temp;
				continue;
			}
			else {
				int missingnum = j+1;
				System.out.println("Missing number: " + missingnum );
			}
		}

	}

}
