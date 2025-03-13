public class Product implements Promotion {
    private final String name;
    private final int price;
    private final int weight;

    public Product (String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public int getPrice(){
        return this.price;
    }

    public int getWeight(){
        return this.weight;
    }

    public Integer getDiscountAmount() {
        int discountAmount = 0;

        if (this.name.equals("grocery")) {
            discountAmount = 2000;
        } else if (this.name.equals("beauty")) {
            discountAmount = 10000;
        }

        return discountAmount;
    }
}
