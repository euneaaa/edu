package javastudy;

import java.util.Scanner;

/*
어떤 작업을 계속해서 수행해야 할 경우에 사용
    for문, 중첩for문, foreach문, while문, do-while문, 중첩while문
    (continue문 : continue문을 만나면 반복문의 조건식으로 이동. 반복문을 종료하지 않고 계속 반복을 수행.)
    (break문 : break문을 만나면 반복문을 종료. 반복문을 강제로 종료할 때 사용.)

    for문은 원하는 반복 횟수를 정할 수 있다.
        foreach문 : for(자료형 변수이름 : 배열이름){}
    while문은 반복 종료 조건을 정한 후 조건이 만족할 때까지 반복한다.
        (조건식이 true이면 반복 false면 종료)

 */
public class Repetition1 {
//타이머 제작 (1시간짜리)
    public static void main(String[] args) {
        int sec = 0, min = 0, hour = 0;
        while (hour<1){
            while (min<60){
                while (sec<60){
                    System.out.printf("%d시 %d분 %d초\t",hour,min,sec);
                    sec += 1;
                }
                sec = 0;
                min += 1;
            }
            min = 0;
            hour +=1;
        }
    System.out.printf("%d시 %d분 %d초",hour,min,sec);
    }
}

class Repetiton2 {
    //구구단 만들기
    public static void main(String[] args) {
        //while문 사용
        int num1 = 1;
        while(num1 <= 9) {
            int num2 = 2;
            while(num2 <= 9) {
                System.out.printf(" %d * %d = %d\t",num2,num1,num1*num2);
                num2++;
            }
            System.out.println();
            num1++;
        }

        //for문 사용
        for(int i=1; i<=9; i++){
            for(int j=2; j<=9; j++){
                System.out.printf(" %d * %d = %d\t",j,i,j*i);
            }
            System.out.println();
        }
    }
}
class Repetition3 {
    //가로 세로 길이를 입력받아 *을 직사각형 모양의 형태로 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가로 길이 입력");
        int n = sc.nextInt();
        System.out.print("세로 길이 입력");
        int m = sc.nextInt();

      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Repetition4 {
    //숫자를 입력받아 그 수의 팩토리얼을 구하는 프로그램
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오");
        int num = sc.nextInt();
        int sum = 1;
        for(int i=1; i<=num; i++){
            sum *= i;
        }
        System.out.printf("%d! = %d",num, sum);
    }
}

class Repetition5 {
    //숫자를 입력 받아 숫자의 약수를 모두 더한 값을 출력하는 프로그램
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(n% i == 0) {
                sum += i;
            }
        }
        System.out.println("약수의 합 = " + sum);
    }
}