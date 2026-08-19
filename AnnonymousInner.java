//class does not have name and if we want to change certain function just for once use anonymous class
// show method functionality changed from Main method and new class does not have any name that's it's anonymous class.

class A{
    public void show(){
        System.out.println("In show method");
    }
}
//abstract annonymous class : 

abstract class AB{
    
    public abstract void show();
    public abstract void config();

}

public class AnnonymousInner {
    public static void main(String[] args) {
        A a = new A(){
            public void show(){
                System.out.println("In new Show");
            }
        };
        a.show();  
        

        // using abstract class we can create anonymous class          
        AB ab = new AB(){
            public void show(){
                System.out.println("In Anonymous class");
            }
            public void config(){
                System.out.println("Inside Config");
            }
        };
        ab.show();
        ab.config();

    }
}


