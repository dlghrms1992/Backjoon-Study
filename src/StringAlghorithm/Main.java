package StringAlghorithm;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(ASCIIConversion(scanner.next()));
		
	}

	 public static int ASCIIConversion(String text) {
	
		int conversionNumber = text.charAt(0);
		
		return conversionNumber;
	}
}
