package three.polymorphisam;

import three.polymorphisam.vehicle;

public class car extends vehicle {
    private int doors;

    public car(String brand,int speed){
        super(brand,speed);
    }
    @Override
    public void start(){
        IO.println("starting car ");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        IO.println("Brand :" +getBrand() + "speed :" +getSpeed());
    }
}
