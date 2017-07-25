import java.util.Scanner;

/**
 * Created by bitu on 19/3/17.
 */
public class HackerrankInString {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while (q-- > 0){
            String s = sc.next();

            boolean b = isConatinString(s);

            if (b){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }



    }


    public static boolean isConatinString(String s){
        String h = "hackerrank";
        int k = 0;
        for (int i =0;i<s.length();i++){
            if (k==h.length()-1){

                return true;
            }

            if (s.charAt(i)==h.charAt(k)){
                k++;
            }

        }

        return false;
    }
}
