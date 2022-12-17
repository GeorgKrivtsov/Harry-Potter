package boxOfSweets;

public class Cookies extends Sweets {
    private int count;
    Cookies(String name, int weight, int price, int count) {
        super(name, weight, price);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Cookies{" +
                "weight=" + getWeight() +
                ", price=" + getPrice() +
                ", count= " + getCount() +
                '}';
    }
}
