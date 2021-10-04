package ch06;

public class ComputerTest {
    public static void main(String[] args) {
        Computer.brand = "삼성";
        System.out.println("computer brand : "+Computer.brand);

        Computer c1 =new Computer();
        c1.cpu = 10;
        System.out.println("c1 brand : "+ c1.brand);    //X
        System.out.println("computer brand : "+Computer.brand); //O
        System.out.println("c1 cpu : "+c1.cpu);

        Computer c2 =new Computer();
        c2.brand = "애플";    //static을 쓰는 객체는 같은 값을 공유한다. 때문에 c2값을 바꾸면 c1값도 똑같이 바뀐다.
        c2.cpu = 20;
        System.out.println("c2 brand : "+ c2.brand);
        System.out.println("c2 cpu : "+c2.cpu);
        System.out.println("computer brand : "+Computer.brand);
        System.out.println("-------------------");
        System.out.println("c1 brand : "+ c1.brand);
        System.out.println("computer brand : "+Computer.brand);
        System.out.println("c1 cpu : "+c1.cpu);
    }
}
