package ch07;

public class AnimalTest {
    public static void main(String[] args) {
        BigCat bigCat = new BigCat();
        Cat cat = new Cat();
        Animal animal = new BigCat();
        Animal animal1 = new Cat();
        //Animal animal2 = new Animal();
        //Object obj = new Animal();
        //BigCat bc= new Cat(); < X
        /*
        Object obj = 1; //object는 모든 타입을 저장할 수 있다.
        Integer integer = new Integer(1);
        Float f =new Float(10.1);
        */

        Cat cat2 = new BigCat();
        cat2.crying();
        //cat2.sleep();

        BigCat bigCat1 = (BigCat)cat2;
        bigCat1.sleep();
    }

}
