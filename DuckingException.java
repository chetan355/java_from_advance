
/*
Ducking Exception using throws : 
    when a method don't want to handle exception it simply throws it and whoever calls that method,
    will handle the that exception.Below example main method handled the ClassNotFoundExeption and show method only throws it
 */


class A{

    public void show() throws ClassNotFoundException{
        Class.forName("DuckingException");
    }
}
public class DuckingException {
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();            
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }    
}
