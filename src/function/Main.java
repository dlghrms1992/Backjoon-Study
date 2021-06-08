package function;

import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Main main = new Main();		
		Scanner scanner = new Scanner(System.in);	
//		int[] a = new int[scanner.nextInt()];
//		long sum = test.sum(a);
		
//		main.SelfNumber();
	
		System.out.println(main.ArithmeticSequnce(scanner.nextInt()));
		
	}

	// 1065 한수 2021.06.06
	private int ArithmeticSequnce(int num) {
		
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
	void SelfNumber() {
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
