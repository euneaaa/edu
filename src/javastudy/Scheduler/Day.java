package javastudy.Scheduler;
/*Schedule 클래스에는 Day 객체 배열과 메소드를 작성
입력, 보기, 끝내기 등의 3개의 기능을 작성

이번달 스케쥴 관리 프로그램.
할일(입력:1, 보기:2, 끝내기:3) >>1
날짜를 입력하세요 : 1
할일을 입력하세요 : 자바공부

할일(입력:1, 보기:2, 끝내기:3) >>2
확인할 날짜를 입력하세요 : 1
자바공부

할일(입력:1, 보기:2, 끝내기:3) >>3
프로그램을 종료합니다.

 */


public class Day {
    private String work;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void show(){
        if(work != null){
            System.out.println(work);
        }else {
            System.out.println("없습니다");
        }
    }
}
