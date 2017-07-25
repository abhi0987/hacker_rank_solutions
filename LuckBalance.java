import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by bitu on 8/6/17.
 */
public class LuckBalance {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int nums[] = new int[N];
        int digits[] = new int[N];
        int total=0;
        int totasl_luck=0;
        ArrayList<Integer> impLucks = new ArrayList<>();
        for (int i = 0 ; i< N ;i++) {

            int l = sc.nextInt();
            int t = sc.nextInt();
            nums[i] = l;
            digits[i] = t;
            total = total + l;
            if (t == 1) {
                impLucks.add(l);
            }
        }
            Collections.sort(impLucks);

           int ml = 0;
            int mustImplucksTowin = impLucks.size()-K;
            for (int j = 0 ;j < mustImplucksTowin;j++){
                ml = ml+impLucks.get(j);
            }

             totasl_luck = total - 2*ml;




        System.out.print(totasl_luck);


    }
}
