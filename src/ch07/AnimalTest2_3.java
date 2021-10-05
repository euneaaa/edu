package ch07;

public class AnimalTest2_3 {
    public static void main(String[] args) {
        Cat_2 cat = new Cat_2();
        BigCat_2 bc = new BigCat_2();
        Dog_2 dog = new Dog_2();
        Cow_2 cow = new Cow_2();

        animalcrying(bc);
        animalcrying(cat);
        animalcrying(dog);
        animalcrying(cow);
    }

    public static void animalcrying(Animal_2 ani){
        ani.crying();
    }
}
