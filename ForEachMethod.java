import java.util.Arrays;
import java.util.List;

/*
ForEach method was introduced in Java 8
It take Consumer Object as a argument which is FunctionalInterface hence can be 
converted to lambda expression.
 */
public class ForEachMethod {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(3,4,5,6,7,8);

        // Consumer<Integer> con = n -> System.out.println(n);
        // nums.forEach(con);

        nums.forEach(n->System.out.println(n));
    }
}
