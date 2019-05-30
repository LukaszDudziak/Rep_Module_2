package d2.AdvancedOOP;

public class Product {
    private int id;
    private String name;
    private double price;
    static int nextId = 0;

    public Product(String name, double price) {
        this.id = nextId;
        this.name = name;
        this.price = price;
        nextId++;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws Exception {
        if(price<0.01){
            throw new Exception("Gimme more");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

