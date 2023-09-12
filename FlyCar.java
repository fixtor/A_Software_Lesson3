import java.awt.*;

public class FlyCar extends Car{


    public FlyCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelCount(4);
    }

    public void fly() {
        System.out.println("Fly!!!");
    }

    @Override
    public void movement() {
        fly();
    }

    @Override
    public void maintenance() {

    }

    @Override
    public void gearShifting() {

    }

    @Override
    public void switchHeadLights() {

    }

    @Override
    public void switchWipers() {

    }
}
