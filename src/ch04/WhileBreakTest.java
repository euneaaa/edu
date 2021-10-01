package ch04;

import java.util.Scanner;

public class WhileBreakTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0; int num =0;

        while(true){
            System.out.println("숫자를 입력하세요 (정지:0) : ");
            num =scan.nextInt();
            if(num == 0){
                break;
            }
            sum=num+sum;
        } System.out.println("합계 : "+sum);
    }
}
