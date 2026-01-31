package practiceAll;

public class RemoveDuplicates_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Used indexof() to check for occurance of each character.if current index
		// matched i, i print or append it so that duplicates are removed

		// input = programming output = progamin
		String input = "Programming";
		remove_DuplicateChar(input);

	}

	public static void remove_DuplicateChar(String input) {

		char[] carray = input.toCharArray();
		for (int i = 0; i < carray.length; i++) {
			if (input.indexOf(carray[i]) == i) { // returns the index within this string of the first occurrence of the
													// specified character.
													// in duplicates its still returns the first index of character it
													// got earlier
				System.out.print(carray[i]);
			}
		}
	}

}
