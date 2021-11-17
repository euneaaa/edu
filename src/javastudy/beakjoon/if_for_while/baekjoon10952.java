package javastudy.beakjoon.if_for_while;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList tc = new ArrayList();
        int result = 1;
        while (result !=0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            result=A+B;
            tc.add(result);
        }
        for(int i =0; i<tc.size()-1; i++){
            System.out.println(tc.get(i));
        }
    }
}
