 class Bike extends Vehicle {
    void drive(){
        System.out.println("bike racing");
    }

    
}
public class main{
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.drive();
    }
}
