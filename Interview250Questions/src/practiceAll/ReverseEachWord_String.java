package practiceAll;

public class ReverseEachWord_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input = I love Java" output: "i evol avaj"
		String input = "I am love Java i";
		reverseword(input);

	}

	public static void reverseword(String input) {
		String[] splittedInput = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String s : splittedInput) {
			if (s.length() < 2) {
				sb.append(s);
			}

			else {
				char[] char_current = s.toCharArray();
				for (int i = char_current.length - 1; i >= 0; i--) {
					sb.append(char_current[i]);
				}

			}
			
			sb.append(" "); 
		}

		System.out.println(sb.toString().trim()); // so that white space will be removed which appended in the end
	}

}
