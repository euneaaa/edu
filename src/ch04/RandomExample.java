package ch04;

public class RandomExample {
    public static void main(String[] args){
        int num = (int)(Math.random()*6); //메소드인지 아닌지는 ()가 있는지를 확인
        //랜덤은 더블로 출력됨 0.0~0.999999999
        System.out.println("num : "+num);

        // 2~7
        int num2 =(int)(Math.random()*6+2);
        System.out.println("num2 : "+num2);

        // 55~108
        int num3 =(int)(Math.random()*54+55);
        System.out.println(num3);
    }
}