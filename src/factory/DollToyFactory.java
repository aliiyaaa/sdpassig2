package factory;

import toys.DollToy;
import toys.Toy;
import packaging.GiftPackaging;
import packaging.Packaging;

public class DollToyFactory implements ToyFactory {
    @Override
    public Toy createToy() {
        return new DollToy();
    }

    @Override
    public Packaging createPackaging() {
        return new GiftPackaging();
    }
}
