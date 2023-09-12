import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Harvester harvester = new Harvester("Jeep", "4x4", Color.YELLOW);

        RefuelingStation refuelingStation = new RefuelingStation(); //Заправка
        CarWash carWash = new CarWash(); //Мойка

        harvester.setRefueling(refuelingStation); //Заехали на заправку
        harvester.fuel(); // Заправились
        harvester.setCarWash(carWash); //заехали на мойку
        harvester.wipHeadLights(); //Помыли все части
        harvester.wipWind();
        harvester.wipMirrors();


    }

    public static double calcMaintenance(Car car){
        if(car.getWheelCount() == 6){
            return 1500*6;
        }
        else {
            return 1000*4;
        }
    }
}