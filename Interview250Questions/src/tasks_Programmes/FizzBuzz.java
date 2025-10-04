package tasks_Programmes;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program that prints numbers from 1 to 100. However, for multiples of 3, 
		 print "Fizz" instead of the number, and for multiples of 5, print "Buzz." 
		For numbers that are multiples of both 3 and 5, print "FizzBuzz." */
		
		//print 1-100 , i % 3== 0 Fizz, i % 5== 0 Buzz , Fizz || buzz --> FizzBuzz
		
		for (int i =1; i<=100;i++)
		{
			if  (i % 5== 0 && i % 3== 0)
			{
				System.out.println("FizzBuzz");
				continue;
				
			}
			else if (i % 3== 0)
			{
				System.out.println("Fizz");
				continue;
			}
			else if  (i % 5== 0)
			{
				System.out.println("Buzz");
				continue;
			}
			
			else System.out.println(i);
		}



	}

}
