package LeetCode;

public class stringReverseTwoPointerApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hello --> olleh
		
		String input ="Hello";
		char x[] = input.toCharArray();
		int left= 0;
		int right= x.length-1;
		char temp;
		
		while(left< right)
		{
			temp= x[left];     
			x[left]= x[right];
			x[right]= temp;
			left++;
			right--;
		}
		
		System.out.println(x);

	}

}
