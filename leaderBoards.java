import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by bitu on 24/7/17.
 */
public class leaderBoards {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        int rank = 1;
        int lastScore = 0;
        ArrayList<Integer> rankList = new ArrayList<>();
        for (int scores_i = 0; scores_i < n; scores_i++) {
            scores[scores_i] = in.nextInt();

        }

        for (int i = 0; i < n; i++) {

            if (scores[i] < lastScore) {

                rank++;
            }
            lastScore = scores[i];
            rankList.add(rank);


        }

        int temp_rank = rankList.get(rankList.size() - 1) + 1;

        int m = in.nextInt();


        int[] alice = new int[m];
        for (int alice_i = 0; alice_i < m; alice_i++) {
            alice[alice_i] = in.nextInt();
        }


        temp_rank = rank;

        for (int a : alice) {
            lastScore = 0;
            while ((a >= scores[temp_rank]) && temp_rank > 0) {
                temp_rank--;
            }
            System.out.println(temp_rank);
        }


    }
}
