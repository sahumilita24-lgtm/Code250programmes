package assignment_WhileLoop.WhileLoop;

public class BasicWhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * 1️⃣ Print numbers from 1 to 10
		 * 
		 * 2️⃣ Print even numbers from 1 to 20
		 * 
		 * 3️⃣ Print "Java" 5 times
		 * 
		 * 4️⃣ Calculate sum of first 10 natural numbers
		 * 
		 * 5️⃣ Print the multiplication table of 7
		 */
		
		System.out.println("1️⃣ Print numbers from 1 to 10");
		print1to10();
		
		System.out.println("2️⃣ Print even numbers from 1 to 20");
		printEvenNumber1to20();
		
		System.out.println("3️⃣ Print \"Java\" 5 times");
		printJava5times();
		
		System.out.println("4️⃣ Calculate sum of first 10 natural numbers");
		sumof_First10_NaturalNumber();
		
		System.out.println("5️⃣ Print the multiplication table of 7");
		multiplication_Table7();
	}
	static void print1to10()
	{
		int i =1;
		while (i <=10)
		{
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
	}
	
	static void printEvenNumber1to20()
	{
		int i =1;
		while (i <=20)
		{
			if(i % 2==0) {System.out.print(i + " ");}
			i++;
		}
		System.out.println();
	}
	
	static void printJava5times()
	{
		int i= 0;
		while(i<5)
		{
			System.out.print("Java ");
			i++;
		}
		System.out.println();
	}
	static void sumof_First10_NaturalNumber()
	{
		int sum=0;
		int i =1;
		while(i<=10)
		{
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
	
	static void multiplication_Table7() {
		int i =1;
		while(i<= 10)
		{
			System.out.printf("7 x %d = %d%n", i,i*7);
			i ++;
		}
	}
	
		
	

}
