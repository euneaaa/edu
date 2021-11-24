package javastudy.beakjoon.array;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        double sum = 0;
        for(int i = 0; i<N; i++){
            sum += ((double)array[i]/array[N-1])*100;
        }
        System.out.println(sum/N);
    }
}
