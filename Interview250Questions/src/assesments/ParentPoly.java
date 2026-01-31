package assesments;

public class ParentPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("I am parent from main");
		ParentPoly.hiParent(3); // Overloading on static method check

	}
	
	
	public static void hiParent()// Method hiding
	{
		System.out.println("Hi PArent method");
	}
	// Overloading examples
	public static void hiParent(int a) //overloading can be done on static method
	{
		System.out.println("Hi PArent method parametered");
	}
	
	public void overloadingParent(String name) // validate in child whether code works if diff paramer used
	{
		System.out.println("overloadingParent");
	}
	
	public static void overloadingstatic()
	{
		System.out.println("Parent static overloading example");
	}
	
	//hiding examples
	
	public static void overriddenParent(int a)
	{
	 System.out.println("Overriden Parent static : acts as Method hiding");	
	}

	//Overing
	public void overrideex(String name)
	{
		System.out.println("Exampl of Oveering from Parent");
	}
}
