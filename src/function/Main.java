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
		System.out.println("�˰��� ���� ��ȣ�� �Է��ϼ��� ~~~~~~~~~~~~~~~");
		
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
			case 2775:
				BecomeTheWomensPresident();
			break;
			default:
				System.out.println("�ش� ������ ���� Ǯ�� ���߰ų�, ���� �����Դϴ�.");
		}
		
	}
	/**
	 * 2775 : �γ�ȸ���� ���׾�
	 *  ����� �γ�ȸ���� �ǰ�;� ������ ������� ��� �ݻ�ȸ�� �����Ϸ�����
	 *  �� ����Ʈ�� �����Ϸ��� ������ �ִµ� "a���� bȣ�� ����� �ڽ��� �Ʒ�(a-1)���� 1ȣ���� bȣ���� ������� ���� �ո�ŭ ������� ������ ��ƾ��Ѵٴ� ��� ������`
	 *  �� ��Ű�� ���;� �Ѵ�.
	 *  ����Ʈ�� ����ִ� ���� ���� ��� ���ֹε��� ��������� ��Ű�� �Դٰ� �������� ��, �־����� ���� ���� k�� n�� ���� 
	 *  k���� nȣ�� �� ���� ��� �ִ��� ����϶�. ��, ����Ʈ���� 0������ �ְ� �������� 1ȣ���� ������, 0���� iȣ���� i���� ���.
	 * 
	 *
	 */
	public static void BecomeTheWomensPresident() {
		Scanner sc = new Scanner(System.in);
	
		int[][] apt = new int[15][15];
		
		for(int i = 0 ; i < 15 ; i++) {
			apt[i][1] = 1; // i�� 1ȣ
			apt[0][i] = i; // 0�� iȣ
		}
		
		for(int i = 1 ; i < 15 ; i++) { // 1������ 14������
			
			for(int j = 2 ; j < 15 ; j++) { // 2ȣ���� 14ȣ����
				apt[i][j] = apt[i][j-1] + apt[i-1][j];
			}
		}
		
		int t = sc.nextInt();
		
		for(int i = 0 ; i < t ; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(apt[k][n]);
		}
	}
	
	// 10250 ACM ȣ��
	/**
	 * ����Ʈ1  - �մԵ��� ����ª���Ÿ��� �ɾ �濡 ����
	 * �� ���� w���� ���� �ִ� h�� �ǹ�
	 * h * w ������ ȣ��
	 * ���ȣ�� YXX�� YYXX -> YY, Y �� ����, XX�� ���������ͺ��� ������ �� ��ȣ 
	 * ���������� �̵��Ÿ��� �Ű澲�� ���� �ٸ� �ȴ� �Ÿ��� ���� ������ �Ʒ����� ���� ����ȣ 
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

	//2869 �����̴� �ö󰡰�ʹ�.
	private static void SnailWantToGoUp() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int day = (v - b) / (a-b);
		// a3 b 1 v8 = (8-1)  1���� 2a 1b = 1v 2���� 3a 1b = 2v 3���� 4a - 1b = 3v 4���� 5v 
		if((v-b)%(a-b) != 0) {
			day++;
		}
		
		System.out.println(day);
	}

	// 1065 �Ѽ� 2021.06.06
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


	// 4673 �����ѹ� 2021.06.06
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

	// 15596�� ������ �� 2021.06.06
	private long sum(int[] a) {
		long total = 0;

		for(int i = 0 ; i < a.length ; i++) {
			total += a[i];
		}
		
		return total;
	}

}
