package ch04;

public class ContinueTest {
    public static void main(String[] args){
        //1~100까지 숫자 중에 continue를 활용하여 짝수값만 전부 더해주세요.
        //for문 끝나면 전부 더한 값을 출력해 주세요.
        int sum=0;

        for(int i=1; i<=100; i++){
            if(i%2==1){
                continue;
            }
            sum=sum+i;
        }
        System.out.println("더한 값 : "+sum);
    }
}
