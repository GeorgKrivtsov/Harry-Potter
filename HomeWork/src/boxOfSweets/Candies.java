package boxOfSweets;

public class Candies extends Sweets {
    private String type;
    Candies(String name, int weight, int price, String type ){

        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Candies{" +
                "weight=" + getWeight() +
                ", price=" + getPrice() +
                ", type=" + getType() +
                '}';
    }
}
