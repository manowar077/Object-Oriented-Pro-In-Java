package three.polymorphisam;

import three.polymorphisam.vehicle;

public class bike extends vehicle {
    private boolean hascarrier;

    public bike(String brand,int speed,boolean hascarrier){
        super(brand,speed);
        this.hascarrier=hascarrier;
    }
    @Override
    public void start(){
        IO.println("starting bike");
    }
    public void start(String greet){
        IO.println("starting bike" + greet);
    }


    public boolean isHascarrier() {
        return hascarrier;
    }

    public void setHascarrier(boolean hascarrier) {
        this.hascarrier = hascarrier;
    }
}
