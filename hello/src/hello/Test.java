package hello;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	//	System.out.println("Skriv noget: ");		
	//	System.out.println("Du skrev: " + sc.next());
		
		System.out.println("Skriv alder: ");
		int alder = sc.nextInt();
		
		System.out.println("Skriv højde: ");
		float højde = sc.nextFloat();
		
		System.out.println("Skriv brugernavn: ");
		String username = sc.next(); 
		
		 System.out.println("Du skrev: " + "  " + username + " " + alder + " " + højde);
	
		
	sc.close();
	}

}
