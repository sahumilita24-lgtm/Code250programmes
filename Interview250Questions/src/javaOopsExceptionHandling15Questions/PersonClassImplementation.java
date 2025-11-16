package javaOopsExceptionHandling15Questions;

public class PersonClassImplementation {
	/* Person Class Implementation
	Create a class "Person" with attributes "name" and "age". Create two instances and print their details.
			 */
			
			
//input:Create Person objects with names "John" (25) and "Alice" (30)
//output: Name: John, Age: 25 Name: Alice, Age: 30
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		obj1("John", 25);
		obj1("Alice", 30);
		
		

	}
	
	public static void obj1(String name, int age)
	{
		System.out.println("Name: " +  name + " " + "Age: " + age);
	}

}
