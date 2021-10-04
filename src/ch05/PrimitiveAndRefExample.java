package ch05;

public class PrimitiveAndRefExample {
    public static void main(String[] args) {
        int val = 10;
        Box box = new Box();
        box.val =10;

        Box box2 = new Box();
        box2 = box;
        

        System.out.println("val : "+ val);
        changeVal(val);
        System.out.println("val : "+val);
        System.out.println("------------");
        System.out.println("box.val : "+box.val);
        changeVal(box);
        System.out.println("box.val : "+box2.val);
    }

    public static void  changeVal(int pval){
        pval =30;
    }
    public static void changeVal(Box box){
        box.val =30;
    }
}


class Box { //클래스 앞에 퍼블릭을 붙이려면 맨 위의 클래스명밖에 안된다.
    int val;
}
