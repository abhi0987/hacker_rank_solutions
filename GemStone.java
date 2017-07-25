import java.util.Scanner;

/**
 * Created by bitu on 25/3/17.
 */
public class GemStone {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];

        for (int i = 0;i<n;i++){
            strings[i] = sc.next();
        }

        int count=0;
        int val = 0;
        for (char c = 'a';c<='z';c++){

            for (int i = 0;i<n;i++){
                if (strings[i].contains(String.valueOf(c))==true){
                    count = count+1;
                }
            }

            if (count==n){
                val = val+1;
            }
            count=0;
        }


        System.out.print(val);

    }
}
