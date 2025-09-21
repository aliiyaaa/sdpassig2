package packaging;

public class BoxPackaging implements Packaging {
    @Override
    public void pack() {
        System.out.println("Упаковано в обычную коробку");
    }
}

