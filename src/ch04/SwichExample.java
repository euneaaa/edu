package ch04;

public class SwichExample {
    public static void main(String[] args){
        int num = (int)(Math.random() *6 +1);   //스위치는 실수,블룬 불가능. 정수,문자열만 가능

        switch (num){
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            default:        //디폴트 위치는 맨 앞에 나오거나 맨 뒤나 중간도 상관없다.
                System.out.println("6번이 나왔습니다.");
                break;

        }

    }
}
