package OOPs.encapsulation;
  class car {
     private String brand;
     private String color;
     private  int price;
     String stop;

     public car(String brand, String colcr, int speed) {
         IO.println("constructor called !");
         this.brand = brand;
         this.color = color;
         this.price= speed;
     }

     public void drive() {

         IO.println(brand + " is brand ka starting price ye ha " + price);
     }
      //encapsulation-> Change through function
     //Getter and seter
     public int getSpeed() {

         return price;
     }
     public void setPrice(int price) throws Exception {
         if(price<0){
            throw new Exception("Baklol price kabhi negative hota !");
         }
         this.price=price;
     }

     public void setSpeed(int speed) {

         this.price = speed;
     }
     public void setBrand(int brand){
         this.brand="BMW";
     }
     public void setColor(int color){
         this.color="yellow";
     }

 }
public class   EncapsulationDemo {
    static void main() {
        car car1 = new car("tmc","white",120);// creation of object
        car1.drive();

        //car3
        car car3 =new car("hyd","grey",230);
        car3.drive();
    }
}
