import java.util.Scanner;

/**
 * Created by bitu on 24/3/17.
 */
public class XORMax {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        long[] input = new long[m];
        for (int i = 0; i < m; i++)
            input[i] = in.nextLong();

        long max = 0;
        for (int i = 0; i < input.length - 1; i++) {
            long m1 = input[i];
            long m2 = input[i+1];
            long num = m1^m2;
            if(num > max) max = num;
        }

        System.out.println(max);

    }
}
