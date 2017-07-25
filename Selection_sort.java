import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by bitu on 7/4/17.
 */
public class Selection_sort {

    public static void main(String[] args){

        int[] arr = {3,1,5,2,9,7};
        sorting(arr);

    }


    public static void sorting(int[] arr){

        int minIndex;

        for (int i =0;i<arr.length-1;i++){
            minIndex  = i;
            for (int j = i+1;j<arr.length;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }

            if (minIndex!=i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

        }

        System.out.print(Arrays.toString(arr));


    }
}
