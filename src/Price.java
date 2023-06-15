
import java.util.Iterator;

public class Price extends HotDrinks implements Comparable<Price> {
    private final Long price;

    public Price(String name, int volume, Long price) {
        super(name, volume);
        this.price = price;
    }

    @Override
    public int compareTo(Price o) {
        return this.price.compareTo(o.price);
    }

    public Long getPrice() {
        return price;
    }

}
