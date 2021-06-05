package OneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

	private static Scanner sc;
	private static BufferedReader br;


	public static void main(String[] args) {
		Main main = new Main();
//		int remainder = main.Remainder();
//		System.out.println(remainder);
//		double average = main.Average();
//		main.oxquizTotal();
		main.aboveAverage();
	}
	
	// 4344 평균은 넘겠지 2021.06.05
	public void aboveAverage() {
	 
		sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i = 0 ; i < testCase ; i++) {
			double average = 0;
			double sum = 0;
			double count = 0;
			int studentCount = sc.nextInt();
			int[] averagePerStudentArray = new int[studentCount];
			for(int j = 0 ; j < averagePerStudentArray.length ; j++) {
				averagePerStudentArray[j] = sc.nextInt();
				sum += averagePerStudentArray[j];
			}
			
			average = sum / studentCount;
			
			for(int k = 0 ; k < averagePerStudentArray.length ; k++ ) {
				if(average < averagePerStudentArray[k]) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/studentCount)*100);
		}
		
	}
	
	// ox 퀴즈 2021.06.05
	public void oxquizTotal() {

		sc = new Scanner(System.in);
		String[] OXArray = new String[sc.nextInt()];
		for(int i = 0 ; i < OXArray.length ; i++) {
			int total = 0;
			int circleCount = 0;
		    OXArray[i] = sc.next();
			for(int j = 0 ; j < OXArray[i].length() ; j++) {
				if(OXArray[i].charAt(j) == 'O') {
					circleCount++;
				}else if(OXArray[i].charAt(j) == 'X') {
					circleCount = 0;
				}
				total += circleCount;
			}
			System.out.println(total);
		}
	}

	// 나머지 2021.06.02
	public int Remainder() {
		sc = new Scanner(System.in);
		// 1. 숫자 열개를 입력 받는다. 이를 42로 나눈 나머지를 구한다. 값이 다르면 1증가한다.
		int[] arr = new int[10];
		List<Integer> list = new ArrayList<>();
		int count = 0;
		for (int a : arr) {
			a = sc.nextInt() % 42;
			// reult1 = 1, reult2 = 2, reult3 = 3
			if (!list.contains(a)) {
				list.add(a);
			}
		}
		return list.size();
	}

	// 평균 2021.06.03 bufferdReader 공부하면서 사용해볼것
	public double Average() {
		// 1. 첫째 줄에 시험과목 N 개 주어짐, 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다.
		// 이 값은 100보다 작거나 같은 음이 정수이고, 적어도하나는 0보다 크다
		// 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2(제곱) 이하이면 정답이다.
		double result = 0.;
		br = new BufferedReader(new InputStreamReader(System.in));
		List<Double> mList = new ArrayList<>();
		try {
			double[] count = new double[Integer.parseInt(br.readLine())];
			// 3 , 30, 80, 60
			for (double a : count) {
				a = Integer.parseInt(br.readLine());
				mList.add(a);
			}

			Collections.sort(mList);
			// 30 60 80, 30 80
			for (int i = 0; i < mList.size(); i++) {
				result += (mList.get(i) / mList.get((mList.size() - 1))) * 100;
			}
			result = result / mList.size();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
