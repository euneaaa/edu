package ch04;

import java.util.Scanner;

public class  ScannerExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Scanner = 래퍼런스 타입. new는 새로운 객체를 만들 때 써준다.
        System.out.println("나이를 입력하세요 : ");
        int age = scan.nextInt();
        System.out.println("나이 : "+age);


    }

}
