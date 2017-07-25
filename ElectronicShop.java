import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by bitu on 23/7/17.
 */
public class ElectronicShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){

        Arrays.sort(drives);
        Arrays.sort(keyboards);
        Collections.reverse(Arrays.asList(keyboards));

        int ms=-1;
        for (int i =0 ; i<keyboards.length;i++){
            for (int j =0;j<drives.length;j++){
                if (keyboards[i]+drives[j]>s){
                    break;
                }
                if (keyboards[i]+drives[j]>ms){
                    ms=keyboards[i]+drives[j];
                }
            }
        }

        return ms;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
