package three.encapsulation;
 class car {
     private String brand;
     private String color;
     private  int speed;
     String stop;

     public car(String brand, String colcr, int speed) {
         IO.println("constructor called !");
         this.brand = brand;
         this.color = color;
         this.speed = speed;
     }

     public void drive() {
         IO.println(brand + " is driving at " + speed);
     }

     //Getter and seter
     public int getSpeed() {
         return speed;
     }

     public void setSpeed(int speed) {
         this.speed = speed;
     }
 }
public class EncapsulationDemo {
    static void main() {
        car car1 = new car("tmc","white",120);// creation of object
        car1.drive();

        //car3
        car car3 =new car("hyd","grey",230);
        car3.drive();
    }
}
