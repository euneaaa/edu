package ch07;

public class DmbCellPhone extends CellPhone {
    int channel;

    public  DmbCellPhone(String model, String color,int channel){
        super("",""); //생략가능. 꼭 써야할 떄는 부모가 기본생성자가 없을 때
        this.channel = channel;
        this.color = color;
        this.model= model;
        //this는 자신의 값을 가지고 있다. super는 직속부모의 값을 가지고 있다.
        //this.? > 멤버필드, 멤버메소드 사용할 때    this(); > 생성자 호출(나 자신의 생성자 호출)
        //super.?                               super();> 생성자 호출(부모의 생성자 호출)
    }
    @Override
    void printInfo(){
        super.printInfo();
        System.out.printf("channel : %d\n",channel);
    }
    //오버라이딩 : 메소드 재정의. 부모에 정의된 메소드를 그대로 사용하지 않고 새롭게 정의하는 것을 오버라이딩라고 한다.

    //생성자를 만들어줘야 Test의 DmbCellPhone()생성자를 쓸 수 있다.
}
/*final 키워드
    클래스 < 상속시킬 수 없다는 의미
    멤버필드 < 값을 바꿀 수 없다는 의미
    메소드 < 오버라이딩 할 수 없다는 의미
 */
/*
    멤버필드는 숨겨져 있다 (값을 바로 넣을 수 없다)
        setter 메소드 이용해서 객체에 값을 넣기
        생성자를 이용해서 객체에 값을 넣기
    객체에 은닉화 된 멤버필드에 값을 넣을 수 있는 방법은 위의 2가지뿐이다.

    반대로 객체에 은닉화 된 멤버필드에서 값을 빼내는 방법은 1가지뿐이다.
        getter 메소드 이용해서 객체에서 값 빼기
 */


