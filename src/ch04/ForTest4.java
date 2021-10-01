package ch04;

public class ForTest4 {
    public static void main(String[] args){
        int x=10;

        for(int i=1;i<x;i++){
            if(i>1){
                System.out.println();
            }
            for(int z=2; z<x;z++){
                System.out.printf("%d X %d = %d\t",z,i,z*i);
            }
        }

    }
}
