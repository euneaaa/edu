package ch07;

public class Cow_2 extends Animal_2{
    @Override
    public void crying(){
        System.out.println("소가 음메~");
    }

    @Override
    public void eat() {
        System.out.println("소가 풀을 뜯어먹는다.");
    }
}
