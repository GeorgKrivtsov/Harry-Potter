package boxOfSweets;
public abstract class Sweets {
    private String name;
    private int weight;
    private int price;
    private int id;

    Sweets (String name, int weight, int price, int id) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
