package ch07;

public abstract class Animal {
    /*다형성 (여러가지 형태가 있는 성질)
        1. 부모타입은 자식객체 주소값 저장 할 수 있다.
        2. 자식타입은 부모객체 주소값 저장할 수 없다.
        3. 메소드 호출은 타입이 알고 있는 것만 호출 할 수 있고 내용은 객체 기준이다.
     */
    public void crying() {
        System.out.println("동물이 울다.");
    }
    public abstract void eat();
    /*
    class 키워드 왼쪽에 abstract를 붙이면 추상 클래스가 된다.
    추상 클래스가 되면 객체화 불가능.
    추상 메소드가 하나라도 있으면 클래스는 추상 클래스가 되어야 한다. (abstract 키워드 꼭 붙여야 한다)
    추상 메소드는 강제성이 있다. 자식은 추상 메소드를 꼭 구현(오버라이딩)해야 한다.
    */
}

