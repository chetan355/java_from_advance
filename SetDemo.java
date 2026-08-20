import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/*
Set is collection of unique value, it does not have index value.

If we want sorted value we can use TreeSet class
*/
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(11);
        nums.add(11);
        nums.add(10);
        nums.add(13);


        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
        {
            System.out.println(values.next());
        }

        // for(int n : nums){
        //     System.out.println(n);
        // }
        
    }
}
