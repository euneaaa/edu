package ch02;

public class VariableExample {
    public static void main(String[] args) {
        int score;

        score = 10;
        System.out.println(score);

        score = 20;
        System.out.println(score);

        System.out.println(score+score);
        System.out.println(score);

        score=score+score;
        System.out.println(score);

        final int score2 = 11;  //상수는 한번 입력된 값은 바꿀 수 없다. 앞에 파이널 붙으면 상수


    }
}
