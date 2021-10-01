package ch05;

public class MethodTest {
    public static void main(String[] args) {
        printMyself("홍길동", 17, 180.82f, 'A');

        int mon = (int) (Math.random() * 12 + 1);     //1~12
        printSeason(mon);
    }

    public static void printMyself(String nm, int age, float height, char blood) {
        System.out.printf("%s의 키는 %.2fcm, 나이는 %d, 혈액형은 %c형이다", nm, height, age, blood);
        System.out.println();
    }

    public static void printSeason(int mon) {
        System.out.println("계절 : "+mon);
        if (mon < 1 || mon > 12) {
            System.out.println("알수없음");
        } else if (mon == 12 || mon < 3) {
            System.out.println("봄");
        } else if (mon <6) {
            System.out.println("여름");}
        else if (mon <0) {
            System.out.println("가을");
        }
        else {
            System.out.println("겨울");
        }
    }
}
