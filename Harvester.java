import java.awt.*;

public class Harvester extends Car implements Fueling, Wiping{

    private Refueling refueling;
    private Wiping wiping;
    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelCount(6);
    }

    public void setRefueling(Refueling refueling) {
        this.refueling = refueling;
    }
    public void setCarWash(Wiping wiping) {this.wiping = wiping; }

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

    public void sweeping(){
        System.out.println("Sweep street");
    }

    @Override
    public void fuel() {
        if (refueling == null){
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
