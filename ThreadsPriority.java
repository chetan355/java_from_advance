class A extends Thread{
    public void run(){
        for(int i = 0; i < 50; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10); //waiting
            } catch (InterruptedException e) { e.printStackTrace();}
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { e.printStackTrace();}
        }
    }
}
public class ThreadsPriority 
{
    public static void main(String[] args) {
         A obj1 = new A();
         B objj2 = new B();

        //  System.out.println(obj1.getPriority());

        //  obj1.setPriority(Thread.MAX_PRIORITY); range is always between 1 to 10

         obj1.start();
         objj2.start();
    }
}
