package factory;

import toys.CarToy;
import toys.Toy;
import packaging.BoxPackaging;
import packaging.Packaging;

public class CarToyFactory implements ToyFactory {
    @Override
    public Toy createToy() {
        return new CarToy();
    }

    @Override
    public Packaging createPackaging() {
        return new BoxPackaging();
    }
}

