// if you declare abstract method in class so class must have abstract class.
// we can not create object of abstract class
// if we extend the abstract class all abstract methond should be implemented in it.

abstract class Car{ 
    public abstract void drive();    

    public void playMusic(){
        System.out.println("Play Music");
    }
}

class WagonR extends Car{

    @Override
    public void drive() {
        System.out.println("Driving");
    }

}


public class AbstracKeyword {
    public static void main(String[] args) {

        WagonR wagonR = new WagonR();
        wagonR.drive();
    }
}
