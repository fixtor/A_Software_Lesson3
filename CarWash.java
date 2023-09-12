public class CarWash implements Wiping{
    @Override
    public void wipWind() {
        System.out.println("Мойка окон");
    }

    @Override
    public void wipHeadLights() {
        System.out.println("Мойка фар");
    }

    @Override
    public void wipMirrors() {
        System.out.println("Мойка зеркал");
    }
}
