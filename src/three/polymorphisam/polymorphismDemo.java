package three.polymorphisam;

import three.polymorphisam.bike;
import three.polymorphisam.car;
class calculator {
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
}
public class polymorphismDemo {
    static void main() {
        car car1 =new car("toyota",300);
        car1.displayInfo();

        bike bike1=new bike("hero",300,true);
        bike1.displayInfo();

        car1.start();
        bike1.start();
       // run time polymorphism (method overriding)
        vehicle v1 = new vehicle("vechileBrand",202);
        v1.start();

        vehicle v2= new car("ford",890);
        v2.start();
        vehicle v3 =new bike("bmw",560,true);
        v3.start();


        //compile time polymorphism (method overloading)
        bike1.start(" hello");

        calculator calculator=new calculator();
        IO.println("sum(int) :"+calculator.add(4,5));  //refer int
        IO.println("sum(double) :"+calculator.add(6,7.9)); //refer double

        //...{Method overloading}-->same method name ,diffrent parameter
        //...{Method overiding}-->same method ,diffrent implementation in child class
    }
}

