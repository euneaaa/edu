package javastudy.beakjoon.if_for_while;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList cycle = new ArrayList();
        int N = sc.nextInt();
        int result = 0;
        while (true){
            int f = 0;
            if(result ==0){
                f= N;
            }else {
                f = result;
            }
            int a = f/10;
            int b = f%10;
            int re = a+b;
            if(re>9){
                re = re%10;
            }
            String res = b+""+re;
            result = Integer.parseInt(res);
            cycle.add(result);
            if(N==result){
                break;
            }
        }
        System.out.println(cycle.size());
    }
}
