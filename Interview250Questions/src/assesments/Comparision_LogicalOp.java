package assesments;

public class Comparision_LogicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a == b: false a > b: true a < b: false (a > b) && (a > 0): true (a < b) || (a > 0): true !(a > b): false
		//input 10,5
		int a =10, b =5;
		System.out.println("a == b: "+ (a==b));
		System.out.println("a > b: "+ (a > b));
		System.out.println("a < b: "+ (a < b));
		System.out.println("(a > b) && (a > 0): "+ ((a > b) && (a > 0)));
		System.out.println("(a < b) || (a > 0): "+ ((a < b) || (a > 0)));
		System.out.println("!(a > b): " + (!(a > b)));
		
		
		
		

	}

}
