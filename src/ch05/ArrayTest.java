package ch05;

public class ArrayTest {
    public static void main(String[] args){
        int[] scores = {100, 87, 56, 23, 28, 98, 30, 32, 17};
        int sum = 0;
        //점수가 짝수인 친구들만 점수 프린트 해주고 홀수인 친구들의 합계점수도 프린트.

        for(int i= 0; i<scores.length; i++) {
            if (scores[i] % 2 == 0) {
                System.out.print(scores[i] + "\t");
            }
            else {
                sum += scores[i];
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
