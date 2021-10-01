package ch05;

public class MethodTest2 {
    public static void main(String[] args) {
        String oddEven = getOddEven(11);

        System.out.println("홀짝 : " + oddEven);
        //10 > 짝수   13 > 홀수
    }
    public static String getOddEven(int n){
        if(n %2 == 0){
            return "짝수";
        }
        return "홀수";
    }
}
