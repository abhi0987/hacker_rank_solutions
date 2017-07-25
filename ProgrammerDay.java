import java.util.Scanner;

/**
 * Created by bitu on 22/7/17.
 */
public class ProgrammerDay {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();


        String result = Solve(y);

        System.out.print(result);
    }

    private static String Solve(int y) {
        String result = null;
        if (y == 1918) {
            result = "26.09." + y;
        } else if (((y < 1918) && (y % 4 == 0)) || ((y > 1918) && (y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))) {
            result = "13.09." + y;
        } else {
            result =  "12.09." + y;
        }

        return result;
    }
}
