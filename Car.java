import java.awt.*;

public abstract class Car {
 //region Constr

 public Car(String make, String model, Color color) {
  this.make = make;
  this.model = model;
  this.color = color;
 }

 //endregion

 //region Public Methods
 public abstract void movement();
 public abstract void maintenance();
 public abstract void gearShifting();
 public abstract void switchHeadLights();
 public abstract void switchWipers();
 //endregion
 public boolean switchFogLights(){
  fogLights = !fogLights;
  return fogLights;
 }

    public int getWheelCount() {
        return wheelCount;
    }

    //region private fields
    private String make;

    private String model;

    private Color color;

    protected CarType carType;

    private int wheelCount;

    protected FuelType fuelType;

    private Shift shift;

    private double engineCapacity;
    private boolean fogLights;

    protected void setWheelCount(int wheelCount){
     this.wheelCount = wheelCount;
    }

    //endregion




}
