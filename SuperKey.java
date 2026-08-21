class Car{
    int speed;
    public Car(int eng_speed){
        this.speed = eng_speed;
    }
}
class BMW extends Car{
    public BMW(int speed){
        super(speed);
    }

}
public class SuperKey {
    public static void main(String[] args) {
        Car car = new BMW(100);

        System.out.println(car.speed);
    }    
}
