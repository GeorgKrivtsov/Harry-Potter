package boxOfSweets;

public class Chocolate extends Sweets{

    private double contentChoco;

    Chocolate(String name, int weight, int price, int count) {
        super(name, weight, price);
        this.contentChoco = count;
    }

    public double getContentChoco() {
        return contentChoco;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "weight=" + getWeight() +
                ", price=" + getPrice() +
                ", contentChoco=" + getContentChoco()+"% " +
                '}';
    }
}
