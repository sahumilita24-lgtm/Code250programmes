package practiceAll;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterOccuranceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input= "testing" output: t =2; e=1;s=1;i=1;n=1;g=1

		String input = "Testing";
		usingForloop(input.toLowerCase()); // to lower so in comparision there wont be problem
		usingHashMap(input.toLowerCase());
	}

	public static void usingForloop(String input) {
		for (int i = 0; i < input.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					count++;
				}

			}

			if (input.indexOf(input.charAt(i)) == i) { // only indexof used: it will filter the second occur and the 1st
														// occurance counts the count
				System.out.print(input.charAt(i) + " = " + count + " ");
			}

		}

		System.out.println(" ");
	}

	public static void usingHashMap(String input) {
		Map<Character, Integer> hm = new HashMap<>();
		// adding data to hashmap
		for (int i = 0; i < input.length(); i++) {

			hm.put(input.charAt(i), hm.getOrDefault(input.charAt(i), 0) + 1); 
			// getordefault sets the value to 0 then adds 1 here if not added earlier 
			// if key already exist it adds 1 again

		}

		// printing
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {

			System.out.print(entry.getKey() + "  :  " + entry.getValue());
		}

	}

}
