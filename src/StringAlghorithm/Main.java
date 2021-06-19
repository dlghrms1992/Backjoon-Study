package StringAlghorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		System.out.println(ASCIIConversion(scanner.next()));
//		System.out.println(NumberWithoutSpace());
//		FindAlpahbet();
//		StringRepeat();
//		EnWord();
//		numberOfwords();
//		try {
//			speakConstant();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		dial();
//		CroatiaAlphabet();
		
		int count = 0;
		int n = sc.nextInt();	
		
		for(int i = 0 ; i < n ; i++) {
			
			if(groupWordChecker()== true) {
				count++;
			}
		}
		
		System.out.println(count);
	}

	private static boolean groupWordChecker() {
		
		boolean[] checker = new boolean[26];
		int prev = 0;
		String word = sc.next();
		
		for(int i = 0 ; i < word.length() ; i++) {
			int now = word.charAt(i);
			
			if(prev != now) {
				
				if(checker[now - 'a'] == false) {
					checker[now - 'a'] = true;
					prev = now;
				}else {
					return false;
				}
			}else {
				continue;
			}
		}
		return true;
		
	}

	private static void CroatiaAlphabet() {
		
		sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		int count = 0;
		
		for(int i = 0 ; i < text.length() ; i++) {
			
			char ch = text.charAt(i);
			
			if(ch == 'c') {
				if( i < text.length() -1 ) {
					if(text.charAt(i+1) == '=') {
						i++;
					}
					else if(text.charAt(i + 1) == '-') {
						i++;
					}					
				}
			}else if(ch == 'd') {
				if( i < text.length() -1) {					
					if(text.charAt(i + 1) == 'z') {
						if(i < text.length() - 2) {
							if(text.charAt(i + 2) == '=') {
								i += 2;
							}					
						}
					}else if(text.charAt(i + 1) =='-') {
						i++;
					}
				} 
			}else if(ch == 'l') {
				if(i < text.length() - 1) {
					if(text.charAt(i + 1) == 'j') {	
						i++;
					}
				}
			}else if(ch == 'n') {
				if(i < text.length() - 1) {
					if(text.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}else if(ch == 's') {
				if(i < text.length() - 1) {
					if(text.charAt(i + 1) == '=') {	
						i++;
					}
				}
		    }else if(ch == 'z') {
				if(i < text.length() - 1) {
					if(text.charAt(i + 1) == '=') {	
						i++;
					}
				}
			}
			count++;
		}
		
		System.out.println(count);
		
	}

	private static void dial() {
		
		sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		
		int count = 0;
		int k = text.length();
		
		for(int i = 0 ; i < k ; i++) {
			
			switch(text.charAt(i)) {
				
				case 'A' : case 'B' : case 'C' :
					count += 3;
					break;
					
				case 'D' : case 'E' : case 'F' :
					count += 4;
					break;
					
				case 'G' : case 'H' : case 'I' :
					count += 5;
					break;
					
				case 'J' : case 'K' : case 'L' :
					count += 6;
					break;
					
				case 'M' : case 'N' : case 'O' :
					count += 7;
					break;
				case 'P' : case 'Q' : case 'R' : case 'S' :
 					count += 8;
					break;
					
				case 'T' : case 'U' : case 'V' :
					count += 9;
					break;
					
				case 'W' : case 'X' : case 'Y' : case 'Z' :
					count += 10;
					break;
			}
		}
		
		System.out.println(count);
		
	}

	private static void speakConstant() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.println(A > B ? A : B);
		
	}

	private static void numberOfwords() {
		
		sc = new Scanner(System.in);
		String words = sc.nextLine();
		StringTokenizer st = new StringTokenizer(words, " ");
		
		System.out.println(st.countTokens());
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
