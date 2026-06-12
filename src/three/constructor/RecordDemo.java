package three.constructor;
record Bike(String brand, int speed){}
public class RecordDemo {
    static void main() {
        // Record provide -(geter,constructor,and two string method)
        Bike bike = new Bike("Bmw",220);

        IO.println("Brand :" + bike.brand());
        IO.println("Speed :" + bike.speed());
        IO.println(bike );
    }
}
