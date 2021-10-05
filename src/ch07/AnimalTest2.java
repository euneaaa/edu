package ch07;

public class AnimalTest2 {
    public static void main(String[] args) {
        BigCat bc=new BigCat();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
        //AnimalTest2 a2 = new AnimalTest2();

        animalCrying(bc);   //a2.animalCrying(bc);
        animalCrying(cat);  //a2.animalCrying(cat);
        animalCrying(dog);  //a2.animalCrying(dog);
        animalCrying(cow);  //a2.animalCrying(cow);
    }

    public static void animalCrying(Animal anl){
        anl.crying();
    }
    /*public void animalCrying(Animal anl){
        anl.crying();
    }*/
}
