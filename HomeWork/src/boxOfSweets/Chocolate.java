package boxOfSweets;

public class Chocolate extends Sweets{

    Chocolate(String name, int weight, int price, int id) {
        super(name, weight, price, id);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "weight=" + getWeight() +
                ", price=" + getPrice() +
                ", id=" + getId() +
                '}';
    }
}
