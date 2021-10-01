package ch05;

public class MethodTest2_2 {
    public static void main(String[] args) {
        //홀짝게임. 홀짝 : 홀수/짝수 만들기
        String oddEven = getoddEven(13);

        System.out.println("홀짝 : "+ oddEven);
    }
    public static String getoddEven(int n) {
        if(n%2==0){
            return "짝수";
        }else{
            return "홀수";
        }
    }
}

