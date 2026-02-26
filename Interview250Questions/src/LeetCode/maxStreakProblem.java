package LeetCode;

import java.util.Arrays;
import java.util.List;

public class maxStreakProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//("YYY","YNY", "YYY", "YYY", "YYY") this is the code run outputs List from which you have to find the max streak where there is no "N"
		//currentStreak =0 maxStreak= 3; output: max streak is 3
		
		List<String> input = Arrays.asList("YYY","YNY", "YYY", "YYY", "YYY");
		int currentStreak =0;
		int maxStreak =0;
		for(String s: input)
		{
			if(!s.contains("N"))
			{
				currentStreak = currentStreak +1;
				maxStreak = Math.max(currentStreak, maxStreak);
				
			}
			else {
				currentStreak =0;
			}
		}
		
		System.out.println("max Streak is: "+  maxStreak);
		

	}

}
