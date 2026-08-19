/*
    In this program we have 2 threads along with Main Thread and Main is started those 2 Threads
    Both threads are calling the increment method so every time we get different output.
    Hence synchronized keyword used on method to allow only one thread can access the increment method at a time.
*/

class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

public class ThreadRaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable obj1 = ()->{
                for(int i = 0; i < 1000; i++){
                    counter.increment();
                }            
            };
         Runnable obj2 = () ->{
            for(int i = 0; i < 1000; i++){
                counter.increment();
            }  
         };

        

         Thread t1 = new Thread(obj1);
         Thread t2 = new Thread(obj2);


         t1.start();
         t2.start();

         t1.join();
         t2.join();  //which allows main thread to wait for other thread to complete and join it.

         System.out.println(counter.count);
         
    }
}
