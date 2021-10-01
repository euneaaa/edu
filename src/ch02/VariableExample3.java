package ch02;

public class VariableExample3 {
    public static void main(String[] args){
        char c = 'B';

        System.out.printf("%c : %d\n", c, (int)c);

        int i=69;
        System.out.printf("%c : %d\n", (char)i, i);

        boolean bl= true;
        System.out.println(bl);
    }
}
//char, boolean
//byte<shart<int<long<float<double<String