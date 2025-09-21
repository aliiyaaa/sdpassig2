package toys;

public class DollToy implements Toy {
    private final String name = "Кукла";
    private final int price = 2000;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public void display() {
        System.out.println("\nToy: " + name + " | Price: " + price);
    }
}

