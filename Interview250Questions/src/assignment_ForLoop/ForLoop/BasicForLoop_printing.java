package assignment_ForLoop.ForLoop;

public class BasicForLoop_printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			1️⃣ Print numbers from 1 to 10
			2️⃣ Print even numbers from 1 to 20
			3️⃣ Print "Hello" 5 times
			4️⃣ Print the sum of first 10 natural numbers
			5️⃣ Print the multiplication table of 5	 */
		System.out.println("1️⃣ Print numbers from 1 to 10");
		onetoTen_print();
		
		System.out.println("2️⃣ Print even numbers from 1 to 20");
		evennumber();
		
		System.out.println("3️⃣ Print \"Hello\" 5 times");
		hello5Times();
		
		System.out.println("4️⃣ Print the sum of first 10 natural numbers");
		sum_Natural_Number();
		
		System.out.println("5️⃣ Print the multiplication table of 5	");
		multiplicationTable5();
		
	}
 
	static void onetoTen_print()
	{
		
		for (int i =1; i<=10; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
	
	static void evennumber()
	{
		
		for (int i=1 ; i<=20; i++)
		{
			if(i%2==0)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	static void hello5Times()
	{
		
		for (int i =0 ; i < 5; i ++)
		{
			System.out.print("Hello" + " ");
			
		}
		System.out.println();
	}
	
	static void sum_Natural_Number()
	{
		
		int sum = 0;
		for (int i = 1; i<= 10; i++)
		{			
			sum += i;
			
		}
		System.out.println("Final sum " +sum);	
		
	}
	
	static void multiplicationTable5()
	{
		for (int i =1; i <= 10; i ++)
		{
			System.out.printf("5 X %d = %d %n",i, 5* i );
		}
	}
}
