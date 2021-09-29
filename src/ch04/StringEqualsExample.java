package ch04;

public class StringEqualsExample {
    public static void main(String[] args){
        //문자열값 비교!, 절대 == 비교하면 안된다.

        String str1 = new String("안녕하세요");
        String str2 = new String("안녕하세요");
        //대문자로 시작하는 단어들은 주소값을 저장한다.

        System.out.println(str1 == str2);   //문자열에 ==는 주소값을 묻는것이다. 서로의 주소값은 같아질 수 없다.

        String str3 = str2;
        System.out.println(str3 == str2);

        System.out.println("str1.equals(str2) : "+ str1.equals(str2));
        System.out.println("str2.equals(str1) : "+ str2.equals(str1));
        //문자열 자체를 비교하기 위해선 변수명1.equals(변수명2)를 이용. 서로 위치가 바뀌어도 상관 없다.
        System.out.println("str3.equals(str1) : "+ str3.equals(str1));

    }
}
