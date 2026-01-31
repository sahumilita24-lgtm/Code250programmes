package assesments;

public class ArithmaticAssignment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * Requirements:** - Use +, -, *, /, % operators - Demonstrate assignment
		 * operators (=, +=, -=, *=, /=) - Show the results of each operation
		 */
		
		//Addition: 15 Subtraction: 5 Multiplication: 50 Division: 2 Modulus: 0,Input: 10 5
		
		ArithmaticAssignment ab = new ArithmaticAssignment();	
		ab.encapsulation(5, 10);
		ab.getNum();
		
		
	}
	private int num; // outside of the method so no error
	public void encapsulation(int a, int b)
	{
		num = 34;
		System.out.println("Addition: "+ (a + b));
		System.out.println("Subtraction: "+ (a-b));
		System.out.println("Multiplication: "+ (a*b));
		System.out.println("Division: "+ (a/b));
		System.out.println("Modulus: "+ (a%b));
	}
	public int getNum() {
		System.out.println(num);
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	

}
