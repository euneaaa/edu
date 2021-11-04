package javastudy.Scheduler;

import java.util.Scanner;

public class Schedule {

    Scanner sc = new Scanner(System.in);
    Day[] days;
    int selet=0;

    public void myschedule(int day){
        this.days = new Day[day];
        for(int i = 0; i<days.length; i++){
            days[i] = new Day();
        }
    }

    public void intput(){
        System.out.println("날짜를 입력하세요 : ");
        int day= sc.nextInt();
        System.out.println("할일을 입력하세요 : ");
        String work = sc.next();
        days[day-1].setWork(work);
    }

    public void view(){
        System.out.println("확인할 날짜를 입력하세요 : ");
        int day = sc.nextInt();
        days[day-1].show();
    }

    public int end(){
        System.out.println("프로그램을 종료합니다");
        return selet = 4;
    }

    public void start(){
        System.out.println("한달 스케쥴 관리 프로그램");
        while (selet!=4){
            System.out.println();
            System.out.println("할일 (입력:1, 보기:2, 끝내기:3)");
            selet = sc.nextInt();
            switch (selet){
                case 1: intput();
                    break;
                case 2: view();
                    break;
                case 3: end();
                    break;
            }
        }
    }

}
