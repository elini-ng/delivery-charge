import java.math.BigDecimal;

public class LargeAppliance extends Product{
    public LargeAppliance (String name, int price, int weight)
    {
        super(name, BigDecimal.valueOf(price), weight);
    }
}
