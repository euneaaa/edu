package javastudy.beakjoon.array;

import java.util.Scanner;

public class baekjoon_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int n = A*B*C;
        int[] array = new int[10];
        String[] arrn =String.valueOf(n).split("");
        for(int i =0; i<10; i++){
            int count = 0;
            for(int j= 0; j<arrn.length; j++){
                if(Integer.parseInt(arrn[j])==i){
                    count++;
                    array[i]=count;
                }
            }
        }
        for(int num : array){
            System.out.println(num);
        }
    }
}
