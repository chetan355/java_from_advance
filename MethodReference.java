import java.util.Arrays;
import java.util.List;

/*
    Method Ref : we can call method by ref just use name of method with it's class
*/
public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Chetan","Chavan","Amisha","Shah");

        List<String> uNames = names.stream()
                                .map(String::toUpperCase)
                                .toList();

        // System.out.println(uNames);

        uNames.forEach(System.out::println);

    }
}
