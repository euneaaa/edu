package ch05;

public class MethodExample2 {
    public static void main(String[] args) {
        //input 0, output 0 (비void형)
        int result = sum (10, 20);
        System.out.println("sum : "+ result);
    }

    public static int sum(int n1, int n2){
        return n1 +n2;      //어떤 값을 넣어도 리턴 값만 출력된다.
    }
}
