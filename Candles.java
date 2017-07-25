import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bitu on 2/7/17.
 */
public class Candles {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            marks.add(sc.nextInt());
        }

        int count = 0;
        int total = 0;

        for (int i = 1; i < N - 1; i++) {

            if (marks.get(i) < marks.get(i + 1)) {
                if (marks.get(i) > marks.get(i - 1)) {

                    ///count;
                } else if (marks.get(i) < marks.get(i - 1)) {
                    count = 1;
                    total = total + count;
                }
            } else if (marks.get(i) == marks.get(i + 1)) {
                //if (marks.get(i)>marks.get)
            }

            System.out.print(count + ",");
        }

        System.out.println(count);


    }
}
