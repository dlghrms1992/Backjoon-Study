package StringAlghorithm;

import java.util.Scanner;

class Main {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
//		System.out.println(ASCIIConversion(scanner.next()));
//		System.out.println(NumberWithoutSpace());
//		FindAlpahbet();
//		StringRepeat();
		EnWord();
		
	}

	private static void EnWord() {
		
		sc = new Scanner(System.in);
		int[] arr =  new int[26];
		String s = sc.next().toUpperCase();
		int max = -1;
		char ch = '?';
		
		for(int i = 0 ; i < s.length() ; i++) {
			arr[s.charAt(i)-65]++;
			
			if(max<arr[s.charAt(i)-65]) {
				max = arr[s.charAt(i)-65];
				ch = s.charAt(i);
			}else if(max == arr[s.charAt(i)-65]){
				ch = '?';
			}
				
		}

		System.out.println(ch);
		
	}

	private static void StringRepeat() {
		sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++) {
			
			int R = sc.nextInt();
			String s = sc.next();
			for(int j = 0 ; j < s.length() ; j++) {
				for(int k = 0 ; k < R ; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}	
		
	}

	private static void FindAlpahbet() {
		
		sc = new Scanner(System.in);
		int[] arr = new int[26];
		String s = sc.nextLine();

		for(char a = 'a' ; a <= 'z'  ; a++) {
			System.out.print(s.indexOf(a) + "");
		}
//		for(int i = 0 ; i < arr.length ; i++) {
//			arr[i] = -1;
//		}
//
//		for(int i = 0 ; i < s.length() ; i ++) {
//			char ch = s.charAt(i);
//			if(arr[ch - 'a'] == -1) {
//				arr[ch - 'a'] = i;
//			}
//		}
//
//		for(int value : arr) {
//			System.out.print(value + " ");
//		}
	}

	private static int NumberWithoutSpace() {
		
		 sc = new Scanner(System.in);
		 int N = sc.nextInt();
		 int[] arr = new int[N];
		 String text = sc.next();
		 sc.close();
		 int sum = 0;
		 
		 for(int i = 0 ; i < N ; i++) {
			 sum += text.charAt(i)-'0';
		 }
		 
		return sum;
	}

	public static int ASCIIConversion(String text) {
	
		int conversionNumber = text.charAt(0);
		
		return conversionNumber;
	}
}
