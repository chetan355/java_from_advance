/*
 when the multiple threads needed to perform task we can use parallelStream
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(10000);

        Random ran = new Random();

        int size = 10_000;

        for(int i = 1; i <=size; i++){
            nums.add(ran.nextInt(100));
        }
        // System.out.println(nums);

        int sum1 = nums.stream()
                    .map(n -> n*2)
                    .reduce(0,(c,e) -> c+e);

                    
        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                    .map(n -> n*2)
                    .mapToInt(n -> n)
                    .sum();
        long endSeq = System.currentTimeMillis();


        long startPara = System.currentTimeMillis();

        int sum3 = nums.parallelStream()
                    .map(n -> n*2)
                    .mapToInt(n -> n)
                    .sum();
        long endPara = System.currentTimeMillis();

        System.out.println(sum2+" "+sum3);
        System.out.println("Seq : "+(endSeq - startSeq));
        System.out.println("Para : "+(endPara - startPara));
    }
}
