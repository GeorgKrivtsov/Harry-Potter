package boxOfSweets;

public class Candies extends Sweets {

    Candies(String name, int weight, int price, int id) {
        super(name, weight, price, id);
    }

    @Override
    public String toString() {
        return "Candies{" +
                "weight=" + getWeight() +
                ", price=" + getPrice() +
                ", id=" + getId() +
                '}';
    }
}
