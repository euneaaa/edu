package ch04;

public class IfTest {
    public static void main(String[] args) {
        int score = 89;
        //점수가 90이상이면 A
        //      80이상이면 B
        //      70이상이면 C
        //70미만이면 D등급

        //C등급 이상면
        //?7점 이상이면 +    ?3점 이하이면 -
        //예) 98점이면 A+      85점이면 B      73점이면 C-

        if (score >= 90) {
            System.out.print("A");
            if (score >96){
                System.out.println("+");
            }else if(score<94) {
                System.out.println("-");
            }
        }
        else if (score >=80){
            System.out.print("B");
            if (score >86){
                System.out.println("+");
            }else if(score<84) {
                System.out.println("-");
            }
        }
        else if (score>= 70){
            System.out.print("C");
            if (score >76){
                System.out.println("+");
            }else if(score<74) {
                System.out.println("-");
            }
        }
        else {
            System.out.println("D");
        }
    }
}