import java.util.Arrays;

/**
 * Created by bitu on 7/4/17.
 */
public class Quick_sort {

    public static void main(String[] args){


        int arr[] = {5,8,1,3,7,9,2};
        QuickSort(arr,0,arr.length-1);

        System.out.print(Arrays.toString(arr));


    }

    public static void QuickSort(int[] arr,int start , int end){

        if (start < end){
            int pindex = Partition(arr,start,end);
            QuickSort(arr,start,pindex-1);
            QuickSort(arr,pindex+1,end);
        }

    }
    private static int Partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pindex = start;

        for (int i = start; i < end;i++){
            if (arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[pindex];
                arr[pindex] = temp;
                pindex = pindex+1;
            }
        }

        int t = arr[pindex];
        arr[pindex] = arr[end];
        arr[end] =  t;

        return pindex;
    }




}


