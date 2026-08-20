
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements  Comparable<Students>
{
    int age;
    String name;

    public Students(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Students o) {
        if(this.age > o.age)
            return 1;
        else
            return -1;
    }
}
public class CollectionsSorting {
    public static void main(String[] args) {

        // Comparator<Students> com1 = new Comparator<Students>() {
        //     public int compare(Students s1,Students s2){
        //         if(s1.age > s2.age)
        //             return 1;
        //         else 
        //             return -1;
        //     }
        // };

        //Comparator(it's functional interface) using the lamba expression.

        Comparator<Students> com1 = ( s1, s2) -> s1.age > s2.age?1:-1;

        List<Students> students = new ArrayList<>();

        students.add(new Students(15, "Chets"));
        students.add(new Students(20, "Ami"));
        students.add(new Students(13, "Sagy"));

        Collections.sort(students);

        for(Students s : students){

            System.out.println("Age : "+s.age+" Name : "+s.name);
        }

        //custom sorting based on the length of string : 

        // Comparator<String> com = new Comparator<>()
        // {
        //     public int compare(String i, String j){
        //         if(i.length() > j.length())
        //             return 1;
        //         else 
        //             return -1;
        //     }
        // };

        List<String> list = new ArrayList<>();

        list.add("Chets");
        list.add("Amisha");
        list.add("Saggyy");

        // Collections.sort(list,com);

        // System.out.println(list);

    }   
}
