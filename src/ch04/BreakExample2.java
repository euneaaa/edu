package ch04;

public class BreakExample2 {
    public static void main(String[] args) {
        OUT_FOR:
        //for문에 이름을 붙여서 break 뒤에 붙이면 바깥for문도 멈출 수 있다.
        for (int i = 0; i < 10; i++) {
            for (int z = 100; z < 110; z++) {
                if (z == 103) {
                    break OUT_FOR;      //바깥쪽 for문 정지
                }
                System.out.printf("%d - %d\n", i, z);
            }
        }

        System.out.println("--------");
        for (int i = 0; i < 10; i++) {
            for (int z = 100; z < 110; z++) {
                if (z == 103) {
                    break;      //안쪽 for문 정지
                }
                System.out.printf("%d - %d\n", i, z);
            }
        }
    }
}