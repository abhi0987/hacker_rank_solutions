import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by bitu on 24/3/17.
 */
public class WeightedString {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int q = sc.nextInt();

        Set<Integer> s = AddToSet(input);
        while (q-->0){
            int weight = sc.nextInt();
            String msg = s.contains(weight)?"Yes" : "No";
            System.out.println(msg);

        }
    }

    public static Set<Integer> AddToSet(String s){
        Set<Integer> set  = new HashSet<>();
        int w = s.charAt(0)-96;
        set.add(w);
        for (int i =1;i<s.length();i++){
            if (s.charAt(i)==s.charAt(i-1)){
                w = w+s.charAt(i)-96;

            }else {

                w = s.charAt(i)-96;
            }

            set.add(w);
        }

        return set;



    }
}
