package javastudy.beakjoon.function;

import java.util.Scanner;

public class baekjoon1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num<100){
            System.out.println(num);
        }
        else {
            int result = 99;
            if(num==1000){
                num=999;
            }
            for(int i = 100; i<num; i++){
                int a = i/100;
                int b = i/10%10;
                int c = i%10;

                if((a-b)==(b-c)){
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
