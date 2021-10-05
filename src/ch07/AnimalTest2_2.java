package ch07;

public class AnimalTest2_2 {
    public static void main(String[] args){
        BigCat_2 bc = new BigCat_2();
        Cat_2 cat = new Cat_2();
        Dog_2 dog = new Dog_2();
        Cow_2 cow = new Cow_2();

        AnimalTest2_2 ar = new AnimalTest2_2();

        ar.animalcrying(bc);
        ar.animalcrying(cat);
        ar.animalcrying(dog);
        ar.animalcrying(cow);
    }

    public void animalcrying(Animal_2 ani){
        ani.crying();
    }
}
