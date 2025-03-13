public class Cart{
    Product[] products;

    public Cart (Product[] products) {
        this.products = products;
    }

    int calculateDeliveryCharge() {
        int totalWeight = 0;
        int totalPrice = 0;

        int deliveryDiscount;
        int deliveryCharge;

        for (int i=0; i<products.length; i++) {
            totalWeight = totalWeight + products[i].getWeight();
            totalPrice = totalPrice + products[i].getPrice() - products[i].getDiscountAmount();
        }

        if (totalWeight < 3) {
            deliveryCharge = 1000;
        } else if (totalWeight < 10) {
            deliveryCharge = 5000;
        } else {
            deliveryCharge = 10000;
        }

        if (totalPrice < 30000) {
            deliveryDiscount = 0;
        } else if (totalPrice < 100000) {
            deliveryDiscount = 1000;
        } else {
            deliveryDiscount = deliveryCharge;
        }

        deliveryCharge = deliveryCharge - deliveryDiscount;

        return deliveryCharge;
    }
}
