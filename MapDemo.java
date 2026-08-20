import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("chets",80);
        map.put("ami",60);
        map.put("shrutz",40);
        map.put("dips",40);
        map.put("sagy",90);

        map.put("sagy",80);

        // System.out.println(map.keySet());
        // System.out.println(map.values());

        for(String key : map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
    }
}
