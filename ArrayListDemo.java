
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<>();        
        List<Integer> nums = new ArrayList<>();        
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        System.out.println(nums.indexOf(10));

        for(int n : nums){
            System.out.println(n);
        }

        // System.out.println(nums);
    }    
}
