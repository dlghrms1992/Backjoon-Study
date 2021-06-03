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
		double average = main.Average();
		System.out.println(average);
	}
	
	//������ 2021.06.02
	 public int Remainder() {
		sc = new Scanner(System.in);
		//1. ���� ������ �Է� �޴´�. �̸� 42�� ���� �������� ���Ѵ�. ���� �ٸ��� 1�����Ѵ�.
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
	 
	 //��� 2021.06.03 bufferdReader �����ϸ鼭 ����غ���
	 public double Average() {
		 //1. ù° �ٿ� ������� N �� �־���, �� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����.
		 //�� ���� 100���� �۰ų� ���� ���� �����̰�, ����ϳ��� 0���� ũ��
		 //ù° �ٿ� ���ο� ����� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10-2(����) �����̸� �����̴�.
		 double result = 0.;
		 br = new BufferedReader(new InputStreamReader(System.in));
		 List<Double> mList = new ArrayList<>();
		 try {
			double[] count = new double[Integer.parseInt(br.readLine())];
			// 3 , 30, 80, 60
			for(double a : count) {
				a = Integer.parseInt(br.readLine());
				mList.add(a);
			}
		
			Collections.sort(mList);	
			// 30 60 80, 30 80
			for(int i = 0 ; i < mList.size() ; i++  ) {
				result += (mList.get(i) / mList.get((mList.size() - 1)))*100;
			}
			result = result/mList.size();
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
