import java.util.Scanner;

/**
 * Created by bitu on 16/3/17.
 */
public class ReducedString {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        for (int i = 1 ; i<input.length();i++){

            if (input.charAt(i-1)==input.charAt(i)){

                input = input.substring(0,i-1)+input.substring(i+1);
                i = 0;

            }


        }

        System.out.println(input.equals("")?"Empty String":input);
    }

}
