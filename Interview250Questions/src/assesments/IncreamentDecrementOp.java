package assesments;

public class IncreamentDecrementOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Original: 5 Pre-increment: 6 Post-increment: 6 (returned 6) Pre-decrement: 5 Post-decrement: 5 (returned 5)
		//input =5
		
		int input =5;
		System.out.println("Original: "+ input);
		System.out.println("Pre-increment: "+ ++input);
		System.out.println("Post-increment: "+ input++); //Value is 7 now post this step
		System.out.println("Pre-decrement: "+ --input);
		System.out.println("Post-decrement: "+ input--);
		

	}

}
