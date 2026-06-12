package three.classesdemo;

public class ClassesObjectDemo {
    static void main() {
        car car1 = new car();// creation of object
        car1.speed=100;   //instance variable
        car1.brand= "Tata";
        car1.color="red";
        car1.drive();

        //car3
        car car3 =new car();
        car3.brand="byd";
        car3.speed=300;
        car3.color="white";
        car3.drive();
    }
}
