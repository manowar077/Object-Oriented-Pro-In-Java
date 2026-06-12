package three.interfaces;

public class electicCar implements carcontrols {

    @Override
    public void turnRight() {
        IO.println("electric right");
    }

    @Override
    public void turnleft() {
        IO.println("electric left");
    }

    @Override
    public void applyBrakes() {
        IO.println("electric break");

    }
}
