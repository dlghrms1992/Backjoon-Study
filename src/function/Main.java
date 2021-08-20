package function;

import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Main main = new Main();		
		Scanner scanner = new Scanner(System.in);	
//		int[] a = new int[scanner.nextInt()];
//		long sum = test.sum(a);
		
//		main.SelfNumber();
	
		System.out.println("==================== Start =======================");
		System.out.println("알고리즘 문제 번호를 입력하세요 ~~~~~~~~~~~~~~~");
		
		int num = scanner.nextInt();
		ProblumNumber(num);
		
//		System.out.println(main.ArithmeticSequnce(scanner.nextInt()));
		System.out.println("==================== END =======================");
		
	}

	public static void ProblumNumber(int num) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	
		
		switch(num){
			case 1065:
				System.out.println(ArithmeticSequence(a));
				break;
			case 4673:
				SelfNumber();
				break;
			default:
				System.out.println("해당 문제를 아직 풀지 못했거나, 없는 문제입니다.");
		}
		
	}

	// 1065 한수 2021.06.06
	private static int ArithmeticSequence(int num) {
		
	
		int cnt = 0;
		
			if(num < 100) {
				return num;
			}else {
				cnt = 99;
				if(num == 1000) {
					num = 999;
				}
				for(int i = 100 ; i <= num ; i++) {
					int hun = i / 100; 
					int ten = (i / 10) % 10; 
					int one = i % 10; 
					if((hun - ten) == (ten - one)) {
						cnt++;
					}
				}	
					
			}
			return cnt;
	}


	// 4673 셀프넘버 2021.06.06
	static void SelfNumber() {
		boolean[] check = new boolean[10001];
		
		for(int number = 1 ; number <= 10000 ; number++) {
			int n = d(number);
			if(n <= 10000) {
				check[n] = true;
			}
		}
		
		for(int i = 1 ; i < 10001 ; i++) {
			if(!check[i]) {
				System.out.println(i);
			}
		}
	}

	public int d(int number) {
		
		int n = number;
		
		while( number > 0 ) {
			n += number%10; 
			number /= 10;
		}
		
		return n;
	}

	// 15596번 정수의 합 2021.06.06
	private long sum(int[] a) {
		long total = 0;

		for(int i = 0 ; i < a.length ; i++) {
			total += a[i];
		}
		
		return total;
	}

}
