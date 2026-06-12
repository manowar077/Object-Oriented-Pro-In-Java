package three.constructor;

public class car {
        String brand;
        String color;
        int speed;
        String stop;

        public car (String brand,String colcr,int speed){
            IO.println("constructor called !");
            this.brand=brand;
            this.color=color;
            this.speed=speed;
        }
        public void drive(){
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
