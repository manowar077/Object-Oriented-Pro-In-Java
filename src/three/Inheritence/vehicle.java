package three.Inheritence;
//intelize properties and behaviour
public class vehicle {
    private String brand;
    private int speed;

    public vehicle(String brand,int speed) { //constructor
            this.speed = speed;
            this.brand = brand;
        }
//getter
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    //setter
    public void setBrand(String brand) {
        this.brand = brand;
    }
//display
    public void displayInfo(){
        IO.println("Brand :" +brand+ "speed :" +speed);
    }
}
