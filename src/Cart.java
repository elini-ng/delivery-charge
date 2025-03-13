import java.math.BigDecimal;

public class Cart{
    Product[] products;

    public Cart (Product[] products) {
        this.products = products;
    }

    BigDecimal calculateDeliveryCharge() {
        int totalWeight = 0;
        BigDecimal totalPrice = new BigDecimal(0);

        BigDecimal deliveryDiscount;
        BigDecimal deliveryCharge;

        for (Product product : products) {
            totalWeight = totalWeight + product.getWeight();
            totalPrice = totalPrice.add(product.getPrice())
                        .subtract(product.getDiscountAmount());
        }

        if (totalWeight < 3) {
            deliveryCharge = BigDecimal.valueOf(1000);
        } else if (totalWeight < 10) {
            deliveryCharge = BigDecimal.valueOf(5000);
        } else {
            deliveryCharge = BigDecimal.valueOf(10000);
        }

        if (totalPrice.compareTo(BigDecimal.valueOf(30000)) < 0) {
            deliveryDiscount = BigDecimal.valueOf(0);
        } else if (totalPrice.compareTo(BigDecimal.valueOf(100000)) < 0) {
            deliveryDiscount = BigDecimal.valueOf(1000);
        } else {
            deliveryDiscount = deliveryCharge;
        }

        deliveryCharge = deliveryCharge.subtract(deliveryDiscount);

        return deliveryCharge;
    }
}
