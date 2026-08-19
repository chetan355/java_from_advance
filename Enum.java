enum Status{ // Enum is class but we can not extend with any other class
    Running,Failed,Pending,Success;
}


enum Laptop{

    Macbook(2000),Asus(),HP(1200);
    private int price;

    private Laptop(){
        
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class Enum {
    public static void main(String[] args) 
    {
        Status s = Status.Success; //named constants

        // System.out.println(s.ordinal()); // gives the index

        // Status[] s1 = Status.values();
        // for(Status ss : s1){
        //     System.out.println(ss);
        // }

        switch (s) { //rule switch
            case Status.Running -> System.out.println("All Good");
            case Status.Failed -> System.out.println("Try Again");
            case Status.Pending -> System.out.println("Please wait");
            default -> System.out.println("Done");
        }

        Laptop[] lap = Laptop.values();

        for(Laptop laptop : lap){
            
            System.out.println(laptop+" : "+laptop.getPrice());
        }
    

    }
}
