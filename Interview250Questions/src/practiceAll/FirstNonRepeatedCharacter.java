package practiceAll;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input: automation output : u
		
		String input = "automation";
		char[] inputarray = input.toCharArray();
		for(int i= 0; i< input.length();i++)
		{
			int count = 1;
			for(int j =i+1; j < input.length(); j++)
			{
				if(inputarray[i] == inputarray[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("non repeating character is: " + inputarray[i]);
				break;
			}
		}

	}

}
