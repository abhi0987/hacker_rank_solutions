import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by bitu on 8/6/17.
 */
public class Priyanka_Toys {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> weights = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            weights.add(sc.nextInt());
        }

        Collections.sort(weights);
        int unit = 1;
        int start = weights.get(0);
        for (int i = 0; i < N; i++) {
            if (weights.get(i) > start + 4) {
                unit++;
                start = weights.get(i);
            }
        }

        System.out.print(unit);
    }


}
