package ch07;

public class Cow extends Animal{
    @Override
    public void crying(){
        System.out.println("소가 음메");
    }

    @Override
    public void eat() {
        System.out.println("소가 먹는다.");
    }
}
