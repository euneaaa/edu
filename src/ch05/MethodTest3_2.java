package ch05;

public class MethodTest3_2 {
    public static void main(String[] args) {
        int Val = getRandom(40,50); //두 수 사이의 랜덤한 값을 리턴하는 메소드 구현
        System.out.println(Val);

    }
    public static int getRandom(int n1,int n2){
        int result = (int)(Math.random()*(n2-n1+1))+n1;
        return result;
    }
}
