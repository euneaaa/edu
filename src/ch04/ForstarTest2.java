package ch04;

public class ForstarTest2 {
    public static void main(String[] args){
        int star= (int)(Math.random()*5)+2; //2~6
        System.out.println(star);
        for (int i=0; i<star; i++) {
            for(int z=0; z<=i ; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
