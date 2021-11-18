package javastudy.beakjoon.if_for_while;

import java.util.Scanner;

public class baekjoon11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] array = new int[T];
        for(int i=0;i<array.length; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            array[i] = A+B;
        }
        System.out.println(T);
        for(int i=0; i<array.length; i++){
            System.out.printf("Case #%d: %d\n", (i+1), array[i]);
        }
    }
}
