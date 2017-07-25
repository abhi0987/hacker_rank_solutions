import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by bitu on 7/6/17.
 */
public class GreedyMinArray {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int min = nums[n-1];

        for (int j = 1;j<n;j++ ){
            int temp = Math.abs(nums[j]-nums[j-1]);
            if (temp <= min){
                min = temp;
            }
        }

        System.out.print(min);


    }
}
