package practiceAll;

public class FindDuplicatesinAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Programming";
		char[] inpuarray = input.toCharArray();
		for (int i = 0; i < inpuarray.length; i++) {
			int count = 1;
			for (int j = i+1; j < inpuarray.length; j++) {

				if (inpuarray[i] == inpuarray[j]) {
					count++;
				}
				
				}
			boolean indexcondition =input.indexOf(inpuarray[i]) == i;
			
			if (count > 1 && indexcondition) {
				System.out.println(inpuarray[i]);


			}
		}

	}

}
