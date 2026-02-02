package practiceAll;

public class Stringcompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// aaabbc -> a3b2c1
		String input = "aaabbc";
		int count= 1; 
		for(int i = 0; i < input.length(); i++)
		{
			
			if(i< input.length()-1 && input.charAt(i) ==  input.charAt(i+1))
			{
				count++;
			}
			else {
				System.out.print(input.charAt(i)+ "" + count);
				count=1;//setting count to 1 again for next char
			}
		}

	}

}
