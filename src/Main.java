import java.util.*;

public class Main {
    private static Comparator<? super Price> getPrice;

    public static void main(String[] args) {

        HotDrinks hotDrinks1 = new HotDrinks("Americano", 150);
        HotDrinks hotDrinks2 = new HotDrinks("Americano", 250);

        TempDrink tempDrink1 = new TempDrink("Americano", 150, 70);
        TempDrink tempDrink2 = new TempDrink("Americano", 150, 90);
        TempDrink tempDrink3 = new TempDrink("Americano", 250, 70);
        TempDrink tempDrink4 = new TempDrink("Americano", 250, 90);

        Price price1 = new Price("Americano", 150, 100L);
        Price price2 = new Price("Americano", 250, 140L);
        Set<HotDrinks> hotDrinks = new HashSet<>();

        hotDrinks.add(hotDrinks1);
        hotDrinks.add(hotDrinks2);

        List<TempDrink> tempDrinks = new ArrayList<>();

        tempDrinks.add(tempDrink1);
        tempDrinks.add(tempDrink1);
        tempDrinks.add(tempDrink1);
        tempDrinks.add(tempDrink1);

        List<Price> prices = new ArrayList<>();
        prices.add(price1);
        prices.add(price2);

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название напитка: ");
            String n = scanner.nextLine();
            System.out.println("Введите объём напитка: ");
            int v = Integer.parseInt(scanner.nextLine());

            for (HotDrinks hotDrink: hotDrinks) {
                if (hotDrink.getName().equals(n)) {
                    if (hotDrink.getVolume() == v) {
                        System.out.println("Ваш напиток " + hotDrink);
                        System.out.println("Введите температуру напитка: ");
                        int t = Integer.parseInt(scanner.nextLine());
                        for (TempDrink tempDrink : tempDrinks) {
                            if (tempDrink.getName().equals(n)) {
                                if (tempDrink.getVolume() == v) {
                                    if (tempDrink.getTemperature() == t) {
                                        System.out.println("Возмите ваш напиток " + tempDrink + "мл " + t + "`C");
                                        System.out.println(getPrice);
                                    } else {
                                        System.out.println("Такого напитка нет!");
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    }
                } else {
                    System.out.println("Такого напитка нет!");
                }
            }
        } catch (NumberFormatException var16) {
            var16.printStackTrace();
        }
    }
}