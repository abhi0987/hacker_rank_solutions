import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by bitu on 8/6/17.
 */
public class CakeSweat {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }

        Arrays.sort(calories);
        calories = reverseArray(calories,0,calories.length-1);
        int miles = 0;
         for(int cal = 0 ; cal < calories.length;cal++){
             miles =  (miles + calories[cal] * (int)Math.pow(2,cal));
         }

         System.out.print(miles);

    }

    public static int[] reverseArray(int[] arr,int start, int end){
        int temp;
        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }
}

