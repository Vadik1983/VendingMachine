public class HotDrinks {
    private String name;
    private int volume;

    public HotDrinks(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", " + volume;
    }
}
