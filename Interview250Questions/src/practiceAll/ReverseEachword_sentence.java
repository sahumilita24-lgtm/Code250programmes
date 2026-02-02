package practiceAll;

public class ReverseEachword_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input : "i love java" output: "java love i"
		String input ="i love java";
		StringBuilder sb = new StringBuilder();
		String[] inputarray = input.split(" ");
		for(int i= inputarray.length-1; i>=0; i--)
		{
			sb.append(inputarray[i] + " ");
		}
		
		System.out.println(sb.toString().trim());

	}

}
