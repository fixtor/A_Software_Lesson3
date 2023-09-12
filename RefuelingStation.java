public class RefuelingStation implements Refueling{
    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType){
            case Diesel -> System.out.println("Diesel...");
            case Gasoline -> System.out.println("Gasoline...");
        }
    }
}
