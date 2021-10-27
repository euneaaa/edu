package javastudy;

import java.util.Scanner;

/*
같은 타입의 변수를 하나의 묶음으로 관리할 때 사용.
한 변수 안에 여러 값을 저장할 때 사용(자료형이 같아야 하나의 배열에 저장이 가능).
    자료형[] 변수명 = new 자료형[배열크기];
    자료형[][] 변수명 = new 자료형[배열크기][배열크기];
배열에 값을 저장하지 않을 시 자료형의 기본값이 들어간다.

    인덱스 : 배열 공간마다의 번호. 0번부터 시작.
         변수명[인덱스번호] = 값;
    배열의 길이 : 배열변수명.length

ArrayList : 배열에서 발전된 형태의 list. 크기를 처음에 정해줄 필요 없이 요소를 추가하면 0번 인덱스부터 차례대로 요소를 저장
    (도중에 배열의 크기를 변경할 수 있는 동적 배열)
    ArrayList <자료형클래스> 변수명 = new ArrayList<>;
    ArrayList 변수명 = ArrayList();

 */
public class Array1 {
    //5명의 성적을 입력 받아서 평균을 구하는 프로그램
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] scores = new int[5];
        System.out.println("학생의 성적을 입력하시오");
        for(int i=0; i<scores.length; i++){
            int num = sc.nextInt();
            scores[i] = num;
        }
        int sum = 0;
        for(int i=0; i<scores.length; i++){
            sum += scores[i];
        }
        int avg = sum / scores.length;
        System.out.println("평균 : " + avg);
    }
}

class Array2 {
    //두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과를 result라는 이름의 배열에 저장하고 출력
    public static void main(String[] args) {
        int[][] list1 = {
                {1, 2},
                {2, 3}};
        int[][] list2 = {
                {3, 4},
                {5, 6}};
        int[][] result = new int[2][2];

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                result[i][j] = list1[i][j] + list2[i][j];
            }
        }
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}

class Array3 {
    //숫자를 10개 입력 받아 배열에 저장한 후 숫자들의 최대값과 최소값을 구하는 프로그램
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.println("숫자를 입력하시오");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}