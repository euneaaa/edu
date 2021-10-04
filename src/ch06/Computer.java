package ch06;

public class Computer {
    static String brand;
    int cpu;

    public void print() {
        System.out.printf("컴퓨터 브랜드는 %s이고, cpu는 %d입니다.", brand, cpu);
    }

    public static void print2(){
        System.out.printf("컴퓨터 브랜드는 %s입니다.",brand);
        //System.out.printf("컴퓨터 브랜드는 %s, cpu는 %d입니다.",brand, cpu);는 cpu가 객체화되는 게 static보다
        //느리기 때문에 불가능 하다.
    }
}
