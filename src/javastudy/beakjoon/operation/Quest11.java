package javastudy.beakjoon.operation;

import java.util.Scanner;

public class Quest11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("(3) : "+ (a* (b%10)));
        System.out.println("(4) : "+ (a* (b%100/10)));
        System.out.println("(5) : "+ (a* (b/100)));
        System.out.println("(6) : "+ (a*b));
    }
}
