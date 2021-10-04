package ch06;

public class CarTest2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "BMW";
        car1.nm = "320";

        Car car2 = car1;

        car2.drive();
        car2.stop();

        System.out.println(car1 == car2);   //true
    }
}
