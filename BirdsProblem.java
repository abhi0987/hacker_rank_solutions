import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by bitu on 22/7/17.
 */
public class BirdsProblem {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] birds_with_types = new int[n];

        int[] types = {0,0,0,0,0};

        for(int i = 0;i<n;i++){
            birds_with_types[i] = sc.nextInt();
        }

        // 1, 4 , 4 , 4 , 5 , 3

        for(int i = 0;i<n;i++){
           int temp = birds_with_types[i];
           switch (temp){
               case 1:
                   types[0]++;
                   break;
               case 2:
                   types[1]++;
                   break;
               case 3:
                   types[2]++;
                   break;
               case 4:
                   types[3]++;
                   break;
               case 5:
                   types[4]++;
                   break;
           }
        }

        int max = types[0];
        int maxIndex = 0;
        for (int i = 0 ; i<types.length;i++){
            if (types[i]>max){
                max  = types[i];
                maxIndex = i+1;
            }
        }

        System.out.print(maxIndex);




    }
}
