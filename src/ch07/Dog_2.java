package ch07;

public class Dog_2 extends Animal_2{
    @Override
    public void crying(){
        System.out.println("강아지가 멍멍");
    }

    @Override
    public void eat() {
        System.out.println("강아지가 고기를 먹는다");
    }
}
