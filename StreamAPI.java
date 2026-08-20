import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
    Stream instance can be used only once.

    in reduce method first parameter is initial value and c and e are getting added.
*/
public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(8,4,1,6,2,10);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n-> n*2);
        // int result = s3.reduce(0,(c,e) -> c+e);
        // System.out.println(result);

        int result = nums.stream()
                    .filter(n -> n%2==0)
                    .map(n -> n*2)
                    .reduce(0,(c,e) -> c+e);
        
        System.out.println(result);


        Stream<Integer> sortedValues = nums.stream()
        .filter(n -> n%2==0)
        .sorted();

        sortedValues.forEach(n -> System.out.println(n));
    }
}
