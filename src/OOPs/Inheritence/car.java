package OOPs.Inheritence;

public class car extends vehicle {

    public car(String brand,int speed){
        super(brand,speed);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        IO.println("Brand :" +getBrand() + "speed :" +getSpeed());
    }
}
