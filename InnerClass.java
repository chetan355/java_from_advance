class A{
    public void show(){
        System.out.println("In show");
    }
    class B{
        public void config(){
            System.out.println("In config");
        }
    }
    static class C{
        public void display(){
            System.out.println("In display");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
       A a = new A();
       a.show();
       A.B b = a.new B();
       b.config(); 


       //access the static class from A : 
       A.C c = new A.C();

       c.display();
    }
}
