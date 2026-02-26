package LeetCode;

public class palindromeTwoPointerApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/valid-palindrome/
		
		if(palindrome() == true)
		{
			System.out.println("is palindrome");
		}
		else System.out.println("not palindrome");
		

	}
	
	public static boolean palindrome()
	{
	String input  = "A man, a plan, a canal: Panama";
	char chararray[]= input.toCharArray();
	int left=0;
	int right =chararray.length-1;
	
	while(left< right)
	{
		while(left< right && !Character.isLetterOrDigit(chararray[left]))
		{
			left++;
		}
		
		while(left< right && !Character.isLetterOrDigit(chararray[right]))
		{
			right--;
		}
		
		if (Character.toLowerCase(chararray[left])!= Character.toLowerCase(chararray[right]))
		{
			return false;
		}
		left++;
		right--;
	}
	
	return true;
	}
	

}
