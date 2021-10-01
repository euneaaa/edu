package ch04;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0; int num =0;
        System.out.println("숫자를 입력하세요 (정지:0) : ");
        num = scan.nextInt();

        while (num!=0){
            sum = sum+num;      //sum+=num???
            System.out.println("숫자를 입력하세요 (정지:0) : ");
            num = scan.nextInt();
        }
            System.out.println("더한 수 : " + sum);
        }
}

