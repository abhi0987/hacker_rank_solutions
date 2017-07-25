import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by bitu on 9/2/17.
 */
public class AlgorithimCrush {
 static  int max = 0;
    public static void main(String args[]){

        int N,M;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        int list[] = new int[N];
        Arrays.fill(list,0);

        while (M-->0){
            int a ,b,k;
            a = sc.nextInt(); b = sc.nextInt(); k = sc.nextInt();

            list[a-1] += k;
            if (b < N)
                list[b]-=k;


            //list = changeArray(list,a,b,k);
        }

        for (int j =0;j<N;j++){
            if (list[j]>max){
                max = list[j];
            }
        }

        System.out.println(max);


    }





}
