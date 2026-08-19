// by default all var in inteface are final and static

//inteface don't have memory in heap so that's why the variables are final and static.

// class to class => extends
// class to inteface => implements
// interface to interface => extends

interface A{

    int age = 26;
    String area = "Pune";

    void show();
    void config();

}
interface X extends A{

}

interface Y{
    
}

//multiple interfaces can be implemented by class, but this can't happen with abstract class
class B implements X,Y{

    public void show() {
        System.out.println("In show");
    }

    public void config() {
        System.out.println("In config");
    }

}

public class Interfaces {
    public static void main(String[] args) {

        A a = new B();

        System.out.println(A.age+" "+A.area);
        a.show();
        a.config();
        
    }
}
