package javastudy.beakjoon.function;

import java.util.Scanner;

public class baekjoon_15596 {
}
class Test {
    long sum(int[] a){
        long sum = 0;
        for(int i = 0; i<a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}
