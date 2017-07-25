import java.util.Scanner;

/**
 * Created by bitu on 19/3/17.
 */
public class MarsExploration {

    public static void main(String[] args){

        String original = "SOS";
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();
        int cnt = 0;

        int itr = length/3;
        original = getMultiplyString(original,itr);

        for (int i =0 ; i < length ; i++){

           if (s.charAt(i)!=original.charAt(i)){
               cnt++;
           }

        }

        System.out.println(String.valueOf(cnt));


    }

    public static String getMultiplyString(String s,int count){

        StringBuilder r = new StringBuilder();
        for (int i = 0; i < count; i++) {
            r.append(s);
        }
        return r.toString();
    }
}
