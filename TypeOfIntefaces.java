//Types of interfaces : 
/*
1) Normal Interface: more than 2 methods
2) Functional/SAM (Single Abstract Method) : only one method
3) Marker : no method
*/

//Functional Interface - only has one method
// we can use lamba expressions with only functional interfaces.

@FunctionalInterface
interface A{
    int show(int a, int b);
}
class B implements A{

    @Override
    public int show(int a, int b) {
        System.out.println("In Show");
        return a+b;
    }

}

interface Machine{
    String start();
}

abstract class Applicance implements Machine{
    String name;
    public Applicance(String name){
        this.name = name;
    }
}

class Fan extends Applicance{

    public Fan(String name){
        super(name);
    }

    @Override
    public String start() {
        return "Fan is running";
    }

}
class WashingMachine extends Applicance{

    public WashingMachine(String name){
        super(name);
    }
    
    @Override
    public String start() {
        return "Washing Machine is running";
    }

}

public class TypeOfIntefaces{
    public static void main(String[] args) {
        // Machine fan = new Fan("Fan");
        // Machine washer = new WashingMachine("Washing Machine");
        // System.out.println(fan.start());
        // System.out.println(washer.start());

        // A a = ( c,  b) -> System.out.println("Inside show : "+(c+b)); 
        // a.show(4,5);

        A a1 = (x,y) -> (x+y);
        System.out.println(a1.show(2, 4));
    }
}