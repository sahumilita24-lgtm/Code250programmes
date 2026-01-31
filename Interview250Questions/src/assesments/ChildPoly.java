package assesments;

public class ChildPoly extends ParentPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("I am main method child class");
		ChildPoly.hiParent(); 
		//method hiding as hiParent is static and same param. After . you cant find parent method hiParent
		
		ChildPoly overloadingExtended = new ChildPoly();
		overloadingExtended.overloadingParent(2);

		//static method overloading
		ChildPoly.overloadingstatic(3);
		//Methid hiding 
		ChildPoly.overriddenParent(0);
		
		//Method Overriding
		overloadingExtended.overrideex("Milita");
	}
	
	//Obverloading examples
	
	public static void hiParent() // Example of Method Hiding
	{
		System.out.println("Hi Child method");
	}
	
	//No static for method overloading
	public void overloadingParent(int a) 
	{
		System.out.println("OverLoading  Child");
	}
	
	public static void overloadingstatic(int b)
	{
		System.out.println("Parent static overloading example");
	}
	
	//hiding examples
	public static void overriddenParent(int a)
	{
	 System.out.println("Overriding Parent from child static but will be method hiding");	
	}
	
	//overriding
	public void overrideex(String name)
	{
		System.out.println("Example of Oveeriding from child");
	}


	
	
}
