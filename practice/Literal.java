import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Literal {

    public byte byteValue = 1;
    protected short shortValue = 1;
    int intValue = 1;
    private long longValue = 1L;
    public float floatValue = 1.0F;
    public double doubleValue = 1.0;

    public String strValue = "1";
    public BigDecimal decimalValue = BigDecimal.ONE;
    public List<String> strList = new ArrayList<>();
    public Map<String , String> strKeyValueMap = new LinkedHashMap<>();
}

class TestLiteral {
    public static void main(String[] args) {
        Literal l = new Literal();
        System.out.println(l.floatValue);
        System.out.println(l.intValue);
        System.out.println(l.shortValue);
    }
}