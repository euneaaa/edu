package javastudy;

import java.util.Scanner;

/*
특정 조건을 만족하는지 확인 후에 True, False에 따라 다음 실행을 결정하는 명령문
   if문, if-else문, if-else if-else문, 중첩if문, switch문

   if문은 조건식이 true일 경우에 안의 실행문을 실행
        (else는 조건식이 false일 때 실행문을 실행)
   switch문은 변수의 값에 따라 실행문이 선택

*/
public class Condition1 {
    //임의의 정수 3개를 입력 받아 가장 큰 수를 출력하는 프로그램을 구현하기.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num1 입력");
        int num1 = sc.nextInt();
        System.out.print("num2 입력");
        int num2 = sc.nextInt();
        System.out.print("num3 입력");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("제일 큰 수 = " + num1);
            } else {
                System.out.println("제일 큰 수 = " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("제일 큰 수 = " + num2);
            } else {
                System.out.println("제일 큰 수 = " + num3);
            }
        }
    }

}

class Condition2 {
    //임의의 정수를 입력 받은 뒤 해당 값이 3의 배수인지 아닌지 확인하는 프로그램 구현.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("임의 정수 입력");
        int num = sc.nextInt();
        if (num % 3 == 0) {
            System.out.println(num + "은 3의 배수");
        }
        else {
            System.out.println(num + "은 3의 배수가 아님");
        }
    }
}

class Condition3 {
    //사용자로부터 월을 입력 받고 월에 따라 월의 일수를 출력하는 프로그램 구현.
    //달이 아닌 숫자를 입력 받으면 해당 달은 존재하지 않습니다 출력.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println(num + "월은 31일");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println(num + "월은 30일");
                break;
            case 2:
                System.out.println(num + "월은 29일");
                break;
            default:
                System.out.println("해당 달은 존재하지 않습니다");
        }
    }
}