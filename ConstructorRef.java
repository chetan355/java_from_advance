import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    int age;
    String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(String name){
        this.name = name;
    }
}
public class ConstructorRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Chetan","Amisha");
        List<Student> students = new ArrayList<>();

        // students = names.stream()
        //             .map(s -> new Student(s))
        //             .toList();
        students = names.stream()
                    .map(Student::new)
                    .toList();

       students.forEach(s -> System.out.println(s.getName()));
        
    }
}
