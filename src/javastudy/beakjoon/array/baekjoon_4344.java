package javastudy.beakjoon.array;

import java.util.Scanner;

public class baekjoon_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcase = sc.nextInt();
        int[] array;
        double[] student = new double[tcase];

        for(int i = 0; i<tcase; i++){
            int N = sc.nextInt();
            array = new int[N];

            double sum = 0;
            for(int j=0; j<N; j++){
                array[j] = sc.nextInt();
                sum+=array[j];
            }
            double avg = sum/N;
            int count = 0;
            for(int j=0;j<N;j++){
                if(array[j]>avg){
                    count++;
                }
            }
            double result = (double)count/N*100;
            student[i]= result;
        }
        for(double n : student) {
            System.out.printf("%.3f%%\n", n);
        }
    }
}
