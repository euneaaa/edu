package ch06;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "현대";
        car.nm = "소나타";
        car.drive();
        car.stop();

        Car car3 = new Car();
        car3.brand = "기아";
        car3.nm = "K5";
        car3.drive();
        car3.stop();

        Car car4 = new Car();
        car4.brand = "기아";
        car4.nm = "K5";
        car4.drive();
        car4.stop();

        System.out.println(car == car3);    //false
        System.out.println(car3 ==car4);    //false
    }
}
