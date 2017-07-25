import java.util.Scanner;

/**
 * Created by bitu on 24/7/17.
 */
public class hurdle_race {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for (int height_i = 0; height_i < n; height_i++) {
            height[height_i] = in.nextInt();
        }

        int magic_drink = 0;
        for (int i = 0; i < n; i++) {
            if (height[i] >= k) {

                if ((height[i] - k) > magic_drink) {
                    magic_drink = height[i] - k;
                }
            }



        }

        System.out.print(magic_drink);
    }

}
