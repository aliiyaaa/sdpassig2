package factory;

import toys.Toy;
import packaging.Packaging;

public interface ToyFactory {
    Toy createToy();
    Packaging createPackaging();
}

