package toys;

public class CarToy implements Toy {
    private final String name = "Игрушечная машинка";
    private final int price = 1500;

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
        System.out.println("Toy: " + name + " | Price: " + price);
    }
}

