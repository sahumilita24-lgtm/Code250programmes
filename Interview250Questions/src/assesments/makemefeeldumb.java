package assesments;

import java.util.HashMap;
import java.util.Map;

public class makemefeeldumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// vowel and consonants count
		String input = "automation"; // output = count each

		Map<Character, Integer> mp = new HashMap();
		for(char c : input.toCharArray())
		{
			mp.put(c,mp.getOrDefault(c, 0)+1);
			
		}
		
		for(Map.Entry<Character, Integer> entry: mp.entrySet())
		{
			System.out.println(entry.getKey()+ "- " + entry.getValue());
		}

		
	}

}
