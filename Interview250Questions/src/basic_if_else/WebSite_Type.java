package basic_if_else;

import java.util.Scanner;

public class WebSite_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*24)  Determine the Type of Website Based on Domain (.com, .org, .edu, etc.) 
:- take the Site URL input from the user 
Example Scenarios
Input: example.com
Output: The website type is: Commercial website
Input: example.org
Output: The website type is: Non-profit organization
Input: example.edu
Output: The website type is: Educational institution
Input: example.gov
Output: The website type is: Government website
Input: example.net
Output: The website type is: Network-related website
Input: example.info
Output: The website type is: Informational website
Input: example.xyz
Output: The website type is: Unknown or other types of websites */
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the site URL like--> example.com");
	if (sc.hasNextLine())
	{
		domaincheck(sc);
	}
	else System.out.println("Site URL cant be empty");
	
	sc.close();

	}

	private static void domaincheck(Scanner sc) {
		// TODO Auto-generated method stub
		String input = sc.nextLine();
		String[] list= input.split("\\.");
		if (list.length< 2)
		{
		 System.out.println("Please enter a valid URL");
		}
		else {
		String domain= list[(list.length)-1].toLowerCase();
		switch(domain)
		{
		case ("com"): System.out.println("The website type is: Commercial website"); break;
		case ("org"): System.out.println("The website type is: Non-profit organization");break;
		case("edu"): System.out.println("The website type is: Educational institution");break;
		case("gov"):System.out.println("The website type is: Government website");break;
		case("net"): System.out.println("The website type is: Network-related website");break;
		case("info"):System.out.println("The website type is: Informational website");break;
		default: System.out.println("The website type is: Unknown or other types of websites");break;
		}
		}
		
		
	}

}
