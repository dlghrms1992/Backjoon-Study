package OneDimensionalArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner sc;
		
	public static void main(String[] args) {
		Main main = new Main();
		int remainder = main.Remainder();
		System.out.println(remainder);
	}
	
	//나머지
	 public int Remainder() {
		sc = new Scanner(System.in);
		//1. 숫자 열개를 입력 받는다. 이를 42로 나눈 나머지를 구한다. 값이 다르면 1증가한다.
		int[] arr = new int[10];
		List<Integer> list = new ArrayList<>();
		int count = 0;
		for(int a : arr){
			a = sc.nextInt()%42;
			// reult1 = 1, reult2 = 2, reult3 = 3
			if(!list.contains(a)) {
				list.add(a);
			}	
		}
		return list.size();
	}

}
