import java.awt.*;

public class SportCar extends Car implements Wiping, Fueling{
    public SportCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelCount(3);
    }

    private Refueling refueling;
    @Override
    public void movement() {

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

    @Override
    public void fuel() {
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }

    @Override
    public void wipWind() {

    }

    @Override
    public void wipHeadLights() {

    }

    @Override
    public void wipMirrors() {

    }
}
