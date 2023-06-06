public class TempDrink extends HotDrinks {
    private final int temperature;

    public TempDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
