package ch02;

public class VariableExample2 {
    public static void main(String[] args){
        float f;
        double d;
        int n1;


        f= 10.1f;  //(float)10.1<<형변환 이나 10.1f 로 표기
        d= 10.1;

        double d2= f*f;  //자동형변환 double d2= (double)(f*f);

        float f2 = (float)(d*d);  //자동형변환 X 수동형변환으로 해야함
        float f3 = (float)d*(float)d;

    }

}

