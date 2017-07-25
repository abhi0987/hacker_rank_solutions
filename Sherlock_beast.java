import java.util.Scanner;

/**
 * Created by bitu on 8/6/17.
 */
public class Sherlock_beast {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0){

            int N = sc.nextInt();

           StringBuilder builder = new StringBuilder();

           int j =0;
           for(int i =N;i > 0;i--){
               if (i % 3 == 0 && (N-i) % 5 == 0){
                   for (j = 0; j < i;j++){
                       builder.append("5");
                   }

                   for (int k = j;k < N;k++ ){
                       builder.append("3");
                   }
                   break;
               }
           }

           if (builder.length()==0 && N % 5 == 0){
               for (int i = 0;i<N;i++){
                   builder.append("3");
               }
           }else if (builder.length()==0 && N % 3 ==0){
               for (int i = 0 ; i<N;i++){
                   builder.append("5");
               }
           }else if (builder.length()==0){
               builder.append(-1);
           }

            System.out.println(builder);


        }
    }
}
