package javastudy;

public class list1 {
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
