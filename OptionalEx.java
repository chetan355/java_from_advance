import java.util.*;

/*
Optional class maily used if stream does not have possible filtered output so instead of 
giving Nullpointer exception it gives meaningful msg using the orElse method.
 */
public class OptionalEx{
    public static void main(String[] args) {
    
        List<String> names = Arrays.asList("Chetan","Chavan","Amsha","Shah");

        Optional<String> name = names.stream()
                        .filter(str -> str.contains("i"))
                        .findFirst();

        // Optional<String> name = names.stream()
        //                 .filter(str -> str.contains("i"))
        //                 .findFirst()
        //                 .orElse("Not found");

        // System.out.println(name);

        System.out.println(name.orElse("Not found"));
                        
    }
}