import java.math.BigDecimal;

public class Beauty extends Product{
    public Beauty (String name, int price, int weight) {
        super(name, BigDecimal.valueOf(price), weight);
    }
}
