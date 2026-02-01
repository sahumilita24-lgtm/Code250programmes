package assesments;

public class makemefeeldumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// count eac character

		String input = "java";
		char[] inputarray = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			int count = 0;
			for (int j = 0; j < input.length(); j++) {
				if (inputarray[i] == inputarray[j]) {
					count++;
				}

			}
			if (input.indexOf(inputarray[i]) == i) {
				System.out.println(inputarray[i] + " = " + count);
			}
		}

	}

}
