import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by bitu on 8/6/17.
 */
public class SortAlphaMatrix {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){
            int t = sc.nextInt();

            char a[][] = new char[t][t];

            for (int i =0 ;i<t;i++){
                String s = sc.next();
                a[i] = s.toCharArray();
                Arrays.sort(a[i]);
            }

            int flag =0;
            for (int i =0 ;i<n;i++){
                for (int j =0 ;j<n-1;j++){
                    if (a[j][i] > a[j+1][i]){
                        flag =1;
                        break;
                    }

                    if (flag==1){
                        break;
                    }

                }

            }


            if (flag ==1){
                System.out.print("NO");
            }else {
                System.out.print("YES");
            }
        }
    }
}
