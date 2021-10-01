package ch04;

public class ForTest3 {
    public static void main(String[] args){
        int name = 10;
        for(int i=2; i<name; i++){
            if(i>2){
                System.out.println("-----");}
            for(int z=1; z<10; z++){
                System.out.printf("%d X %d = %d\n",i,z,i*z);
            }                           //<---- 여기에 System.out.println("-----");넣을 시
                                        //if(i<9){
                                        //  System.out.println("-----")}
        }


    }
}
