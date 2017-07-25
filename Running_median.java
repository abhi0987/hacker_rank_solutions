import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by bitu on 16/1/17.
 */
public class Running_median {

    PriorityQueue<Integer> upperQ;
    PriorityQueue<Integer> lowerQ;
    public Running_median(){
        upperQ = new PriorityQueue<>();
        lowerQ = new PriorityQueue<>(20, new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                return -t1.compareTo(t2);
            }
        });
        upperQ.add(Integer.MAX_VALUE);
        lowerQ.add(Integer.MIN_VALUE);
    }

    public float getMedian(int num){

        if (lowerQ.isEmpty()){
           lowerQ.add(num);
        }else {
            if (lowerQ.size()>upperQ.size()){
                //lower is bigger

                if (lowerQ.peek()>num){
                    upperQ.add(lowerQ.poll());
                    lowerQ.add(num);
                }else {
                    upperQ.add(num);
                }


            }else {
                //higher is bigger
                Integer p = upperQ.peek();
                if (p!=null && p >=num){
                    lowerQ.add(num);
                }else {
                   lowerQ.offer(upperQ.poll());
                   upperQ.add(num);
                }

            }
        }
          float median = 0;
          int size = lowerQ.size()+upperQ.size();
          if (size%2==0){
              median = (lowerQ.peek()+upperQ.peek())/2.0f;
          }else {
              median = (float)lowerQ.peek();
          }

          return median;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Running_median runningMedian = new Running_median();

        int size = sc.nextInt();


        for(int i = 0 ; i < size;i++){
            System.out.println(runningMedian.getMedian(sc.nextInt()));
        }



    }

}
