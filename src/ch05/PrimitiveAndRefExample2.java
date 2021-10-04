package ch05;

public class PrimitiveAndRefExample2 {
    public static void main(String[] args) {
        String s1 = "Hello";

        System.out.println(s1);
        changeVal(s1);
        System.out.println(s1);

    }

    public static void changeVal(String str){
        str ="안녕";
    }
}
