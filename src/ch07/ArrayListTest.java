package ch07;

import java.util.*;


public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();    //다른 타입인데 객체화가 되면 상속 관계이다.
        //List는 오브젝트 타입이기 때문에 모든 값이 다 들어간다. 특정값만 넣고 싶으면 뒤에 <>를 넣어준다.
        System.out.println(list);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(100);

        int removeVal = list.remove(0);
        System.out.println("removeVal : "+removeVal);

        for(int i=0;i<list.size();i++){
            System.out.printf("(%d) - %d\n",i,list.get(i));
        }

        System.out.println(list);

        MyArrayList mylist = new MyArrayList();
        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        mylist.add(100);
        mylist.print();

    }
}
