package ch05;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] arr= new int[5];
        int sum = 0;

        for(int i =0; i<arr.length; i++){
            sum = 100+sum;
            arr[i] = sum;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
