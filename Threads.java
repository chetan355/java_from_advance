class A extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("Hi");
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello");
        }
    }
}
public class Threads{
    public static void main(String[] args) {
         A obj1 = new A();
         B objj2 = new B();

         obj1.start();
         objj2.start();
    }
}