package three.constructor;

import three.constructor.car;

public class constructorDemo {
    static void main() {
        car car1 = new car("tmc","white",120);// creation of object
//        car1.speed=100;   //instance variable
//        car1.brand= "Tata";
//        car1.color="red";
        car1.drive();

        //car3
        car car3 =new car("hyd","grey",230);
//        car3.brand="byd";
//        car3.speed=300;
//        car3.color="white";
        car3.drive();
//      accept the value from geter
        IO.println( car3.getSpeed());
        car3.setSpeed(566);
    }
}
