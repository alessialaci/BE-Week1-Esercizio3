package numero3;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	    String input;
	    
	    do {
	        System.out.printf("%nInserisci una stringa (:q per uscire): ");
	        input = scanner.nextLine();
	        for (int i = 0; i < input.length(); i++) {
	            System.out.print(input.charAt(i) + ", ");
	        }
	    } while (!input.equals(":q"));
	    
	    scanner.close();
	}


}
