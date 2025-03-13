import java.math.BigDecimal;

public class Product implements Promotion {
    private final String name;
    private final BigDecimal price;
    private final int weight;

    public Product (String name, BigDecimal price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public BigDecimal getPrice(){
        return this.price;
    }

    public int getWeight(){
        return this.weight;
    }

    public BigDecimal getDiscountAmount() {
        BigDecimal discountAmount;

        discountAmount = BigDecimal.valueOf( switch (this.name) {
            case "grocery" -> 2000;
            case "beauty" -> 10000;
            default -> 0;
        });

        return discountAmount;
    }
}
