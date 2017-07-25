import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bitu on 8/2/17.
 */
public class Dynamic_Array {


    public static void main(String args[]){

        int N , Q ;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();


        for (int i = 0 ;i < N ;i++){
            ArrayList<Integer> sub = new ArrayList<>();
            main.add(sub);
        }
        int lastAns = 0;
        while (Q-- > 0){


            int type , x , y ;
            type = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

            if (type==1){

                ArrayList<Integer> seq = main.get((x^lastAns)% N);
                seq.add(y);

            }else if (type==2){
                ArrayList<Integer> seq = main.get((x^lastAns)% N);
                int ele = seq.get(y % seq.size());
                lastAns = ele;
                System.out.println(lastAns);


            }


        }

    }


}
