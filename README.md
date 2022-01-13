# Backjoon-Study
백준 알고리즘 끝판내기
백준 1011 정리
import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {
        //1011
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0 ; i < T ; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int distance = Y - X;

            int max = (int)Math.sqrt(distance);

            if(max == Math.sqrt(max)){
                System.out.println(max * 2 - 1);
            }else if(distance <= max * max + max){
                System.out.println(max * 2);
            }else {
                System.out.println(max * 2 + 1);
            }
        }


    }
}

#1978
import java.util.*;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i = 0 ; i < num ; i++){
            int x = sc.nextInt();
            if(x == 1) continue;
            if(x%2 == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}

#2581번 -> 1978과 같이 정리
import java.util.Sacnner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
    }
}
