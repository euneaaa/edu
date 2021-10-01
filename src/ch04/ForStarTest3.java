package ch04;

public class ForStarTest3 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 5) + 2;
        System.out.println(star);


        for (int i = star; i > 0; i--) {
            for (int z = 1; z <= star; z++) {
                if (z < i) {
                    System.out.print("_");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <= star; i++) {
            for (int z = 0; z < star; z++) {
                int val = star -i;
                if(z<star-i-1){
                    System.out.print("_");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}


