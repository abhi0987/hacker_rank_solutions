import java.util.Scanner;

/**
 * Created by bitu on 16/3/17.
 */
public class CamelCase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int count = 0;

        for (int i =0 ;i < s.length();i++){

            if (Character.isUpperCase(s.charAt(i))){
                count++;
            }

        }

        System.out.println(count+1);
    }
}
