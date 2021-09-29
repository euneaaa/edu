package ch04;

public class IfTest3 {
    public static void main(String[] args){
        int score =(int)(Math.random()*41+60);
        char grade = 'D';
        char pm =' ';

        if(score>=90){ grade = 'A';
        }
        else if (score >=80){ grade = 'B';
        }
        else if (score >=70){ grade = 'C';
        }

        if(score>=70){
            int mVal = score % 10;

            if (mVal >= 8||score == 100){
                pm= '+';
            }else if (mVal <=3){
                pm= '-';
            }
        }


        System.out.printf("%C%C", grade, pm);

    }
}
