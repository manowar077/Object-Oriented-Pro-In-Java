package ExceptionHandaling;

class car {

    private String brand;
    private String color;
    private int price;

    // Constructor
    public car(String brand, String color, int price) {

        System.out.println("Constructor called!");

        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    // Display method
    public void drive() {
        System.out.println(
                brand + " is brand ka starting price ye hai " + price
        );
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    // Setter with exception handling
    public void setPrice(int price) {
        try{
            if (price < 0) {
            throw new Exception("Price kabhi negative nahi hota!");
        }
            this.price=price;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            IO.println("Always executed");
        }


        this.price = price;
    }

    // Other setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


// Main class
public class exceptiondemo {

    public static void main(String[] args) {

        // First object
        car car1 = new car("BMW", "White", 120);
        car1.drive();

        System.out.println("------------------");

        // Second object
        car car3 = new car("Hyundai", "Grey", 230);
        car3.drive();

        System.out.println("------------------");


        // Negative price
        car1.setPrice(-500);



        System.out.println("------------------");

        System.out.println("Car Brand: " + car1.getBrand());
        System.out.println("Car Color: " + car1.getColor());
        System.out.println("Car Price: " + car1.getPrice());
    }
}