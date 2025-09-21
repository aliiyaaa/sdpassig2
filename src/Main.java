import factory.*;
import toys.Toy;
import packaging.Packaging;

public class Main {
    public static void main(String[] args) {
        ToyFactory carFactory = new CarToyFactory();
        Toy car = carFactory.createToy();
        Packaging carBox = carFactory.createPackaging();
        car.display();
        carBox.pack();
        ToyFactory dollFactory = new DollToyFactory();
        Toy doll = dollFactory.createToy();
        Packaging dollGift = dollFactory.createPackaging();
        doll.display();
        dollGift.pack();
    }
}
