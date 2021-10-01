package ch05;

public class ArrayExample {
    public static void main(String[] args) {
        //배열(Array)
        /*
        같은 타입의 값을 여러개 저장할 때 좋다.
        for문과 함께 사용하면 좋다.
         */

        int[] scores = {83, 90, 87, 100, 88, 99};    //int형 배열. 래퍼런스.
        System.out.println(scores.length);  //배열의 크기를 알려주는 코드.

        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i]);
        }
    }
}
