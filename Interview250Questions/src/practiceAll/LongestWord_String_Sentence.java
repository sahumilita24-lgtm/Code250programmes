package practiceAll;

public class LongestWord_String_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input : "i love automation testing" output: automation
		String input = "i love automation technologies more";
		String[] inputarray = input.split(" ");
		String sb = " ";
		int maxLength = 0;
		for (int i = 0; i < inputarray.length; i++) {
			String s = inputarray[i];

			if (s.length() > maxLength) {
				maxLength = s.length();
				sb = inputarray[i];

			}

		}
		System.out.println(sb);

	}

}
