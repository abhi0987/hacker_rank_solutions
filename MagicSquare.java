import java.util.Scanner;

/**
 * Created by bitu on 23/7/17.
 */
public class MagicSquare {
    public static void main(String args[]) {
        int magic_sqr[][][] = null;
        magic_sqr = new int[][][]{
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
        };


        Scanner sc = new Scanner(System.in);
        int A[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int ms = 81;
        for (int k = 0; k < 8; k++) {
            int tem_cnt = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tem_cnt += Math.abs(A[i][j] - magic_sqr[k][i][j]);
                }
            }

            if (tem_cnt < ms) {
                ms = tem_cnt;
            }
        }

        System.out.print(ms);

    }
}
