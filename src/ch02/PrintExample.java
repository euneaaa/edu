package ch02;

import com.sun.org.apache.xpath.internal.compiler.FunctionTable;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class PrintExample {
    public static void main(String[] args){
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("-------");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요\n");

        //printf 설명
        //%s 문자열, %f 실수형, %d 정수형, %c 문자열
        String nm= "홍길동";
        int age = 17;
        float height = 180.8f;
        char bloodType = 'A';

        System.out.println(nm+"의 키는"+height+"cm, 나이는 "+age+"세, 혈액형은 "+bloodType+"형이다.");
        System.out.printf("%s의 키는 %.2fcm, 나이는 %d, 혈액형은 %c형이다", nm, height, age, bloodType);
        //%f,%d 사이에 x.x를 넣으면 수의 자릿수를 정할 수 있다. ,를 넣으면 천마다 단위를 끊어준다.

    }
}
