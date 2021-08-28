package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

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
		
//		int a = sc.nextInt();
	
		
		switch(num){
			case 1065:
//				System.out.println(ArithmeticSequence(a));
				break;
			case 4673:
				SelfNumber();
				break;
			case 2869:
			try {
				SnailWantToGoUp();
			} catch (IOException e) {
				e.printStackTrace();
			}
				break;
			case 10250:
					ACMHotel();
				break;
			default:
				System.out.println("해당 문제를 아직 풀지 못했거나, 없는 문제입니다.");
		}
		
	}
	
	// 10250 ACM 호텔
	/**
	 * 포인트1  - 손님들은 가장짧은거리를 걸어서 방에 도착
	 * 각 층에 w개의 방이 있는 h층 건물
	 * h * w 형태의 호텔
	 * 방번호는 YXX나 YYXX -> YY, Y 는 층수, XX는 엘리베이터부터 세었을 때 번호 
	 * 엘레베이터 이동거리는 신경쓰지 않음 다만 걷는 거리가 같을 때에는 아래층의 방을 더선호 
	 */
	public static void ACMHotel() {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i = 0 ; i <t ; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
		
			if(n%h == 0) {
				System.out.println((h * 100) + (n/h));
			}else {
				System.out.println(((n%h)*100) + ((n/h) + 1));
			}		
		}
				
		
	}

	//2869 달팽이는 올라가고싶다.
	private static void SnailWantToGoUp() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int day = (v - b) / (a-b);
		// a3 b 1 v8 = (8-1)  1일차 2a 1b = 1v 2일차 3a 1b = 2v 3일차 4a - 1b = 3v 4일차 5v 
		if((v-b)%(a-b) != 0) {
			day++;
		}
		
		System.out.println(day);
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
			int n = (number);
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
