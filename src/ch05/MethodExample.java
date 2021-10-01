package ch05;

public class MethodExample {

    //           리턴타입     파라미터(매개변수)
    public static void main(String[] args) {
        //              메소드명            <메소드 선언부
        //메소드뒤에 ()가 비어있으면 외부에서 값을 받지 않는다.
        //{} ← 메소드 구현부
        sum(10, 20);
        sum(50, 120); //()안에 값만 보내야 한다. 선언X
        minus(100,150);

    }
    public static void sum(int n1, int n2){
        System.out.println("sum : "+ (n1 + n2));
    }
    public static void minus(int n1, int n2){
        System.out.println("minus : "+ (n1-n2));
    }
}
