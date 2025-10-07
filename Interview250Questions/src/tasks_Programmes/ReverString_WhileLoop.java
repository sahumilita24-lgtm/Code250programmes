package tasks_Programmes;

import java.util.Scanner;

public class ReverString_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder bs = new StringBuilder();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the word you want to reverse:");
		String name = sc.nextLine();
		
		reverseStringMethod(bs,name);
		sc.close();
	}
	
	 public static void reverseStringMethod(StringBuilder bs, String name)
	    {

	        int i = name.length()-1;
	        while ( i >=0)
	        {
	            bs = bs.append(name.charAt(i)); 
	            i--;
	        }
	        System.out.println(bs);
	    }

}
