package boxOfSweets;

public class Cookies extends Sweets {

    Cookies(String name, int weight, int price, int id) {
        super(name, weight, price, id);
    }

    @Override
    public String toString() {
        return "Cookies{" +
                "weight=" + getWeight() +
                ", price=" + getPrice() +
                ", id=" + getId() +
                '}';
    }
}
